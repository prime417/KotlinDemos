
fun sum(n1:Double,n2:Double):Double{

    var sum = n1 + n2
    return sum
}

fun display(n:Int):Unit{
    println("n: $n")
}

fun display1():Unit{
    println("OLA ")
}
fun display2(n:Int=0):Unit{
    println("n: $n")
}
fun main(args: Array<String>){

    var r = sum(10.2,4.5)

    println("r: $r")

    var r1 = sum(2.5,3.4)

    println("r1: $r1")

   display(3)

    display1()

    display2()
}