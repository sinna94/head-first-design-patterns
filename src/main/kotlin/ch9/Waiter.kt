package ch9

import java.util.Iterator

class Waiter(
    private val allMenus: MenuComponent
) {
    fun printMenu(){
        allMenus.print()
    }
}
