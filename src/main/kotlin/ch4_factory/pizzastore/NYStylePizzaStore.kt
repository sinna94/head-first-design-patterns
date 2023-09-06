package ch4_factory.pizzastore

import ch4_factory.ingredient.NYPizzaIngredientFactory
import ch4_factory.pizza.*

class NYStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = NYPizzaIngredientFactory()

        return when (type) {
            "cheese" -> NYStyleCheesePizza(ingredientFactory).also { it.name = "뉴욕 치즈 피자" }
            "pepperoni" -> NYStylePepperoniPizza(ingredientFactory).also { it.name = "뉴욕 페퍼로니 피자" }
            "clam" -> NYStyleClamPizza(ingredientFactory).also { it.name = "뉴욕 조개 피자" }
            "veggie" -> NYStyleVeggiePizza(ingredientFactory).also { it.name = "뉴욕 야채 피자" }
            else -> throw IllegalStateException("Invalid type of pizza")
        }
    }
}
