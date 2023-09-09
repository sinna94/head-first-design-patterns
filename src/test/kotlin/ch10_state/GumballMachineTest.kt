package ch10_state

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GumballMachineTest {
    @Test
    fun test() {
        val gumballMachine = GumballMachine(5)

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)
        gumballMachine.insertQuarter()
        gumballMachine.ejectQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.ejectQuarter()

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)
    }
}