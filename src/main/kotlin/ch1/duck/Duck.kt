package ch1

abstract class Duck {
    open lateinit var quackBehavior: QuackBehavior
    open lateinit var flyBehavior: FlyBehavior

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