open class App1(){

    open   fun sum(n1:Int,n2:Int):Int{
        return n1 + n2
    }

    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class App2:App1{

    constructor():super(){

    }

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


    val operation = App2()
    val sum = operation.sum(2,2)
    val div = operation.div(2,2)
    val sub = operation.sub(2,1)
    val mul = operation.mul(2,2)
    println("Sum *3 $sum \n Div $div \n Sub $sub \n Mul $mul")

    val operation1 = App1()
    val sum1 = operation1.sum(2,2)
    println("Sum $sum1 ")

    // we cast App1 class to App2
    var castOpertion = App2() as App1

    val sum2 = castOpertion.sum(2,2)
    val div2= castOpertion.div(2,2)

    println("Sum $sum2 \n Div $div2 ")
}