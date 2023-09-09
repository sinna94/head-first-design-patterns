package ch10_state

class GumballMachine(
    var count: Int
) {
    val soldOutState = SoldOutState(this)
    val noQuarterState = NoQuarterState(this)
    val hasQuarterState = HasQuarterState(this)
    val soldState = SoldState(this)
    val winnerState = WinnerState(this)

    private var state: State = soldOutState

    init {
        if (count > 0) {
            state = noQuarterState
        }else{
            state = soldOutState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun dispense() {
        state.dispense()
    }

    fun setState(state: State) {
        this.state = state
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            count -= 1
        }
    }

    fun refill(numGumBalls: Int) {
        state.refill()
    }
}