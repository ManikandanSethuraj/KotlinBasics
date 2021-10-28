fun main(){

  //  val pow = printPowReturn(3,5)
  //  println("The value of the power $pow")
   // println("the value of ${multiply(20,10)}")
  //  val list = listOf<Int>(120,133)
  //  printListOne(list)

    val listtwo = listOf(1,2,5,6,7,9,10)
    println("Enter the number to find the index :")
    val num = readLine()?.toInt()
    if (num != null) {
       println(findIndex(listtwo, num))
    }
}


fun  printPowReturn(base: Int, exponent: Int) :Int {
    var result = 1
    for (i in 1.. exponent){
        result *= base
    }
    println("$base to the power of $exponent is : $result")
    return result
}


fun multiply(a : Int , b : Int) = a * b

fun printListOne(list : List<Int>) = println(list[0])

fun findIndex(list : List<Int>, number: Int) : Int{
    var result = -1
    for (i in 0.. list.size-1){
        if (number == list[i]){
            result = i
            break
        }
    }

   return  result
}
