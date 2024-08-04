package com.example.kotlincoursewithexample

fun main() {
     val emp = Emp()
    emp.age=20
    emp.name="data"

    println(emp.age)
    println(emp.name)

   var x = emp.apply {
        // In apply scope there was a this name which point object.
        // apply function return value is object
        name = "shamsy"
        age=20
    }
   var ret = emp.let {
        // if you want to perform multiple operations you can use Let scope
        //in let scope there was an it name variable thats point object.
        // scope last return value is last return value of the scope or unit.
        println(it.age)
        println(it.name)
       2
    }

   var a = with(emp){
        // In with this name refrence thats points emp
        // let scope has it and with has this
        // last expression value is a return value
         age = 30
         name = "sha"

    }

    emp.run{
        // In with this name refrence thats points emp object
        // run is with and let combinamtion
        // his last value was a return value

        age = 26
        name = "shahha"
    }



}

data class Emp(var name : String="", var age : Int=18)