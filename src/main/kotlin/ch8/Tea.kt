package ch8

class Tea: CaffeineBeverage() {

    fun steepTeaBag() {
        println("Steeping the tea")
    }

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }
}
