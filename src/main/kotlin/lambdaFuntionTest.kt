import java.util.logging.Filter

fun main(){
    val list = (1..10).toList()

    val customList = list.customAddFun { it }

    val addFilterCustomList = list.customFilter { it % 2 == 0 }.customAddFun { it }

    println(addFilterCustomList)

    println("PrintValue: $customList")

}


fun List<Int>.customFilter(cusFilter : (Int) -> (Boolean)) : List<Int>{
    val list = mutableListOf<Int>()
    for (integer in this){
        if (cusFilter(integer)){
            list.add(integer)
        }
    }
    return list
}

// I wrote this Function
fun List<Int>.customAddFun(cusAdd : (Int) -> (Int)) : Int{
    var value = 0
    for (integer in this){
        value = value + integer
    }
    return value
}

// the correct Function
fun List<Int>.customAddFunCorrect(cusAdd : (Int) -> (Boolean)) : Int{
    var value = 0
    for (integer in this){
        if (cusAdd(integer))
        value = value + integer
    }
    return value
}