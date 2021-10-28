fun main(){

    // This code will throw the Custom Exception DivideByZeroException
  //  println(divideFun(50.0,0.0))



    val divide = try {
        divideFun(25.0,0.0)
    }catch (e : DivideByZeroException){
        0.0
    }

    println("Print the Divide Value: $divide")

    println("Please enter the number: ")

    val value = try{
        readLine()?.toInt()
    }catch (e : NumberFormatException){
        println("The value is not number")
          0
    }finally {
        println("This is from the finally block")
    }

    println("The entered value is: $value")





}


// We can create our own Exception
class DivideByZeroException : Exception("The number can't be divided by zero")




fun divideFun(doubleVal : Double, doubleValTwo: Double) : Double{
    if (doubleValTwo == 0.0){
        throw DivideByZeroException()
    }
    return doubleVal / doubleValTwo
}


