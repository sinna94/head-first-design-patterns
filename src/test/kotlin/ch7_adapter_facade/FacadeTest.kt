package ch7_adapter_facade

import ch7_adapter_facade.facade.*
import org.junit.jupiter.api.Test

class FacadeTest {
    @Test
    fun test() {
        val amp = Amplifier("Top-O-Line Amplifier")
        val tuner = Tuner("Top-O-Line AM/FM Tuner", amp)
        val player = StreamingPlayer("Top-O-Line Streaming Player", amp)
        val projector = Projector("Top-O-Line Projector", player)
        val lights = TheaterLights("Theater Ceiling Lights")
        val screen = Screen("Theater Screen")
        val popper = PopcornPopper("Popcorn Popper")

        val homeTheater = HomeTheaterFacade(
            amp,
            tuner,
            player,
            projector,
            lights,
            screen,
            popper
        )
        homeTheater.watchMovie("Raiders of the Lost Ark")
        homeTheater.endMovie()
    }

}