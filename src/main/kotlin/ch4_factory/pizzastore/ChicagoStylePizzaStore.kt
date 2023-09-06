package ch4_factory.pizzastore

import ch4_factory.ingredient.ChicagoPizzaIngredientFactory
import ch4_factory.pizza.*

class ChicagoStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza(ingredientFactory).also { it.name = "사카고 치즈 피자" }
            "pepperoni" -> ChicagoStylePepperoniPizza(ingredientFactory).also { it.name = "시카고 페퍼로니 피자" }
            "clam" -> ChicagoStyleClamPizza(ingredientFactory).also { it.name = "시카고 조개 피자" }
            "veggie" -> ChicagoStyleVeggiePizza(ingredientFactory).also { it.name = "시카고 야채 피자" }
            else -> throw IllegalStateException("Invalid type of pizza")
        }
    }
}
