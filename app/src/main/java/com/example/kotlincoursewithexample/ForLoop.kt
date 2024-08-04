fun main() {
    for (i in 1..5 step 2){
        println(i)
    }

    for (i in 1 until 5){
        println(i)
    }
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    //print table 2

    var number =2
    for (i in  1..10){
        println("number Table  $number x $i  ${number * i}"  )
    }
}