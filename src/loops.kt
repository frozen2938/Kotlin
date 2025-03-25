fun main() {
//WHILE loop
    var number = 20
    while (number <= 25){
        println("Number is $number")
        number ++
    }

    var num = 5
    while (num >= 1 ){
        println("Number is $num")
        num --
    }

//DO WHILE loop
    var count = 100
    do {
        println("Number is $count")
        count ++
    }
        while(count <= 105)


//FOR loop
        for (x in 35..40){
            println("Number : $x")
        }


    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

    for (a in 1..5){
        if (a == 3){
            break  //"break" means stop process
        }
        println("Number : $a")
    }

    for (myletter in 'd'..'h'){
        if (myletter == 'f'){
            continue   //"continue" means skip
        }
        println("My letter is $myletter")
    }


}
