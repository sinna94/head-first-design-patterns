package ch8_template

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
