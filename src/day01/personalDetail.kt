package day01

fun main() {
    println("Enter your name :")
    val name = readln()

    println("Enter your age :")
    val age = readln().toIntOrNull() ?: 0

    println("Enter your city :")
    val city = readln()

    println("Enter your experience :")
    val experience = readln().toFloatOrNull()

    print("My name is $name I am $age years old, I live in $city currently I have $experience years of experience.")
}