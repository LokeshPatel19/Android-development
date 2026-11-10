package day01

fun main() {

    println("Enter the minutes :")
    val minutes = readln().toIntOrNull() ?: 0

    val hrs = (minutes / 60)
    val mins = (minutes % 60)

    print("The conversion of the mins into hrs is : $hrs and $mins minutes.")
}