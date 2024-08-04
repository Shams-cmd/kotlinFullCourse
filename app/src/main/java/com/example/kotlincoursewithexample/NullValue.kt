package com.example.kotlincoursewithexample

fun main() {
    // whenevet we use ? on data type that is null value
    var gender : String = "Male"  // non nullable data type
    var gender2 : String?=null // nullable data type
    var isAdult : Boolean? = null // nullable data type

    if (gender2 != null) {
        gender2.toUpperCase()
    }

    gender2?.toUpperCase() // ?. is a safe call operator

    // multiple statement execute using let
    // let will be call nullable and non nullable both
    // let is also called lambdas

    gender2?.let {
        println("Gender 1 is shas")
        println("Gender 2 is shas $gender2")
        println("gender 3 $it") // in let $it variable is point object
    }

    gender2.let {  }

    var selected = gender2?:"anam" //elvis operator
    var gennder = gender2!!.toUpperCase()// !! this operator tells if object is non null then we call function and if object is null then throw error.
}