package ch4_factory

import ch4_factory.pizza.Pizza
import ch4_factory.pizzastore.ChicagoStylePizzaStore
import ch4_factory.pizzastore.NYStylePizzaStore
import ch4_factory.pizzastore.PizzaStore
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