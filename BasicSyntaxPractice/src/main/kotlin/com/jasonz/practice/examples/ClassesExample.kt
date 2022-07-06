package com.jasonz.practice.examples

class Product(var id: Int, var name: String);

class Order(var id: Int, var name: String);

fun main() {
    var p = Product(1,"Car");
    var o = Order(1, "Delivery");
    println(o.id);
    o.name = "Return Parcel";
}