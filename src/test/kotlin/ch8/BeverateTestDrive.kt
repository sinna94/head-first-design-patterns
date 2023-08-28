package ch8

import org.junit.jupiter.api.Test

class BeverateTestDrive {

    @Test
    fun test() {
        val tea = TeaWithHook()
        val coffee = CoffeeWithHook()

        println("\n차 준비중...")
        tea.prepareRecipe()

        println("\n커피 준비중...")
        coffee.prepareRecipe()
    }
}