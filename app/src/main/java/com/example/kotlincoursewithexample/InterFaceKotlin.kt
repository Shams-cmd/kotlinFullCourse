package com.example.kotlincoursewithexample

import java.util.Objects


fun main() {
   dragobjects(arrayOf(CircleAbstract(6.0),SquareAbstract(3.0),TriangleAbstract(5.0,6.0),Player("smile")))
//Interface
    // Groups objects based on his behaviour.
    // Interface you can define abstract method and concreat method
    //one interface multiple interface implement and one class multiple interfaces implemnts
}

fun dragobjects(objects : Array<Draggible>){
    for (obj in objects){
        obj.drag()
    }
}
abstract class ShapeAbastract : Draggible{
     abstract fun area() : Double

}
interface Draggible{
    fun drag()
}
interface Cloneable{
    fun clone()
}

class CircleAbstract(val radious : Double) : ShapeAbastract(){
    override fun area(): Double = Math.PI * radious * radious
    override fun drag() = println("Circle is dragging")
}

class SquareAbstract(val side : Double) : ShapeAbastract(){
    override fun area(): Double = side * side
    override fun drag() = println("square is dragging")

}

class TriangleAbstract (val base : Double,val height : Double) : ShapeAbastract(){
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player(val name : String) : Draggible{
   override fun drag()= println("$name is dragging")
}
