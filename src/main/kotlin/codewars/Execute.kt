package codewars

import kotlin.math.sqrt

fun main(){
    val pe = countPassengers(arrayOf(10 to 0,3 to 5,2 to 5))
    println("$pe")
   val small = smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120)
    println("$small")
  val cap =  capitalize("codewars")
    println("$cap")
  //  oddUpperCase("Maximum")
    val age = predictAge(65, 60, 75, 55, 60, 63, 64, 45)
    println(age)
    val ageAgain = getAge("9 years Old")
    println("$ageAgain")
    val posOne = sumOfAllPositiveOnes(intArrayOf(1, -2, 3, 4, 5))

   val sumPosNeg =  countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15))
    println("$sumPosNeg")

    val list = reverseSeq(5)
    println("$list")

    val makeNeg = makeNegative(-5)
    val makeNegOne = makeNegative(0)
    val makeNegTwo = makeNegative(6)

    println("$makeNeg")
    println("$makeNegOne")
    println("$makeNegTwo")

    val grow = grow(intArrayOf(5,4,3,2,1))

    println("$grow")

    val totalPoints = points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"))
    println("${totalPoints}")

    val doubleValue = doubleInteger(10)
    println("$doubleValue")

}

fun countPassengers(stops : Array<Pair<Int, Int>>) : Int{
          val pass = stops.let {
             var passOnBus  = 0
             var passOnStop = 0
             for (pair : Pair<Int, Int> in it){
                 passOnBus += pair.first
                 passOnStop += pair.second
             }
             passOnBus - passOnStop
         }
    return pass
}

fun smallEnough(a : IntArray, limit : Int) : Boolean{
       return a.all {
           it <= limit
       }

}


//fun meeting(s: String): String {
//     var list : List<String>?
//
//
//
//}


fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    val array : IntArray = intArrayOf( age1*age1, age2*age2, age3*age3, age4*age4, age5*age5, age6*age6,
        age7*age7, age8*age8)
    println("${array.sum()}")
    return (sqrt(array.sum().toDouble())/2).toInt()
}


fun capitalize(text: String): List<String> {
 //   println("$signOne")
     return listOf<String>(oddLowerCase(text), oddUpperCase(text))
}

fun oddUpperCase(text : String) : String{
  var textValue = ""

   for (c in text.indices){
         if (c % 2 == 0){
             textValue += text[c].uppercase()
         }else{
             textValue += text[c].lowercase()
         }
   }

    println(textValue)
   return textValue
}

fun oddLowerCase(text : String) : String{
    var textValue = ""

    for (c in text.indices){
        if (c % 2 == 0){
            textValue += text[c].lowercase()
        }else{
            textValue += text[c].uppercase()
        }
    }

    println(textValue)
    return textValue
}

fun getAge(yearsOld: String): Int {

    return yearsOld.substring(0,1).toInt()


}

fun sumOfAllPositiveOnes(numbers: IntArray): Int {
    // Place your code here
   return numbers.filter { it > 0 }.sum()
  //  println(posInt)
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    val pos = input?.count {
        it > 0
    } ?: 0
    val neg = input?.filter {
        it < 0
    }?.sum() ?: 0

    println("$pos")
    println("$neg")
    return arrayOf(pos, neg)

}


fun reverseSeq(n: Int): List<Int> {

    // The Below function is the better solution.
       var array : MutableList<Int> = mutableListOf()
       for (c in n downTo 1){
           array.add(c)
           println("$c")
           println("${array.size}")
       }

    return array

}

fun reverseSwqFinal(n: Int): List<Int> = (n downTo 1).toList()

fun evenOrOdd(number: Int): String {
       return if (number % 2 == 0) "EVEN" else "ODD"
}
fun makeNegative(x: Int): Int =  when{
     (x > 0) -> -x
      else -> x }

fun grow(arr: IntArray): Int  = arr.reduce{acc, i -> acc * i}

fun points(games: List<String>): Int {
     var point = 0
     games.apply {
        for (c in this){
            val x = c.substring(0,1).toInt()
            val y = c.substring(2).toInt()
            println("$x")
            println("$y")
            point += when{
                (x > y) -> 3
                (x == y) -> 1
                else -> 0
            }
            println("$point")
        }
    }
    return point
}



fun pointsFinal(games: List<String>) =
    games.sumBy {
        val (x, y) = it.split(":")
        when {
            x > y -> 3
            x < y -> 0
            else -> 1
        }
    }

fun doubleInteger(value : Int) : Int = value.times(2)

fun toCamelCase(str:String):String {
    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
    str.split("-", "_").mapIndexed { i, s -> if (i == 0) s else s.capitalize() }.joinToString("")
   return str.split("-", "_").run {
        drop(1).joinToString("", first()) { it.capitalize() }}
}
