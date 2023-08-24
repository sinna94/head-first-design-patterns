package ch7.facade

class HomeTheaterFacade(
    private val amp: Amplifier,
    private val tuner: Tuner,
    private val player: StreamingPlayer,
    private val projector: Projector,
    private val lights: TheaterLights,
    private val screen: Screen,
    private val popper: PopcornPopper
) {
    fun watchMovie(movie: String){
        println("영화를 시작합니다.")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.player = player
        amp.setSurroundSound()
        amp.setVolume(5)
        player.on()
        player.play(movie)
    }

    fun endMovie(){
        println("영화를 종료합니다.")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        player.stop()
        player.off()
    }
}
