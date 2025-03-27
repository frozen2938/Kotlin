fun main() {

    //Standard Library function/Predefined function

    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x")

    var y = Math.round(45.45)
    println("The output is $y")

    school()   //Calling a function
    student("Joseph", 21)
    student("Ian",19)

    employe("mark", 7300, false)
    employe("Ann", 50000, true)

}

//User defined function
fun school(){
    println("eMobilis")
}

//Parameter/Variable and Argument/value
fun student(name:String,age:Int){
    println("$name is $age yrs old")
}

//a simple program to display three employees
// name(String) , salary(integer), disability(boorian)

fun employe(name:String, salary:Int, disability:Boolean){
    println("$name is erning $salary. Disability $disability")

}