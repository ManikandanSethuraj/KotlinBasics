


// this s a Generic Class where any value can be entered as input.

// "Any" keyword is to determine this class can derived from any

class TripleGenericClass<A : Any, B : Any, C : Any>(
    val valueOne : A,
    val valueTwo : B,
    val valueThree : C
) {
    fun printAllValues(){
        println("The Type of first value is ${valueOne::class}")
        println("The Type of second value is ${valueTwo::class}")
        println("the Type of Thrid value is ${valueThree::class}")
    }

}