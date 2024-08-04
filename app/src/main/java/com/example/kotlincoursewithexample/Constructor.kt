package com.example.kotlincoursewithexample

fun main() {
    val automobile = Automobile("car","petrol")
    val automobile2 = Automobile("car","petrol")

   println(automobile.engineType)
    val persion=Persion("A", 32)
    println(persion.age)
    println(persion.name)

    val persion2=Persion("A", 32)
    println(persion2.age)
    println(persion2.name)
}
class Automobile(val name : String,val type : Int,val setter : Int,var engineType : String){

    constructor( nameParam : String, engineParam : String):this(nameParam,4,5,engineParam)
    init {
        println("Initelizer block is created")
    }
    fun drivering(){
        println("Is driving")
    }
    fun bettal(){
        println("This car is bettal")
    }

    init {
        println("Initelizer2 block is created")
    }
}
class Empty(){}

class Persion(s: String, i: Int) {

    val name : String="s"
    val age : Int=0

}