
interface mi{

    fun sum(n1:Int,n2:Int)  {println("Sum: " + (n1+n2))}
    fun div(n1:Int,n2:Int) {println("Div: " + (n1/n2))}
}


class child1:mi{

    override fun sum(n1: Int, n2: Int) {
        println("Sum: " + (n1+n2))
    }

    override fun div(n1: Int, n2: Int) {
        println("Div: " + n1/n2)
    }
}
class child2:mi{

    override fun sum(n1: Int, n2: Int) {
        super.sum(n1, n2*3)
    }

    override fun div(n1: Int, n2: Int) {
        super.div(n1, n2 - 5)
    }
}

class child3:mi{

}


fun main(args:Array<String>){

    var c1 = child1()
    c1.sum(5,5)
}














