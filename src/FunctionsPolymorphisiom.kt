

fun show(n:Int):Unit{
    println("Int: $n")
}

fun show(n:String):Unit{
    println("String: $n")
}

fun show(n:Double):Unit{
    println("Double: $n")
}

fun main(args:Array<String>){

    show(10)
    show("SDs")
    show(10.21)
}