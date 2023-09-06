package ch6_command

interface Command {
    fun execute()
    fun undo()
}