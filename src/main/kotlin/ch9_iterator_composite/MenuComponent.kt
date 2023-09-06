package ch9_iterator_composite

interface MenuComponent {
    fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    fun getName(): String {
        throw UnsupportedOperationException()
    }

    fun getDescription(): String {
        throw UnsupportedOperationException()
    }

    fun getPrice(): Double {
        throw UnsupportedOperationException()
    }

    fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    fun print() {
        throw UnsupportedOperationException()
    }
}