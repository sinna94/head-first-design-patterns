package ch3

import java.math.BigDecimal

class Mocha(
    beverage: Beverage
) : CondimentDecorator(beverage) {

    companion object{
        val COST = BigDecimal("0.20")
    }

    override val description: String
        get() = "${beverage.description}, 모카"

    override fun cost(): BigDecimal {
        return beverage.cost() + COST
    }
}