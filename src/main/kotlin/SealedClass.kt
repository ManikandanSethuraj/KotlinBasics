sealed class SealedClass {

    object firstSealed : SealedClass()
    object secondSealed : SealedClass()
    object thirdSealed : SealedClass()

}

// Can create inside or outside sealed Class, but can't do this in other class files

object fourthSealed : SealedClass()