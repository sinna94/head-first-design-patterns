package ch6

import kotlin.test.Test

class RemoteControlTest {

    @Test
    fun test() {
        val remoteControl = SimpleRemoteControl()
        val light = Light("Living Room")
        val lightOnCommand = LightOnCommand(light)

        remoteControl.setCommand(lightOnCommand)
        remoteControl.buttonWasPressed()
    }

    @Test
    fun remoteControlTest() {
        val remoteControl = RemoteControl()

        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val stereo = Stereo("Living Room")

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)
        val stereoOn = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
        remoteControl.setCommand(2, stereoOn, stereoOff)

        println(remoteControl)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(1)
        remoteControl.offButtonWasPushed(1)
        remoteControl.onButtonWasPushed(2)
        remoteControl.offButtonWasPushed(2)
    }

    @Test
    fun remoteControlWithUndoTest(){
        val remoteControl = RemoteControlWithUndo()

        Light("Living Room").also {
            remoteControl.setCommand(0, LightOnCommand(it), LightOffCommand(it))
        }

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
    }

    @Test
    fun ceillingFanTest(){
        val remoteControl = RemoteControlWithUndo()

        CeillingFan("Living Room").also {
            remoteControl.setCommand(0, CeillingFanHighCommand(it), CeillingFanOffCommand(it))
            remoteControl.setCommand(1, CeillingFanMediumCommand(it), CeillingFanOffCommand(it))
            remoteControl.setCommand(2, CeillingFanLowCommand(it), CeillingFanOffCommand(it))
        }

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()

        remoteControl.onButtonWasPushed(1)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
    }

    @Test
    fun macroTest(){
        val remoteControl = RemoteControlWithUndo()

        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val ceilingFan = CeillingFan("Living Room")
        val stereo = Stereo("Living Room")

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)
        val ceilingFanOn = CeillingFanHighCommand(ceilingFan)
        val ceilingFanOff = CeillingFanOffCommand(ceilingFan)
        val stereoOnWithCD = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        val partyOn = listOf(livingRoomLightOn, kitchenLightOn, ceilingFanOn, stereoOnWithCD)
        val partyOff = listOf(livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff)

        val partyOnMacro = MacroCommand(partyOn)
        val partyOffMacro = MacroCommand(partyOff)

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro)

        println(remoteControl)
        println("--- Pushing Macro On---")
        remoteControl.onButtonWasPushed(0)
        println("--- Pushing Macro Off---")
        remoteControl.offButtonWasPushed(0)
    }
}