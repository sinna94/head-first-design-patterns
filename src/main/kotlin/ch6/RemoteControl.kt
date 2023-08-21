package ch6

class RemoteControl {
    private val onCommands = mutableListOf<Command>()
    private val offCommands = mutableListOf<Command>()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands.add(slot, onCommand)
        offCommands.add(slot, offCommand)
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in 0 until onCommands.size) {
            stringBuff.append("[slot $i] ${onCommands[i].javaClass.name}    ${offCommands[i].javaClass.name}\n")
        }
        return stringBuff.toString()
    }
}