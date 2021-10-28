fun main(){
    val arrayValue = arrayOf("mani","sethu","mark")
    println(arrayValue[1])


    var firstValue = readLine()?.toInt()

    var secondValue = readLine()?.toInt()

    println("first Value: $firstValue")

    println("second Value: $secondValue")
    var value = 0

    while (secondValue == 0){

         {
         //   value = firstValue?.toInt() + firstValue?.toInt()
            println("Value: $value")
        };
        secondValue--
    }
    println(value)

}