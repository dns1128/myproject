package com.dns

fun main() {
//    println("HELLO KT")
//    Human().hello()
    val h = Human()
    //val 定義完後不能再更改
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kt")
    }
}
