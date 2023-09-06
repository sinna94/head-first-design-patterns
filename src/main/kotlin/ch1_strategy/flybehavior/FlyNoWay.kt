package ch1_strategy.flybehavior

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("못 날아요")
    }
}