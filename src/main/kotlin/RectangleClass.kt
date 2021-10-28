import kotlin.random.Random

// In Kotlin the constructor values are passed in the class itself
// The init block will initialize the
class RectangleClass(
    val a : Double,
    val b : Double
) : ShapeClass("Rectangle"){



    // This constructor can't be used as the parameters of this constructor are both double which matches the in above class headers
   // constructor(a: Double , b : Double) : this(a,b)

    // This is constructor Overloading

    constructor(a : Double) : this(a,a)

    constructor(a : Int, b : Int) : this(a.toDouble(), b.toDouble())


    companion object{

        fun randomRectangle() : RectangleClass {
            val rectA = Random.nextDouble(1.0,10.0)
            val rectB = Random.nextDouble(1.0, 20.0)
            return RectangleClass(rectA, rectB)
        }

    }


    init {
        println("$name : This name is from super class")
        println("The are the values of a:$a and b:$b")
        println()
    }

    override fun area() = a*b

    override fun perimeter() = 2 * a + 2 * b

    // This function is not made abstract in the Super class, as this function can be only used in Rectangle

    // If we implement this class in ShapeClass then all the subclasses has to override this class there
    fun isSqaure() = a==b


    



}