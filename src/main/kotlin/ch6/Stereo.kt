package ch6

class Stereo(
    private val location: String
) {

    fun on() {
        println("$location Stereo is on")
    }

    fun off() {
        println("$location Stereo is off")
    }

    fun setCD() {
        println("$location Stereo is set for CD input")
    }

    fun setVolume(volume: Int) {
        println("$location Stereo volume set to $volume")
    }
}
