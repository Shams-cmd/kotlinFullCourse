package com.example.kotlincoursewithexample

fun main() {

//    val tile= Red("Mashroom",25)
//    val tile2 = Blue("dkyblue",23)
//
//    println("${tile.point},${tile2.type}")
    val tile : Tile = Red("Mashroom",25)
    val point = when(tile){
        is Blue -> tile.point * 2
        is Red ->  tile.point * 5
    }

     println(point)
}
sealed class Tile
class Red(val type : String,val point : Int) : Tile()
class Blue(val type : String,val point: Int) : Tile()