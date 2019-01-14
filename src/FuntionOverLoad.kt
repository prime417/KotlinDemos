
fun sum(n1:Int,n2:Int):Int{

    var sum = n1 + n2
    return sum
}

fun sum(n1:Int,n2:Int,n3:Int):Int{

    var sum = n1 + n2 + n3
    return sum
}

fun main(args:Array<String>){

    var s = sum(2,3)
    var s1 = sum(3,5,6)

    println("Sum: $s")

    println("Sum: $s1")


}