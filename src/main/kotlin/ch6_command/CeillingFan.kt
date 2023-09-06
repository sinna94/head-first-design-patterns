package ch6_command

class CeillingFan(
    private val location: String
) {
    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }

    var speed = OFF
        get() = field
        private set(value) {
            field = value
        }


    fun high() {
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        speed = OFF
        println("$location ceiling fan is off")
    }
}