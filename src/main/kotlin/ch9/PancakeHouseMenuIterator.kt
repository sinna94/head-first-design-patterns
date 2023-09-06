package ch9

class PancakeHouseMenuIterator(
    private val items: List<MenuItem>
):Iterator {
    private var position = 0

    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        val menuItem = items[position]
        position++
        return menuItem
    }
}
