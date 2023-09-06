package ch1_strategy.duck

import ch1_strategy.flybehavior.FlyWithWings
import ch1_strategy.quackbehavior.Quack

class MallardDuck : Duck() {

    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("청둥오리")
    }
}