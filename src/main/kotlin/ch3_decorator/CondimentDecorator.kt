package ch3_decorator

abstract class CondimentDecorator(
    open val beverage: Beverage
) : Beverage()