package ch7.adapter

class MallardDuck : Duck {
    override fun quack() {
        println("꽥")
    }

    override fun fly() {
        println("날고 있어요")
    }
}