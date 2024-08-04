package com.example.kotlincoursewithexample

fun main() {
  MyClass.Myobject.f()
    MyCompanion.MyCompanionObj.g()
}


class MyClass{
    object Myobject{
        fun f(){
            println("this is object")
        }
    }
}

class MyCompanion{
    companion object MyCompanionObj{
        fun g(){
            println("this is companion object")
        }

    }
}