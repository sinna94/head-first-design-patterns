package ch3

import java.math.BigDecimal

class Milk(
    beverage: Beverage
) : CondimentDecorator(beverage) {

    companion object{
        val COST = BigDecimal("0.10")
    }

    override val description: String
        get() = "${beverage.description}, 우유"

    override fun cost(): BigDecimal {
        return beverage.cost() + COST
    }
}