package com.example.kotlincoursewithexample

fun main() {
   val result=addition(b=10,a=12)
    println(result)

    val result2=addition(4.0,3.0)
    println(result2)
}

fun addition(a : Int,b: Int): Int{
    return a+b
}
fun addition(a : Double,b : Double) : Double{
    return a+b
}