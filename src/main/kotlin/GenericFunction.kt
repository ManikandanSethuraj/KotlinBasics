fun main(){

    val circleOne = CircleClass.randomCircle()

    val rectOne  = RectangleClass.randomRectangle()

    val triangleOne = TriangleClass.randomTriangle()

    val listShape = listOf(circleOne, rectOne, triangleOne)

    val listNum = (20.. 50).toList()

    for (shape in listShape){
        println("Area of ${shape.name} : ${shape.area()}")
    }

    val listShapeFilter = listShape.customFilter { it.area() > 30.0 }
    for (shape in listShapeFilter){
        println("Area of ${shape.name} greater in Filter: ${shape.area()}")
    }
    val numList = listNum.customFilter { it % 3 == 0 }.customAddFuns { it }

    println(numList)

    val triple = Triple(1,"Hello",3.4)

    println(triple)

    val customtriple = TripleGenericClass(1,"Hello", 4.5)

    customtriple.printAllValues()
}


// Generic type Functions

// The same Lambda Functions are replaced by Generic Funs Here

fun <E> List<E>.customFilter(filter : ((E) -> Boolean)) : List<E>{

    val list = mutableListOf<E>()

    for (item in this){
        if (filter(item)){
            list.add(item)
        }
    }

    return list
}


fun  List<Int>.customAddFuns(customAdd : ((Int) -> Int)) : Int{

    var k  = 0

    for (item in this){
        k = item + k
    }

    return k
}