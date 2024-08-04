package com.example.kotlincoursewithexample

fun main() {
    var score = 5
    // var type variables you can reassigne.
    score=10
    println(score)

    val message = "Hello world"
    //message = "shams" // val can not be reassigne
    println(message)

    DataTypeFn()
}

class DataTypeFn {

    var score : Int = 5 // Int Data Type
    var temperature : Double = 3.14 //Double Data type
    var isRaining : Boolean = false // Boolean Data type
    var alphabets : Char ='A' // Character Data Type
    var message : String="Hello" // String Data type
}
