package com.example.kotlincoursewithexample

fun main() {
    val number = 10
    //In dot dot .. upperBond is included and Until upper bound is included
    val resultdotdot = number in 1..5
    val resultUntil = number in 1 until 5

    println(resultdotdot)
    println(resultUntil)

    var animal = "dog"

    when(animal){
        "horse" -> println("Animal is horse")
        "cat"  -> println("Animal is cat")
        "dog" -> println("Animal is dog")

    }
}