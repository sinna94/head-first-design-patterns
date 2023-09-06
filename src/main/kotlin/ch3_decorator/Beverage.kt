package ch3_decorator

import java.math.BigDecimal

abstract class Beverage {
    open val description: String = "제목 없음"

    abstract fun cost(): BigDecimal
}