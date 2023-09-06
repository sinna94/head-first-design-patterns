package ch4_factory.pizzastore

import ch4_factory.pizza.Pizza

abstract class PizzaStore{
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    protected abstract fun createPizza(type: String): Pizza
}
