package day01

fun main() {
    println("Enter first number :")
    val number1 = readln().toFloatOrNull() ?: 0f

    println("Enter second number :")
    val number2 = readln().toFloatOrNull() ?: 0f

    if (number1 > number2) {
        print("Number 1 is greater : $number1")
    } else if (number2 > number1) {
        print("Number 2 is greater : $number2")
    } else {
        print("Both are same")
    }
}