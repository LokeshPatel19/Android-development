package day01

fun main() {
    println("Enter first number :")
    var number1 = readln().toFloatOrNull() ?: 0f

    println("Enter second number :")
    var number2 = readln().toFloatOrNull() ?: 0f

    println("Before swapping the of number1 is : $number1" )
    println("Before swapping the of number2 is : $number2" )

    var temp = number1
    number1 = number2
    number2 = temp

    println("After swapping the of number1 is : $number1" )
    print("After swapping the of number2 is : $number2" )
}