package ch7.adapter

class TurkeyAdapter(
    private val turkey: Turkey
) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        repeat(5) {
            turkey.fly()
        }
    }
}