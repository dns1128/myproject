package com.dns

fun main() {
//    println("HELLO KT")
//    Human().hello()
    val h = Human()
    //val 定義完後不能再更改
    h.hello()
    var age :Int = 19;
    age = 20;
    var weight = 22.5f;
    var name : String;
    name = "hank";
}

class Human {
    fun hello() {
        println("Hello kt")
    }
}
