package com.example.kotlincoursewithexample

fun main() {
// it define as -method name is same but it will behave diffrently based on an object.

    // so wherever shape is required,we can any of subclasses i.e we can easily pass CIrcle,Squre,Triangle
// because they all are inherit from shape

    //But we cannot pass Shape Object where CIrcle is required.Because all shapes are not circle.

    val shape = Shape1()
    printArea(shape)

    val circle = Circle1(4.0)
    printArea(circle)

    val squre=Squre1(4.0)
    printArea(squre)

    val triangle = Triangle1(4.0,5.0)
    printArea(triangle)



}

fun printArea(shape: Shape1){
    println(shape.area())
}

open class Shape1{
    open fun area():Double=0.0
}

class Circle1(val radius : Double):Shape1(){
    override fun area(): Double=Math.PI * radius * radius
}
class Squre1(val side : Double) : Shape1(){
    override fun area(): Double = side * side
}
class Triangle1 (val base : Double,val height : Double):Shape1(){
    override fun area(): Double  = 0.5 * base * height
}

