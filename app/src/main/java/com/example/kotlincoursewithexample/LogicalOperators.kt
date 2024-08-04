package com.example.kotlincoursewithexample

fun main() {

    // &&(AND) Both variables are true then it will come true else it will come false
    // ||(OR) both variable you have true value then is call
    // !(NOT)

    val above70 = true
    val knowprogramming = false
    var calInterview = above70 && knowprogramming
    println(calInterview)

     calInterview  = above70 || knowprogramming
    println(calInterview)

    val answer = false
    val result = !!answer
    println(answer)
}