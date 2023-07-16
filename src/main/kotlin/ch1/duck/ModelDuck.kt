package ch1.duck

import ch1.flybehavior.FlyNoWay
import ch1.quackbehavior.Quack

class ModelDuck: Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("모형 오리")
    }
}