package ch3

import java.math.BigDecimal

class Decaf : Beverage() {
    override var description: String = "디카페인"

    override fun cost(): BigDecimal {
        return BigDecimal("1.05")
    }
}
