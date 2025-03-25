import java.util.Scanner  //Enables you to enter a value in the terminal


fun main() {
    var read = Scanner(System.`in`)

    println("Enter your firstname :")
    var firstname = readln()    //Enables you to insert a value
    println("Hello there, $firstname")


    println("How old are you?")
    var age = read.nextInt()
    println("user is $age years old")


    println("Enter weight")
    var weight = read.nextDouble()
    println("My weight is $weight kilograms")





}