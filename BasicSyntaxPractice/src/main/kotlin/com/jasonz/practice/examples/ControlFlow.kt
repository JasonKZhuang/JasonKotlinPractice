package com.jasonz.practice.examples

open class ControlFlow

/**
 * kotlin.collections.List
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/
 */
private fun constructList(): MutableList<Product> {
    var products: MutableList<Product> = arrayListOf()
    products.add(Product(1, "Car"));
    products.add(Product(2, "Truck"));
    return products;
}

// the Animal class
class Animal(val name: String)
// the zoo class with multiple animals
// define your own iterators in zoo classes by implementing the iterator operator in them.
class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {             // 1
        println("inside the zoo iterator")
        return animals.iterator()                           // 2
    }
}

fun main() {
//    WhenStatement("Hello");
//    WhenStatement(120L);
//    WhenStatement(120);
//    WhenStatement(1);

//    var products: List<Product> = arrayListOf(Product(1, "Car"), Product(2, "Truck"))
//    forLoop(constructList() as ArrayList<Product>);
//    whileLoop(constructList());
//    var p : MutableList<Product> = arrayListOf();
//    whileLoop(p); // null list will be runtime wrong

//    val zoo:Zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//    iteratorLoop(zoo)

//    rangesPractice();

    equalityChecks();
    conditionalExpression();
}

/**
 * There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:
 */
fun conditionalExpression(){
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(99, -42))
}

/**
 * Kotlin uses == for structural comparison and === for referential comparison.
 * More precisely, a == b compiles down to if (a == null) b == null else a.equals(b).
 */
fun equalityChecks(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
    println(authors == writers)   // 1
    println(authors === writers)  // 2
    //
    var p1:Product = Product(1,"Car");
    var p2:Product = Product(1,"Car");
    println(p1 == p2)   // 1
    println(p1 === p2)  // 2
    p1 = p2;
    println(p1 == p2)   // 1
    println(p1 === p2)  // 2
}

fun rangesPractice(){
    for(i in 0..3) {             // 0123
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 012
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 2468
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      //3210
        print(i)
    }
    print(" ")

    //Char ranges are also supported
    for (c in 'a'..'d') {        // abcd
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { //
        print(c)
    }
    println()
    //Ranges are also useful in if statements
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}

fun iteratorLoop(items: Zoo){
    for (animal in items) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}

fun forLoop(items: ArrayList<Product>) {
    for (item in items) {
        println("The Product is ${item.id} : ${item.name}");
    }
}

fun whileLoop(items: List<Product>) {
    var i = 0;
    while (i < items.size) {
        println("The Product is ${items[i].id} : ${items[i].name}");
        i++;
    }
    //
    i = 0;
    do {
        println("The Product is ${items[i].id} : ${items[i].name}");
        i++;
    } while (i < items.size)
}

/**
 * Note that all branch conditions are checked sequentially until one of them is satisfied.
 * So, only the first suitable branch will be executed.
 */
fun WhenStatement(obj: Any) {
    when (obj) {
        1 -> println("this is number one");
        is String -> {
            println("This is a String")
        }
        "hello" -> {
            println("This is Hello")
        }
        is Long -> {
            println("This a long number")
        }
        !is String -> {
            println("This is not a string")
        }
        else -> {
            println("Something Else")
        }
    }
}

