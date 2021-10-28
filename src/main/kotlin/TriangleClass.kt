import kotlin.math.sqrt
import kotlin.random.Random

class TriangleClass(
    private val a: Double,
    private val b: Double,
    val c: Double
) : ShapeClass("Triangle") {


    companion object{
        fun randomTriangle() : TriangleClass{
            val ab = Random.nextDouble(24.0)
            val bc = Random.nextDouble(2.0,9.0)
            val cd = Random.nextDouble(20.0)

            return TriangleClass(ab,bc,cd)
        }
    }


    init {
        println("Name of the class $name")
        println("The values of a: $a , b: $b , c: $c")
        println("$name's perimeter value is ${perimeter()}")
        println("$name's area value is ${area()} ")
        println()

    }

   override fun area() = sqrt((perimeter() /2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    override fun perimeter() = a + b+ c


}