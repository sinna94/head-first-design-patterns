package ch9_iterator_composite

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem?
}