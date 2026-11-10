package day01

fun main() {
    println("Enter first number :")
    val number1 = readln().toFloatOrNull() ?: 0f

    println("Enter second number :")
    val number2 = readln().toFloatOrNull() ?: 0f

    println("Enter third number :")
    val number3 = readln().toFloatOrNull() ?: 0f

    val total = (number1 + number2 + number3)
    print(total)

}