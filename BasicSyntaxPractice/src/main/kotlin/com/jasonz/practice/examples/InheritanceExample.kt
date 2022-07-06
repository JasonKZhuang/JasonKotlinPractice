package com.jasonz.practice.examples

/**
 * Kotlin classes are final by default.
 * If you want to allow the class inheritance, mark the class with the open modifier.
 * Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
 * A class inherits a superclass when you specify the : SuperclassName() after its name.
 * The empty parentheses () indicate an invocation of the superclass default constructor.
 * Overriding methods or attributes requires the override modifier.
 */
open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

//========///
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

//Passing Constructor Arguments to Superclass
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1


fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")                              // 2
    lion.sayHello()
}