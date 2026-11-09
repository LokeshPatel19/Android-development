package day01

fun main() {
    println("Enter current salary :")
    val salary = readln().toFloatOrNull() ?: 0f

    println("Enter the increment :")
    val increment = readln().toFloatOrNull() ?: 0f

    val incrementAmount = salary * increment / 100

    val newSalary = salary + incrementAmount

    println("Increment amount: $incrementAmount")
    println("New salary: $newSalary")
}