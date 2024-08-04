package com.example.kotlincoursewithexample

fun main() {
  val maruti = Car(name = "WagonR", type = "Petrol", kmran = 100 )
    val tata = Car(name = "Safari", type = "Desial", kmran = 500 )

    println(maruti.name)
    println(tata.name)
   println(maruti.driver())
   println(tata.applyBrakers())

}

class Car(val name : String,val type : String,var kmran : Int){
    fun driver(){
        println("$name Cra is driving")
    }

    fun applyBrakers(){
        println("Applied Brakers")
    }
}