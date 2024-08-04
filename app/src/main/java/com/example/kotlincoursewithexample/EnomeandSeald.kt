package com.example.kotlincoursewithexample

fun main() {
// suppose we have set of constant value so we have to define that value that value are enum values.
// you can define constructor in enum class.

 // Enum class values are instance.Once instance was create you can not change the state
 //Every value has one object.
 //I need multiple object over there we need seald class
 // enum class we restrict values
 // seald class we restrict type.

   val day = Days.Monday
//
    day.printFormateddays()
}

enum class Days(val num : Int){
    Sunday(1),
    Monday(2),
    Tuseday(3),
    Wesnessday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    // you can define a method in enum class
    // use semicolum ; to define a methods in enum

    fun printFormateddays(){
      println("Days is $this")
    }

}

