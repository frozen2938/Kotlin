import java.util.Scanner

// 2025/03/24 Monday ( IQ Test )

fun main() {
    // Finding the largest number between three input options
    var read = Scanner(System.`in`)
    print("Enter first number: ")
    val numx = read.nextInt()

    print("Enter second number: ")
    val numy = read.nextInt()

    print("Enter third number: ")
    val numz = read.nextInt()

    // Determine the largest number
    val largest = when {
        numx >= numy && numx >= numz -> numx
        numy >= numx && numy >= numz -> numy
        else -> numz
    }

    println("$largest is the largest number")
}