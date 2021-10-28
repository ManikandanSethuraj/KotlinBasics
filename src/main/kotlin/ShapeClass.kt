
// The super class has to be "open" as all the classes in Kotlin as defined as final


// If the "name" is made protected, it can be called from it's sub-classes but not the where the subclasses are instantiated

// The class is changed from "open" to "abstract" so that the ShapeClass can't be instantiated in RunClass

// As the functions area and perimeter are used by all the shapes, we can add those shapes as abstract
abstract class ShapeClass(var name: String) {
    init {
        println("I am super class")
    }


    // To create the Anonymous Class
    constructor(name: String, vararg dimennsions : Double) : this(name)


    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName : String){
        name = newName
    }

}