import java.util.Scanner

//enter first number
//enter second number
//enter operator  (+  - /  *) only

fun main() {
    var read = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = read.nextInt()

    println("Enter Operator(+,-,/,*):")
    var operator = read.next()

    print("Enter second number: ")
    val num2 = read.nextInt()

    var result = when(operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> num1 / num2
        "*" -> num1 * num2
        else -> "Invalid"
    }
    println("Answer is $result")
}