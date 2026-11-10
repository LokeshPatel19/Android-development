package day01

fun main() {

    println("Enter the number:")

    val number = readln().toIntOrNull()

    if (number == null) {
        println("Please enter a valid integer")
        return
    }

    if (number % 2 == 0) {
        println("Number is even")
    } else {
        println("Number is odd")
    }
}