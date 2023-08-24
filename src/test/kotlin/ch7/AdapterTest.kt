package ch7

import ch7.adapter.Duck
import ch7.adapter.MallardDuck
import ch7.adapter.TurkeyAdapter
import ch7.adapter.WildTurkey
import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun duckAdapterTest(){
        val duck = MallardDuck()
        val turkey = WildTurkey()
        val turkeyAdapter = TurkeyAdapter(turkey)

        println("칠면조가 말하길")
        turkey.gobble()
        turkey.fly()

        println("오리가 말하길")
        testDuck(duck)

        println("칠면조 어댑터가 말하길")
        testDuck(turkeyAdapter)
    }

    private fun testDuck(duck: Duck) {
        duck.quack()
        duck.fly()
    }
}