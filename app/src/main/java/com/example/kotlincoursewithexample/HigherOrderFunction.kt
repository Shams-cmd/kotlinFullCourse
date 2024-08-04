package com.example.kotlincoursewithexample

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main() {
    // Those who accept as a function and return as a function or both is known as higher order function.
  val fn :(a:Double,b:Double)->Double = :: sum
    println(fn(2.0,3.0))

    calculator(5.0,6.0,::sum)
}

fun sum ( a:Double, b:Double): Double{
     return a+b
}
fun calculator(a: Double,b:Double, gn:(Double,Double)->Double){
    val result = gn(a,b)
    println(result)
}