import java.awt.Shape
import kotlin.random.Random

// Created Custom Exception Class to check the radius is negative

class CircleRadiusNegativeException : Exception("The radius can't be negative")

class CircleClass(
    private val radius: Double
) : ShapeClass("Circle") {
    // The pi value can be taken from object
   // private val pi = 3.141592
    // The companion object is of singleton behaviour
    companion object{
        fun randomCircle() : CircleClass{
            val radius = Random.nextDouble(1.0,10.0)
            return CircleClass(radius)
        }
    }

    init {

        if(radius < 0){
            throw CircleRadiusNegativeException()
        }


        println("The value of Radius is :$radius")
        println("The Area of Circle is :${area()}")
        println("The Perimeter of Circle is :${perimeter()}")
        println()

    }

    // This can't be created becoz it is object class (Singleton Class)
    //  val importantvalues = ImportantNumbers()


   override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}