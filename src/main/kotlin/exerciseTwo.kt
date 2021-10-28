fun main(){



    val list = listOf<Int>(1,2,3,4,5,6)
    val array = arrayOf(1,2,3,4,5)

    pendulam(list)
    pendulam(array)


}

// print the pendulum values of the list
fun pendulam(list: List<Int>){
    val mutableList = mutableListOf<Int>()
    val bol = list.size % 2 == 0
    val sizeLast = list.size - 1
    val middleValue = (list.size / 2)
    for (i in 0 until middleValue){
        mutableList.add(list[i])
        mutableList.add(list[(sizeLast - i)])
        if (i == middleValue-1){
            if (!bol){
                mutableList.add(list[middleValue])
            }
        }
    }
    println("The pendulam Values of List $mutableList")
}


// Print the pendulum value of array, this is fun overloading of above

fun pendulam(array : Array<Int>){
//    val mutableList = array
//    val bol = array.size % 2 == 0
//    val sizeLast = array.size - 1
//    val middleValue = (array.size / 2)
//    for (i in 0 until middleValue){
//        mutableList[i] = (array[i])
//        mutableList[](array[(sizeLast - i)])
//        if (i == middleValue-1){
//            if (!bol){
//                mutableList.add(array[middleValue])
//            }
//        }
//    }
//    println("The pendulam Values of Array $mutableList")
}