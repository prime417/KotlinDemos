
open class Operations{

    fun sum(n1:Int,n2:Int):Int{
        return n1 + n2
    }

    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class Operations2():Operations(){

    fun sub(n1:Int,n2:Int):Int{
        return n1 - n2
    }

    fun mul(n1:Int,n2:Int):Int{
        return n1 * n2
    }
}

fun main(args:Array<String>){


    val operation = Operations2()
    val sum = operation.sum(2,2)
    val div = operation.div(2,2)
    val sub = operation.sub(2,1)
    val mul = operation.mul(2,2)
    println("Sum $sum \n Div $div \n Sub $sub \n Mul $mul")
}