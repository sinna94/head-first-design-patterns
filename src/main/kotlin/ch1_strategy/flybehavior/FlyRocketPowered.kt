package ch1_strategy.flybehavior

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        println("로켓으로 날아가요")
    }
}