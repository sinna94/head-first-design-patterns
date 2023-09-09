package ch10_state

import kotlin.random.Random

class HasQuarterState(
    private val gumballMachine: GumballMachine
) : State {

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.setState(gumballMachine.noQuarterState)
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = (0..9).random() == 0
        if (winner && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.winnerState)
        } else {
            gumballMachine.setState(gumballMachine.soldState)
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
        println("Can't refill now")
    }
}