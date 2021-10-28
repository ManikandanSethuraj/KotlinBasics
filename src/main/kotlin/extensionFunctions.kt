fun main(){
    println("Enter the Number to find")
    val num = readLine()?.toInt()

    if (num != null){
        if (num.isPrime()){
            println("Prime Number")
        }else{
            println("Not a prime Number")
        }
    }

}

fun Int.isPrime(): Boolean{

    // The parameter Int can be referred by the keyword "this"

    for (i in 2 until this){
        if (this % i == 0){
            return false
        }
    }
    return true
}