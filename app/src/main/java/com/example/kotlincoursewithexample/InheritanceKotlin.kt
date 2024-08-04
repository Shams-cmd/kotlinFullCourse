package com.example.kotlincoursewithexample

fun main() {
    val childobj = Child()
    childobj.method2()
    childobj.method1()
}
open class Parent{
    init {
        println("This is shams")
    }
    fun method1(){
        println("This is my first method")
    }
}

class Child : Parent(){
    init {
        println("This is abbas")
    }
    fun method2(){
        println("This is my second method")
    }
}