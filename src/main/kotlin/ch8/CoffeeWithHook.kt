package ch8

import java.util.*

class CoffeeWithHook : CaffeineBeverageWithHook() {

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()

        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    private fun getUserInput(): String {
        println("Would you like milk and sugar with your coffee (y/n)? ")

        return readlnOrNull() ?: "no"
    }
}
