

fun main(args:Array<String>){
println("Enter a No.: ")
    var x:Int? = readLine()!!.toInt()

    when(x){

        1,2->{
            println(" value is 1 or 2")
        }
        in 10..30->{
            println(" value in range 10..30")
        }
        !in 10..30->{
            println(" value is not in range 10..30")
        }
        else ->{
            println(" value is out of range")
        }


    }
}