package com.jasonz.practice

fun main(args: Array<String>) {
//    basicSyntax();
//    println(maxOf(4,5));
//    forLoop();
//    whileLoop();
//    println(describe("Monitor"));
//    rangePractice(5)
//    collectionsPractice();
//    println(checkNullable("11","12"));
//    println(typeChecksAutomaticCasts("100"));
    println(typeChecksAutomaticCasts(100));
}

private fun typeChecksAutomaticCasts(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }
    if (obj !is Int) return null
    // `obj` is automatically cast to `Int` in this branch
    return obj
}

private fun checkNullable(arg1: String, arg2: String): Int? {
    val x = Integer.parseInt(arg1);
    val y = Integer.parseInt(arg2);

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        return (x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
        return 0;
    }
}

private fun collectionsPractice() {
    var items = listOf<String>("Laptop", "Table", "Earphone");
    val item1 = "Table"
    //Check if a collection contains an object using in operator.
    when {
        item1 in items -> println(item1);
        "Tomato" in items -> println("Tomato");
    }

    //Using lambda expressions to filter and map collections
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it -> it.startsWith("a") }
        .sortedBy { it }
        .map { it -> it.uppercase() }
        .forEach { it -> println(it) };
}

private fun rangePractice(v: Int) {
    val x = 1;
    val y = 8;
    if (x in 1..y + 1) {
        println("$v is fitted in the range.")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    println()
}

private fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Other"
    }

private fun whileLoop() {
    var items = listOf<String>("Laptop", "Table", "Earphone");
    var i = 0;
    while (i < items.size) {
        println(items[i]);
        i++;
    }
}

private fun forLoop() {
    var items = listOf<String>("car", "truck", "train");
    for (item in items) {
        println(item);
    }
    for (index in items.indices) {
        println(items[index]);
    }
}

private fun basicSyntax() {

    // val is value which is read only
    val firstName: String = "Jason";

    // var is variable which is write and read
    var weight: Int = 100;

    // Boolean
    val myFinalFlag: Boolean = false;
    var myFlag: Boolean = false;
    myFlag = true;
    if (myFlag) {
        println(firstName);
    }
    println(weight);

    // combination of string
    val s1 = "Hello";
    val s2 = "World";
    val combined = "$s1 $s2";
    println(combined);

    // basic calculation
    val v1 = 400;
    val v2 = 200;
    var result = v1 + v2;
    result = v1 - v2;
    result = v1 * v2;
    result = v1 / v2;
    result = v1 % v2;
    println(result);

    //String
    var myString = "Kotlin";
    println(myString.isEmpty());
    println(myString.isBlank());
    println(myString[0]);
    println(myString[1]);
    println(myString.length);
    println(myString.substring(1, 3)) // start at 1, end at 3 but not include 3
    println(myString.substring(1, myString.length))
    var a = 1
    // simple name in template:
    val str1 = "a is $a"
    a = 2
    // arbitrary expression in template:
    val str2 = "${s1.replace("is", "was")}, but now is $a"


    //
    var names = mutableListOf<String>("Mike", "Jake", "Peter");
    for (name in names) {
        print(name + ":");
    }
    println();
    for (i in 1..5) {
        print(i.toString() + ":");
    }

    //call my function
    println();
    myFunction("Hello Kotlin");
    var myValue = myCalculation(1, 2);
    println(myValue);
}

private fun myFunction(name: String) {
    println("This is the first Function with parameter $name");
    val myName: String? = null;
//    val myName:String? = "Jason";
    if (myName != null) {
        println(myName);
    }
    println(myName?.uppercase());
}

private fun myCalculation(v1: Int, v2: Int): Int {
    return v1 + v2;
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

// Inheritance between classes is declared by a colon (:).
// Classes are final by default; to make a class inheritable, mark it as open.
open class Shape;

class Rectangle(var height: Double, var length: Double) : Shape() {
    var perimeter = (height + length) * 2
}

class Square() : Shape() {
    var height: Double = 0.0;
    var length: Double = 0.0;
    var perimeter = (height + length) * 2
}