fun main(){
    for(i in 1..32){
        println(i)
    }
    println()
    println()
    for(i in 10 downTo 5){
        println(i)
    }

    println()
    println()


    for (i in 20 downTo 3 step 2){
        println(i)
    }

    println()
    println()

    val array = arrayOf(1,2..10)
    for(i in array){
        println(i)
    }
}