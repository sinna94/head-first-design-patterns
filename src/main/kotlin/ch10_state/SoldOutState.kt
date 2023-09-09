package ch10_state

class SoldOutState(
    private val gumballMachine: GumballMachine
) : State {
    override fun insertQuarter() {
        println("You can't insert a quarter, the machine is sold out")
    }

    override fun ejectQuarter() {
        println("You can't eject, you haven't inserted a quarter yet")
    }

    override fun turnCrank() {
        println("You turned, but there are no gumballs")
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
        gumballMachine.count = 5
        println("The gumball machine was just refilled; it's new count is: ${gumballMachine.count}")
        gumballMachine.setState(gumballMachine.noQuarterState)
    }
}