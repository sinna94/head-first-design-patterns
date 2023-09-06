package ch1_strategy

import ch1_strategy.duck.Duck
import ch1_strategy.duck.MallardDuck
import ch1_strategy.duck.ModelDuck
import ch1_strategy.flybehavior.FlyRocketPowered
import org.junit.jupiter.api.Test

class MiniDuckSimulator {

    @Test
    fun mallardDuck() {
        val mallard: Duck = MallardDuck()
        mallard.performQuack() // 꽥
        mallard.performFly() // 날아가요
    }

    @Test
    fun modelDuck() {
        val model: Duck = ModelDuck()
        model.performFly()  // 못 날아요
        model.flyBehavior = FlyRocketPowered()
        model.performFly() // 로켓으로 날아가요
    }
}