fun main(){
    var arrayOne = arrayOf(1,2,3,4)

    val arrayTwo = arrayOf(1,2,3,4)

    arrayOne[1] = 1
    arrayTwo[1] = 3

    println(arrayOne[1])
    println(arrayTwo[1])
    
    var listOne = listOf(1,3,5)
    val listTwo = listOf(2,4,6)

    // This will throw an error cause it is not Mutable
   // listOne.add(1)
   // listTwo.add(2)

  //  listOne[1] = 3
  //  listTwo[2] = 3

    var listOne1 = mutableListOf<Int>(1,3,5)
    val listTwo2 = mutableListOf(2,4,6)
    
    listOne1.add(7)
    listTwo2.add(8)
    // The Remove value of 1
    listTwo2.remove(1)

    // This removes index
    listTwo2.removeAt(1)

    listTwo2[1] = 32

    println(listOne)
    println(listTwo)
    println(listOne1)
    println(listTwo2)


    val enterList = mutableListOf<Int>()

    for(i in 1.. 10){
        val x = readLine()?.toInt()
        if (x != null)
        enterList.add(i,x)
    }

    println(enterList)
}