package com.example.kotlincoursewithexample

fun main() {
     SingletoneObject.inceamentTweeterLikes()
     SingletoneObject.incrementFbLikes()
    SingletoneObject.display()
}

object SingletoneObject {
    private var tweeterLikes =0
    private var fbLikes = 0

     fun inceamentTweeterLikes() = tweeterLikes++
    fun  incrementFbLikes() = fbLikes++

    fun display(){
        println("TweeterLikes : $tweeterLikes, FbLikes : $fbLikes")
    }
}