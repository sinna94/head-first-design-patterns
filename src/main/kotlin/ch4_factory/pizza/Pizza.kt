package ch4_factory.pizza

import ch4_factory.ingredient.*

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: Array<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clam: Clams

    abstract fun prepare()

    fun bake(){
        println("350도에서 25분간 굽는 중")
    }
    open fun cut(){
        println("피자를 8조각으로 자르는 중")
    }
    fun box(){
        println("피자를 포장하는 중")
    }
}
