package ch8

import org.junit.jupiter.api.Test
import java.util.*

class DuckTestDrive {
    @Test
    fun test(){
        val ducks = arrayOf(
            Duck("Daffy", 8),
            Duck("Dewey", 2),
            Duck("Howard", 7),
            Duck("Louie", 2),
            Duck("Donald", 10),
            Duck("Huey", 2)
        )

        println("Before sorting:")
        display(ducks)

        Arrays.sort(ducks)

        println("\nAfter sorting:")
        display(ducks)
    }

    private fun display(ducks: Array<Duck>) = ducks.forEach(::println)

    @Test
    fun StringListTest(){
        val ducks = arrayOf(
            "Daffy",
            "Dewey",
            "Howard",
            "Louie",
            "Donald",
            "Huey"
        )
        val ducksList = MyStringList(ducks)
        val duckSubList = ducksList.subList(2, 3)
        println(duckSubList)
    }
}