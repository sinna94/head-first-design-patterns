package ch6_command

class RemoteControlWithUndo {
    private val onCommands = mutableListOf<Command>()
    private val offCommands = mutableListOf<Command>()
    private var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands.add(slot, onCommand)
        offCommands.add(slot, offCommand)
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in 0 until onCommands.size) {
            stringBuff.append("[slot $i] ${onCommands[i].javaClass.name}    ${offCommands[i].javaClass.name}\n")
            stringBuff.append("[undo] ${undoCommand.javaClass.name}\n")
        }
        return stringBuff.toString()
    }
}