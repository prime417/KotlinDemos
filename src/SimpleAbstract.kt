
abstract class CreditCard(){

    fun cashInfo():String{
        return "OLA"
    }
    abstract fun newCredit():String
}
class Hero():CreditCard(){
    fun getInfo():String{
        return cashInfo()
    }

    override fun newCredit():String {
       return "new Credit card"
    }
}
fun main(args:Array<String>){

//    var info = CreditCard()
//    println(info.cashInfo())

    var user = Hero()
    println(user.getInfo())


    println(user.newCredit())
}