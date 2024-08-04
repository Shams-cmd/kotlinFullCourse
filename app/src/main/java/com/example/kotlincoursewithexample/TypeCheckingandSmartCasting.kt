package com.example.kotlincoursewithexample

fun main() {
 val circle = Circle(4.0)
 val playerType = PlayerType("shams ")

  var arr = arrayOf(circle,playerType)
  for (obj in arr){
      if (obj is Circle){
         println(obj.area())
      }else{
         ( obj as PlayerType).sayMyName()
      }
  }
}
interface Draggble{
     fun drag()
}
abstract class ShapeTypeCasting : Draggble{
     abstract fun areaType() : Double
}
class CircleType(val radiousType : Double) : ShapeTypeCasting(){
    override fun areaType(): Double = Math.PI * radiousType * radiousType
    override fun drag() = println("Circle is dragging")
}
class SquareType(val sidetype : Double) : ShapeTypeCasting(){
    override fun areaType(): Double = sidetype * sidetype
    override fun drag() = println("square is dragging")
}
class Tringle (val base : Double,val height : Double) : ShapeTypeCasting(){
    override fun areaType(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}
class PlayerType(val name : String) : Draggble{

    override fun drag()  = println("$name is dragging")
    fun sayMyName()= println("Hay my name $name")

}