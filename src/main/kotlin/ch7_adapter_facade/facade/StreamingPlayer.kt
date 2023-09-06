package ch7_adapter_facade.facade


class StreamingPlayer(var description: String, var amplifier: Amplifier) {
    var currentChapter = 0
    var movie: String? = null
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun play(movie: String) {
        this.movie = movie
        currentChapter = 0
        println("$description playing \"$movie\"")
    }

    fun play(chapter: Int) {
        if (movie == null) {
            println("$description can't play chapter $chapter no movie selected")
        } else {
            currentChapter = chapter
            println("$description playing chapter $currentChapter of \"$movie\"")
        }
    }

    fun stop() {
        currentChapter = 0
        println("$description stopped \"$movie\"")
    }

    fun pause() {
        println("$description paused \"$movie\"")
    }

    fun setTwoChannelAudio() {
        println("$description set two channel audio")
    }

    fun setSurroundAudio() {
        println("$description set surround audio")
    }

    override fun toString(): String {
        return description
    }
}