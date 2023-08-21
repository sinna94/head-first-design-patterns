package ch6

class CeillingFanLowCommand(
    private val ceillingFan: CeillingFan
) :Command{

    private var prevSpeed: Int = CeillingFan.OFF

    override fun execute() {
        prevSpeed = ceillingFan.speed
        ceillingFan.low()
    }

    override fun undo() {
        when (prevSpeed) {
            CeillingFan.HIGH -> ceillingFan.high()
            CeillingFan.MEDIUM -> ceillingFan.medium()
            CeillingFan.LOW -> ceillingFan.low()
            CeillingFan.OFF -> ceillingFan.off()
        }
    }
}