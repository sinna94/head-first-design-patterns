package ch1_strategy.duck

import ch1_strategy.flybehavior.FlyNoWay
import ch1_strategy.quackbehavior.Quack

class ModelDuck: Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("모형 오리")
    }
}