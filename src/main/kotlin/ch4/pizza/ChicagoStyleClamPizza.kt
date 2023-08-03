package ch4.pizza

import ch4.ingredient.PizzaIngredientFactory

class ChicagoStyleClamPizza(
    private val ingredientFactory: PizzaIngredientFactory

): Pizza() {
    override fun prepare() {
        println("피자를 준비하는 중: $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
    }

    override fun cut() {
        println("피자를 사각형 모양으로 자르는 중")
    }
}