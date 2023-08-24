package ch7.facade


class Amplifier(var description: String) {
    var tuner: Tuner? = null
        set(value) {
            println("$description setting tuner to $value")
            field = value
        }
    var player: StreamingPlayer? = null
        set(value) {
            println("$description setting Streaming player to $value")
            field = value
        }
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setStereoSound() {
        println("$description stereo mode on")
    }

    fun setSurroundSound() {
        println("$description surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("$description setting volume to $level")
    }

    override fun toString(): String {
        return description
    }
}

