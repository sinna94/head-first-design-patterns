package ch6

class StereoOffCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}