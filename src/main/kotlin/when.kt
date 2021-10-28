fun main(){
    val age = readLine()?.toInt()

    val x = 10
    if(age != null){
        when(age){

            in 0.. 5-> println("Young Kid")
            in 6.. 17 -> println("Teen ager")
            18 -> println("you are 18")
            19,20 -> println("you are young adult")
            in 21.. 65 -> println("you are adult")
            else -> println("you are really old")

        }
    }


}