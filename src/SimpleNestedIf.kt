

fun main(args:Array<String>){

    println("enter your grade:")
        var grade = readLine()!!.toDouble()

        if (grade >= 90){

            if (grade < 93){
                println(" You are in A- level")
            }else{
                println(" You are in A+ level")
            }
    }

    println("you enter garde $grade")
}