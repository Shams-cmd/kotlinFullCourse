package com.example.kotlincoursewithexample

fun main() {
//ExtensionFunction is not use private variable

    println("hello shams abbas".formatedString())
    name()
}
fun String.formatedString() : String{
    return "---------------\n $this\n--------------"

    //Inline function


}

fun name (){
    println("this is not inline ")
    name1()
}

inline fun name1 (){
    println("this name 2")
}