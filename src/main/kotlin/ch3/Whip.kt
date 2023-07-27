package ch3

import java.math.BigDecimal

class Whip(
    beverage: Beverage
) : CondimentDecorator(beverage) {

    companion object{
        val COST = BigDecimal("0.10")
    }

    override val description: String
        get() = "${beverage.description}, 휘핑 크림"

    override fun cost(): BigDecimal {
        return beverage.cost() + COST
    }
}