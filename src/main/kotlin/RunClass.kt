import kotlin.test.currentStackTrace

fun main(){


    // This will throw an error when radius is in negative..
    val cicleCheck = CircleClass(-20.0)


    val triangle = TriangleClass(10.0,10.0,10.0)
    triangle.changeName("New Triangle")

   // println(triangle.a)

    val rect : RectangleClass = RectangleClass(5.0, 10.0)
    println("The Area of Rectangle :${rect.area()}")
    println("The parimeter of Rectangle :${rect.perimeter()}")
    println("Is the Rectangle Square:${rect.isSqaure()}")


    val circle = CircleClass(10.0)

    val circleTwo = CircleClass.randomCircle() // this creates a random circle with a specific radius between the mentioned radius range

    println(rect.changeName("New Rectangle"))
    println(rect.name)



    // Testing Function overloading

    val maxofTwoAreas = maxArea(triangle, rect)
    val maxOfThreeAreas = maxArea(triangle, rect, circle)

    println("Max of Two areas:: $maxofTwoAreas")
    println("Max of Three areas:: $maxOfThreeAreas")



}



// Function overloading
// this function name is maxArea with two parameters
// the below function has the same name with three parameters



fun maxArea(shapeOne : ShapeClass, shapeTwo : ShapeClass) : Double {

    val areaShapeOne = shapeOne.area()
    val areaShapeTwo = shapeTwo.area()
    return if (areaShapeOne > areaShapeTwo) areaShapeOne else areaShapeTwo

}

fun maxArea(shapeOne : ShapeClass, shapeTwo : ShapeClass, shapeThree : ShapeClass) : Double{
    val maxArea = maxArea(shapeOne, shapeTwo)
    return if (maxArea > shapeThree.area()) maxArea else shapeThree.area()

}