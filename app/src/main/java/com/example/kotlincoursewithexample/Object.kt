package com.example.kotlincoursewithexample

fun main() {
  println(AB.num)
  println(Bc.text())

}

object AB{
    var num : Int=10

}

object Bc{
    val p : Int=20
    fun text(){
        println("I am object")
    }
}