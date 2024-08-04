package com.example.kotlincoursewithexample

fun main() {
   val isRaining = true

    if (isRaining==true){
        println("Take umberala ")
    }else{
        println("Enjoy umberala ")
    }

    // If else use asa a expression

  val result=  if (isRaining==true){
        "Take umberala "
    }else{
        "Enjoy umberala "
    }

    println(result)

    val number = 20

    val resultnumber = if (number % 2==0)"Even" else "Odd"

    println(resultnumber)

}