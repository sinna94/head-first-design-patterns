package ch9_iterator_composite

class Waiter(
    private val allMenus: MenuComponent
) {
    fun printMenu(){
        allMenus.print()
    }
}
