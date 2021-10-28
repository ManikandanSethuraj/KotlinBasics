fun main(){


 //   // Reverse the list

//    val enterList = mutableListOf<Int>()
//
//    for (i in 1..5){
//        val k = readLine()?.toInt()
//        if (k != null)
//            enterList.add(k)
//    }


  //  println(enterList.asReversed())





  //  // Febinocci Series
//
//    val fibi = mutableListOf<Int>()
//
//    println("Enter a number n > 1")
//    val k2 = readLine()?.toInt()
//    val one = 0
//    val two = 1
//
//    if (k2 != null){
//        for (i in 0.. k2){
//            println(i)
//          when(i){
//              0 -> {fibi.add(0)
//              println(fibi)}
//              1-> {fibi.add(1)
//              println(fibi)}
//              else -> {
//                  val k3 = fibi.size
//                  val k4 = fibi[k3-1] + fibi[k3-2]
//                  fibi.add(k4)
//              }
//          }
//        }
//
//        println(fibi)
//    }





    //   // Alternative Sum

  //  val sum = alternativeSum(1,4,5,6,7,8,9,9,10)
  //  println("The alternative Sum is $sum")


   // Extended Functions

    val numArray = listOf<Int>(2,3,4,5,6,7,8)
    println("Print the value of Multiply Array: $numArray ")

}




fun alternativeSum(vararg numbers : Int) : Int{
    var finalNum = 0

    for (num in numbers.indices){
        if ((num % 2) == 0){
            finalNum += numbers[num]
            println(finalNum)
        }else{
            finalNum -= numbers[num]
            println(finalNum)
        }
    }

    return finalNum
}


fun List<Int>.multiply() : Int{
    var result = 0;
    for (i in 0 until this.size){
        result *= this[i]
    }

    return result
}


