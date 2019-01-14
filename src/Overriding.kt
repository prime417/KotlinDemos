
open class Operations1(){

 open   fun sum(n1:Int,n2:Int):Int{
        return n1 + n2
    }

    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class Operations3():Operations1(){

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 *3
    }

    fun sub(n1:Int, n2:Int):Int{
        return n1 - n2
    }

    fun mul(n1:Int,n2:Int):Int{
        return n1 * n2
    }
}

fun main(args:Array<String>){
    val operation1 = Operations1()
    val sum1 = operation1.sum(2,2)
    println("Sum $sum1 ")

    val operation = Operations3()
    val sum = operation.sum(2,2)
    val div = operation.div(2,2)
    val sub = operation.sub(2,1)
    val mul = operation.mul(2,2)
    println("Sum *3 $sum \n Div $div \n Sub $sub \n Mul $mul")



}