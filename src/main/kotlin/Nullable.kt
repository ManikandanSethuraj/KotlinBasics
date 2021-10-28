fun main(){

    val inputValue = readLine()

    println("Enter the value: $inputValue")

    val inputValueTwo = readLine()


    // The warning shows case the string value could be null and it is not null safe..
   // println(inputValueTwo.uppercase())

    // The ? sign is Null safe.
    println(inputValueTwo?.uppercase())

    val useInput = readLine()

    if (useInput != null)
        println(useInput.toInt() - 10)


   // Test

    println("Enter your Age:")
    val ageValue = readLine()?.toInt()

    if (ageValue != null)
        if (ageValue <= 18){
            println("You are young")
        }else if (ageValue in 19..64){
            println("You are Normal")
        }else if (ageValue >= 65){
            println("you are old")
        }



}