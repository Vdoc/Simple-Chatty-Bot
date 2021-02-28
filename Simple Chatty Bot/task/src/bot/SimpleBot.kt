package bot

import java.util.Scanner
/*
Stage 4/5: Learning numbers
*/
fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is " + age + "; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    // read a number and count to it here
    val num = scanner.nextInt()
    for (i in 0..num) {
        println("$i!")
    }

    println("Completed, have a nice day!")
}



/*
Stage 3/5: Guess the age

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $yourAge; that's a good time to start programming!")
}
*/


/*
Stage 2/5: Print your name
fun main() {
    val scanner = Scanner(System.`in`)
    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")
    // reading a name
    val yourName = scanner.next()
    println("What a great name you have, $yourName!")
}
*/




/*
Stage 1/5: Chatty Bot welcomes you
fun main() {
    // write your code here
    val name = "Fon"
    val bornDate = "2021"
    print("Hello! My name is $name.\n" +
            "I was created in $bornDate.")
}
*/