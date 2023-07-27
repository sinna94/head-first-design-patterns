package ch3

abstract class CondimentDecorator(
    open val beverage: Beverage
) : Beverage()