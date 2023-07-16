package ch1.duck

import ch1.flybehavior.FlyWithWings
import ch1.quackbehavior.Quack

class MallardDuck : Duck() {

    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("청둥오리")
    }
}