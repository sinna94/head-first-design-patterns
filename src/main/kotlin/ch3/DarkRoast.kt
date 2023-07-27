package ch3

import java.math.BigDecimal

class DarkRoast: Beverage() {
    override var description: String = "다크 로스트 커피"

    override fun cost(): BigDecimal {
        return BigDecimal("0.99")
    }
}