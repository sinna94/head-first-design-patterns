package ch9

import org.junit.jupiter.api.Test

class WaiterTest {
    @Test
    fun test(){
        val pancakeHouseMenu = Menu(
            "PANCAKE HOUSE MENU",
            "Breakfast"
        )
        val dinerMenu = Menu(
            "DINER MENU",
            "Lunch"
        )
        val cafeMenu = Menu(
            "CAFE MENU",
            "Dinner"
        )
        val dessertMenu = Menu(
            "DESSERT MENU",
            "Dessert of course!"
        )
        val allMenus = Menu(
            "ALL MENUS",
            "All menus combined"
        ).also {
            it.add(pancakeHouseMenu)
            it.add(dinerMenu)
            it.add(cafeMenu)
        }

        dinerMenu.add(
            MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
            )
        )

        dinerMenu.add(dessertMenu)

        dessertMenu.add(
            MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59
            )
        )

        val waiter = Waiter(allMenus)
        waiter.printMenu()
    }
}