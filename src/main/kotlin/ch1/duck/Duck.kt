package ch1.duck

import ch1.flybehavior.FlyBehavior
import ch1.quackbehavior.QuackBehavior

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