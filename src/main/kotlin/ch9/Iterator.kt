package ch9

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem?
}