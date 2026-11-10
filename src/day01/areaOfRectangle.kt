package day01

fun main() {
    println("Enter first length :")
    val length = readln().toFloatOrNull() ?: 0f

    println("Enter second breadth :")
    val breadth = readln().toFloatOrNull() ?: 0f

    val area = length * breadth

    val perimeter = 2 * (length + breadth)

    println("Area: $area")
    println("Perimeter: $perimeter")
}