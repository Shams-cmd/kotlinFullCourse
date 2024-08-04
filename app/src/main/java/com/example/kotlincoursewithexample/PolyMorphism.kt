package com.example.kotlincoursewithexample

fun main() {

    //Polymorprism says Parent can holds a refrence to his child
    // parents can call method of child classes(which are common)
   val circle : Shape= Circle(4.0)
   val squre  : Shape= Squre(8.0)
//   println(circle.area())
//    println(squre.area())
    val shape = arrayOf(Circle(3.0),Squre(5.0),Triangle(3.0,4.0))
    calculateArea(shape)
}
open class Shape{
   open fun area(): Double{
        return 0.0
    }
}

fun calculateArea(shapes : Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}

class Circle(val radius: Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Squre(val side : Double ):Shape(){
    override fun area(): Double {
        return side * side
    }
}
class Triangle(val base : Double,val height : Double) : Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }

}