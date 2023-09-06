package ch6_command

class SimpleRemoteControl {
    private lateinit var slot: Command

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot.execute()
    }
}