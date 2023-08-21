package ch6

class NoCommand: Command {
    override fun execute() {
        // do nothing
    }

    override fun undo() {
        // do nothing
    }
}