fun main(){
  val array = intArrayOf(1,24323,65656,3434)

    // The values of array can be added as below (cool isn't)

  val max = getMax(1,34,4546,55,65,*array,76,76,5,3,67,767)
    println("The maximum value is $max")


searchString("How to become a good programmer")
searchString("How to become a good programmer", "Bing")


 // Named Parameter

 searchString(search = "How to become Engineer", searchEngine = "Bing")

 // Named Parameter - the parameter orders can be changed with named parameter Function calls

 searchString(searchEngine = "Google", search = "How to become Engineer")

}





// Default Parameters::
fun searchString(search : String, searchEngine : String = "Google"){
    println("Search the keyword $search in $searchEngine")
}



// Vararg parameters
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }

    return max
}