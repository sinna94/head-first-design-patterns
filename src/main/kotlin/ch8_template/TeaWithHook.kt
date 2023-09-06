package ch8_template

import java.util.*

class TeaWithHook: CaffeineBeverageWithHook() {

    fun steepTeaBag() {
        println("Steeping the tea")
    }

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    private fun getUserInput(): String {
        println("Would you like lemon with your tea (y/n)? ")
        return readlnOrNull() ?: "no"
    }
}
