package ch3

import java.math.BigDecimal

class Espresso : Beverage() {
    override var description: String = "에스프레소"

    override fun cost(): BigDecimal {
        return BigDecimal("1.99")
    }
}
