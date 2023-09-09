package ch10_state

class NoQuarterState(
    private val gumballMachine: GumballMachine
): State {
    override fun insertQuarter() {
        println("You inserted a quarter")
        gumballMachine.setState(gumballMachine.hasQuarterState)
    }

    override fun ejectQuarter() {
        println("You haven't inserted a quarter")
    }

    override fun turnCrank() {
        println("You turned but there's no quarter")
    }

    override fun dispense() {
        println("You need to pay first")
    }

    override fun refill() {
        println("Can't refill now")
    }
}