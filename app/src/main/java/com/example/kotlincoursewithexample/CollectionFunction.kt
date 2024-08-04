package com.example.kotlincoursewithexample

fun main() {
    val list = listOf(1,2,3,4,5)

    println(isodd(3))
    println(isodd(4))

    val nums = list.filter(::isodd)
    println(nums)
    val nums1LambdaPass = list.filter { it  % 2 != 0 } //Lambda function
    println(nums1LambdaPass)

    val userList = listOf(
        User(1,"a"),
        User(2,"b"),
        User(3,"c"),
        User(4,"d"),

    )
   val userData= userList.filter { it.id==2 }
    println(userData)

    //Map function
    // Map function data convert one form data to another form.
    val map = nums.map { it * it }
    println(map)

    //foreach
    nums.forEach{println(it)}

}
fun isodd(a:Int):Boolean{
     return a % 2 !=0
}

data class User(val id : Int, val user : String)