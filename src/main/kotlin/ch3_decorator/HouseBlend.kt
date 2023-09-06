package ch3_decorator

import java.math.BigDecimal

class HouseBlend : Beverage() {
    override var description: String = "하우스 블렌드 커피"

    override fun cost(): BigDecimal {
        return BigDecimal("0.89")
    }
}
