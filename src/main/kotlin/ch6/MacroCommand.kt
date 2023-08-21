package ch6

class MacroCommand (
    private val commands: List<Command>
) : Command {

    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.reversed().forEach { it.undo() }
    }
}