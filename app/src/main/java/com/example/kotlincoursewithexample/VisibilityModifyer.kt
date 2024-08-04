package com.example.kotlincoursewithexample

fun main() {

    val obj = B()
    obj.n
    obj.r
}
//Modifyers
//public
//private
//protected
//internal
// class which have internal key world was available only in same module
//Inter behave like public but with in a module.

// By Defauld all the class,method,variable are public in kotlin
//If you are declering private any class or file function that will access with in the file not any where.
//protected is not applicable top lavel decleration..


open class A{
    public var  n = 20
    private var a = 10
    internal var r = 30
    protected var s=50

}

class B : A(){
    fun test(){
        println(n)
       // println(a)//private is not access out of the class
        println(r)
        println(s)//protected will be access in sub classes.

    }
}


