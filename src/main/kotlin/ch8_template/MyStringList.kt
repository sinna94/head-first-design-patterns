package ch8_template

class MyStringList(
    strings: Array<String>
) : AbstractList<String>() {
    private val list = strings.toMutableList()

    override fun get(index: Int): String {
        return list[index]
    }

    override val size: Int
        get() = list.size

    fun set(index: Int, element: String): String {
        val oldString = list[index]
        list[index] = element
        return oldString
    }
}