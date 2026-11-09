package day01

fun main() {
    println("Enter first number :")
    val firstNumber = readln().toFloatOrNull() ?: 0f

    println("Enter second number :")
    val secondNumber = readln().toFloatOrNull() ?: 0f

    println("Enter operator (+, -, *, /, %) :")
    val operator = readln()

    // 1. Calculate the final message as a single expression
    val resultMessage = when(operator) {
        "+" -> "The addition is: ${firstNumber + secondNumber}"
        "-" -> "The subtraction is: ${firstNumber - secondNumber}"
        "*" -> "The multiplication is: ${firstNumber * secondNumber}"

        // 2. Clean, inline division-by-zero checks
        "/" -> if (secondNumber != 0f) "The division is: ${firstNumber / secondNumber}" else "Error: Cannot divide by zero."
        "%" -> if (secondNumber != 0f) "The remainder is: ${firstNumber % secondNumber}" else "Error: Cannot divide by zero."

        else -> "Error: Please enter a valid operator."
    }

    // 3. Print the result just once
    print(resultMessage)
}
