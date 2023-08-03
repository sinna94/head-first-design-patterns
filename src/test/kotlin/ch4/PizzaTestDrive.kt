package ch4

import ch4.pizza.Pizza
import ch4.pizzastore.ChicagoStylePizzaStore
import ch4.pizzastore.NYStylePizzaStore
import ch4.pizzastore.PizzaStore
import org.junit.jupiter.api.Test

class PizzaTestDrive {

    @Test
    fun test1(){
        val nyStore: PizzaStore = NYStylePizzaStore()
        val chicagoStore: PizzaStore = ChicagoStylePizzaStore()

        var pizza: Pizza = nyStore.orderPizza("cheese")
        println("이번 주문은 ${pizza.name} \n")

        pizza = chicagoStore.orderPizza("cheese")
        println("이번 주문은 ${pizza.name} \n")
    }
}