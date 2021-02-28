package bot

import java.util.Scanner
/*
Stage 2/5: Print your name
*/
fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val yourName = scanner.next()

    println("What a great name you have, $yourName!")
}

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
