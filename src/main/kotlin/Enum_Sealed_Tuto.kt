
enum class Car(){
     BMW,
    AUDI,
    MERCEDES
}


sealed class SealedCar(){
    object BMW : SealedCar()
    object AUDI : SealedCar()
    object MERCEDES : SealedCar()
}


object HUNDAI : SealedCar()