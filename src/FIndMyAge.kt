import java.util.*

fun main(args : Array<String>){

    print("Enter your DOB")
    var DOB:Int = readLine()!!.toInt()

    //Process
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int = year - DOB
    println("Your age is $age years")
}