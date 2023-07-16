package ch1

class MallardDuck(
    override var flyBehavior: FlyBehavior = FlyWithWings(),
    override var quackBehavior: QuackBehavior = Quack()
) : Duck() {
    override fun display() {
        println("청둥오리")
    }
}