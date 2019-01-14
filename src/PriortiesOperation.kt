//BEDMAS rule
/*
* 1 ()
* 2 ^
* 3 /, *
* 4 +, -
* 5 =
* */

fun main(args : Array<String>){

    var a1:Int = 12
    var a2:Int = 15
    var a3:Int = 14
    var sum:Int?

    sum = a1+a2*(a3-5)

    print("Sum: $sum")

}