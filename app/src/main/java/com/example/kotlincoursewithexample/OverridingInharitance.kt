package com.example.kotlincoursewithexample

fun main() {
// Any class is a super calass methods (toString,hashcode,copyright)
// You can define parametrize constructors
// you can call parent class parameter in child class


    val smasung = Samsung(typeParam = "samsung")
    smasung.name
    smasung.size
    smasung.display()


    val moblile = Mobile(type = "onePlus")
    moblile.name
    moblile.size
    moblile.display()
}

open class Mobile(val type : String){

    open val name = "shams"
    open val size : Int=5
    open fun makeCall() = println("Calling from phone")
    open fun powerOff()= println("shutting down")
    open fun display()= println("simple mobile diaplay")
}

class Samsung (typeParam : String): Mobile(typeParam){

    override val name: String ="glaxy2"
    override val size: Int = 6
    override fun display()  = println("Galaxy display")



}

