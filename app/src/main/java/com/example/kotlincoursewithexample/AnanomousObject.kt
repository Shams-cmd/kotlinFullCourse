package com.example.kotlincoursewithexample

fun main() {
    //The object which have no name that is known as anyamous object.
     val testObj = object {
      val x : Int=10
          fun method(){
               println("i am an object expression")
          }
     }
     println(testObj.method())

     val t = object : Clone{
          override fun clonee() {
               TODO("Not yet implemented")
          }

     }
     val p = object : PersionAnomus("shams"){
          override fun persionName() {
               super.persionName()
               println("$name")
          }
     }

     p.persionName()
}

//Anonoumous object

interface Clone{
  fun clonee()
}

open class PersionAnomus(val name : String ){

     open fun persionName()= println("this is my $name")
}
