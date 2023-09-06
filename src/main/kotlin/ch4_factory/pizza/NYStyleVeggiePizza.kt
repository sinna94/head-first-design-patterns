package ch4_factory.pizza

import ch4_factory.ingredient.PizzaIngredientFactory

class NYStyleVeggiePizza(
    private val ingredientFactory: PizzaIngredientFactory
) : Pizza() {
    override fun prepare() {
        println("피자를 준비하는 중: $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}