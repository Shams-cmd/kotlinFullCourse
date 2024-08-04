package com.example.kotlincoursewithexample

fun main() {
  val stud = mutableMapOf<Int,String>()

    stud.put(1,"alhasan")
    stud.put(2,"alhusain")
    stud.put(3,"aman")

    println(stud.get(1))
    println(stud.get(11))

    for ((key,values) in stud){
        println("$key,$values")
    }
    val map = mapOf<Int,String>(1 to "data")
}