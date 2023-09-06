package ch6_command

class LightOffCommand(
    private val light: Light
): Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}