import java.util.*

fun main(){
 var myValue : Int = 5   // var is static
 val myValueTwo : Double = 4.0 // val is final

    println("This myValue data: $myValue")

    println("This is myValueTwo data: $myValueTwo")

    var x = 9
    var y = 10

    println("The value of x + y is: ${x + y}")

    var xx = 10.13F
    var yy = 2.13F

    var xe: Double = 10.32
    var ye: Double = 12.43

    // If not mentioned ad Float the values are termed as Double

    println("The Value of xx / yy ${xx/yy}")
    println("The Value of xe / ye ${ye/xe}")


   // Strings

    val newString = "This is a string"
    println("Show String: $newString")
    println("Show changes in String ${newString.uppercase(Locale.getDefault())}")



   // logical comparisons

   var xe1 = 4
   var ye1 = 5

   println(xe1 == ye1)
   println(xe1 > ye1)
   println(xe1 < ye1)



   val aa = 8; val bb = 9
   println(aa)
   println(bb)

   println(xe1 != ye1 && aa != bb)


   // IF statement same as Java

   val things = if (aa > bb) 3 else 4

   println("the value of things is $things")


    val newValue : String = "Manikandan"
    val anotherString : String = "Sethuraj"


    println(newValue.dropLast(3))
    println(newValue.plus(things))
    println(newValue.compareTo(anotherString))





}