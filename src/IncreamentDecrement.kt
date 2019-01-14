/*
*  BEDMAS rule
*  1 ()
*  2 ++ -- before var
*  3 ^
*  4 /, *
*  5 +, -
*  6 =
*  7 ++, -- after var
*
*
* */

fun main(args : Array<String>){


    println("before increament")
    var x = 10


    println("original: $x")

    var y:Int? = ++x

    // (++x) = (x=x+1)  , (--x) = (x= x - 1)
    println("before: $y")
    println("after: $x")


println("after Increament")

    var x1 = 10


    println("original: $x1")

    var y1:Int? = x1++
    println("y: $y1")
    println("after: $x1")
    println(" after y: $y1")


}