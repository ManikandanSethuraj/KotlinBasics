fun main(){

    val a = 2.0
    val b = 3.0
    val c = 4.0
    val d = 5.0
    val height = 4.5

    val trapeze = object : ShapeClass("Trapeze", a,b,c,d,height) {

        init {
            println("The Area of Trapeze : ${area()}")
            println("The Perimeter of Trapeze : ${perimeter()}")
            println("IS the trapeze a Rectangle : ${isRectangle()}")
        }


        override fun area(): Double {
           return (a * c) * height / 2.0
        }

        override fun perimeter(): Double {
            return a + b+ c+ d
        }

        fun isRectangle() : Boolean = (a == c) && (b == d)
    }


}