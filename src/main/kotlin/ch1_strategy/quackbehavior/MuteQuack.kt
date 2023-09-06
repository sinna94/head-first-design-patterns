package ch1_strategy.quackbehavior

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("조용~")
    }
}
