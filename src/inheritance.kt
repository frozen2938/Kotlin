// Parent Class/Super class/Base class
open class Animal{
    var age = 3
    var gender = "Male"


    fun makesound(){
        println("Animal is speaking")
    }
}


//Child class/Derived class/Sub-class
class dog:Animal(){
    fun bark{
        println("Woof! Woof!")
    }
}

class cat{
    var color = "White"
    var hasFur = true

    fun meow(){
        println("Meow! Meow!")
    }
}


fun main() {
    var a = Animal()

    var d = dog()
    d.bark()
    println(d.gender)
    var c =  cat()




}