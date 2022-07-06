package com.jasonz.practice.specialClasses

data class User(var id:Int, var name:String) {
    override fun equals(other: Any?): Boolean {
        return other is User && other.id == this.id;
    }
}

fun main() {
    val firstUser = User(1,"Jason1");
    println("${firstUser.id} + ${firstUser.name}");

    val secondUser =  User(1,"Jason2");
    val thirdUser  =  User(3,"Jason3");
    println("firstUser == secondUser: ${firstUser.equals(secondUser)}")
    println("firstUser == Thirduser: ${firstUser.equals(thirdUser)}")
}