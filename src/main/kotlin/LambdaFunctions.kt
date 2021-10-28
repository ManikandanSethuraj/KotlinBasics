fun main(){

    var list = (1..20).toList()
    var listtow = listOf<Int>(1,2,3,4,5)

    println(list)
    println(listtow)

    // it refers to the item in the list
    var listTwo = list.filter { it % 2 == 0 }

    println(listTwo)



    val circleOne = CircleClass.randomCircle()
    val circelTwo = CircleClass(10.0)

    val rectOne = RectangleClass(9.0)
    val rectTwo = RectangleClass(5,6)

    val triOne = TriangleClass(4.0,3.0,2.0)
    val triTwo = TriangleClass(3.0,5.0,6.0)

    var shapes = listOf<ShapeClass>(circleOne, circelTwo, rectOne, rectTwo, triOne, triTwo)

    val shapeArea = shapes.filter { it.area() > 20.0 }.sortedBy { it.area() }

    println("Area List greater than 100: $shapeArea")

    for (shape in shapeArea){
        println("Area shape: ${shape.name} and area value: ${shape.area()}")
    }

  //  println(shapes)

    val shapeAreaOwnFilter = shapes.ownFilterFun { it.area() > 40.0 }.sortedBy { it.area() }

    println(shapeAreaOwnFilter)



    val shapeAreaCustom = shapes.customFunctionShape { shape, string -> shape.area() > 50.0 }

    println(shapeAreaCustom)
}

// Own filter Function

fun List<ShapeClass>.ownFilterFun(filterFunction: (ShapeClass) -> Boolean): List<ShapeClass>{
    val result = mutableListOf<ShapeClass>()
    for (shape in this){
        if (filterFunction(shape)){
            result.add(shape)
        }
    }
    return result

}

fun List<ShapeClass>.customFunctionShape(filterFunction: (ShapeClass, String) -> Boolean): List<ShapeClass>{
    val result = mutableListOf<ShapeClass>()
    for (shape in this){
        if (filterFunction(shape,"Hello")){
            result.add(shape)
        }
    }
    return result

}

