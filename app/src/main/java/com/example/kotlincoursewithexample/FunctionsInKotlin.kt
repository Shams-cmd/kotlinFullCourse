package com.example.kotlincoursewithexample

fun main() {
    //function is a block of code to perform particular action.
    // It help to reuse
    //By default return type of function is unitType
  val result=  add(5,10)
    println(result)
    evenorOdd(10)
    printCount(5)
}

fun printCount(count : Int =2){
    for (i in 1..count){
        println("Hello $i")
    }
}

fun add(num1 : Int,num2 : Int) : Int{

    return num1.plus(num2)
}

fun evenorOdd( num : Int){
   val result= if (num % 2==0)"even" else "odd"

    println(result)
}