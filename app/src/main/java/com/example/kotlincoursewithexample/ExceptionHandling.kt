package com.example.kotlincoursewithexample

import java.lang.Exception

fun main() {
  // Those error which can be handle is known as Exception

    val arr = arrayOf(1,2,3)
    try {

        println(arr[5])
        println("Index out of bound exception")
    }
      catch (ex : Exception){
          println("Null pointer exception")
      }
    catch (e : Exception){
        println("Please check it array index")
    }finally {
        println("I will execute no matter what")
    }


}
