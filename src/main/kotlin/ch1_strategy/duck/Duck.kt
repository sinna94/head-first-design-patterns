package ch1_strategy.duck

import ch1_strategy.flybehavior.FlyBehavior
import ch1_strategy.quackbehavior.QuackBehavior

abstract class Duck {
    protected lateinit var quackBehavior: QuackBehavior
    lateinit var flyBehavior: FlyBehavior

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun swim() {
        println("오리는 물에 뜬다")
    }
}