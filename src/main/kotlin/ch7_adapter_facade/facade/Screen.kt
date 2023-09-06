package ch7_adapter_facade.facade

class Screen(var description: String) {
    fun up() {
        println("$description going up")
    }

    fun down() {
        println("$description going down")
    }

    override fun toString(): String {
        return description
    }
}

