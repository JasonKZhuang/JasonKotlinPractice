package com.jasonz.practice

//Create DTOs (POJOs)
/**
 *provides a Customer class with the following functionality:
getters (and setters in case of vars) for all properties
equals()
hashCode()
toString()
copy()
 */
data class Customer(val name: String, val email: String)

/**
 * Default values for function parameters
 */
fun foo(a: Int = 0, b: String = "") {
    println("$a : $b");
}

/**
 * Filter a list
 */
fun filterAList(list: List<Int>) {
    val positives = list.filter { x -> x > 0 }
}

/**
 * Check the presence of an element in a collection
 */
fun presenceOfAnElement(emailsList: List<String>) {
    if ("john@example.com" in emailsList) {
        println("yes in ")
    }
    if ("jane@example.com" !in emailsList) {
        println("no in ")
    }
}

/**
 * Instance checks
 */
fun instanceChecks(x: Any) {
    when (x) {
        is String -> println();
        is Int -> println();
        else -> println();
    }

}

/**
 * Instantiate an abstract class
 */
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}


fun main(args: Array<String>) {
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            // ...
        }
        override fun sleep() { // ...
        }
    }
    myObject.doSomething()
}