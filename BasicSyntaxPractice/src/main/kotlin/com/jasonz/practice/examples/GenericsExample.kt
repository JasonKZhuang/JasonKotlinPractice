package com.jasonz.practice.examples

/**
 * Generic Classes
 */
class GenericsExample<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "GenericsExample(${elements.joinToString()})"
}

/**
 * Generic Functions
 */
fun <E> mutableStackOf(vararg elements: E) = GenericsExample(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}