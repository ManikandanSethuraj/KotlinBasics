fun main(){

  //  Parallelogram from class Shape.

    val a = 3.0;
    val b = 5.0;
    val height = 3.0;

    val parallelogram = object : ShapeClass("Parallelogram",a,b,height){

        init {
            println("the dimenions of $name is : A $a , B : $b , Height : $height")
            println("The area $name is : ${area()}")
            println("The Perimeter $name is : ${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
           return ((2 * a) + (2 * b))
        }

        fun isRectangle() : Boolean = b == height

    }


    println("Is the Parallogram a Rectangle : ${parallelogram.isRectangle()}")



}