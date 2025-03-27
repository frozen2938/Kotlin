fun main() {

    var dog1 = Dog("Billy", "Chiwawa", "Brown")
   println(dog1.breed)

    var dog2 = Dog("Mike", "Kienyeji", "Brown")
   println(dog2.name)

    var dog3 = Dog("Joseph", "German Shephered", "White")
   println(dog3.breed)

    var dog4 = Dog("Ian", "Siberian Huskey", "White")
   println(dog4.color)


}

class Dog(var name:String, var breed:String, var color:String){

}