package ch3

import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.test.assertEquals

class StarbuzzCoffee {

    @Test
    fun costTest() {
        val beverage = Espresso()
        assertEquals("에스프레소", beverage.description)
        assertEquals(BigDecimal("1.99"), beverage.cost())

        var beverage2: Beverage = DarkRoast()
        beverage2 = Mocha(beverage2)
        beverage2 = Mocha(beverage2)
        beverage2 = Whip(beverage2)
        assertEquals("다크 로스트 커피, 모카, 모카, 휘핑 크림", beverage2.description)
        assertEquals(BigDecimal("1.49"), beverage2.cost())

        var beverage3: Beverage = HouseBlend()
        beverage3 = SoyMilk(beverage3)
        beverage3 = Mocha(beverage3)
        beverage3 = Whip(beverage3)
        assertEquals("하우스 블렌드 커피, 두유, 모카, 휘핑 크림", beverage3.description)
        assertEquals(BigDecimal("1.34"), beverage3.cost())
    }
}
