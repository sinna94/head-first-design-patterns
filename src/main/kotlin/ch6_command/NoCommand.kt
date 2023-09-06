package ch6_command

class NoCommand: Command {
    override fun execute() {
        // do nothing
    }

    override fun undo() {
        // do nothing
    }
}