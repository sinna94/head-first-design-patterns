package ch8_template

class Duck(
    private val name: String,
    private val weight: Int
) : Comparable<Duck> {

    override fun toString(): String {
        return "$name weighs $weight"
    }

    override fun compareTo(other: Duck): Int {
        return when {
            weight < other.weight -> -1
            weight == other.weight -> 0
            else -> 1
        }
    }
}
