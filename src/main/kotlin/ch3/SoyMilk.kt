package ch3

import java.math.BigDecimal

class SoyMilk(
    beverage: Beverage
) : CondimentDecorator(beverage) {

    companion object{
        val COST = BigDecimal("0.15")
    }

    override val description: String
        get() = "${beverage.description}, 두유"

    override fun cost(): BigDecimal {
        return beverage.cost() + COST
    }
}