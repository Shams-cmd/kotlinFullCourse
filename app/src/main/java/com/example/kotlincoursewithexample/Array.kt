package com.example.kotlincoursewithexample

fun main() {
    // if you wan't to store 50 songs of user.
    // Defining 50 variable will bw mess
    //To solve this kind of problem we have array
    // Array is a simple object where you can store multiple values same type
    // Array size is fixed

    var arr = arrayOf("one","two","three")
    var arrInt= arrayOf<Int>(1,2,3)

    for ((i,e) in arr.withIndex()){
        println("$i-$e")
    }
    for ((i,e) in arrInt.withIndex()){
        println("$i-$e")
    }

    println(arr[0])
    println(arr[2])
}