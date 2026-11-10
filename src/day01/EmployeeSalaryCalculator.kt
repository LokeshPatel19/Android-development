package day01

fun main() {

    println("Enter the name :")
    val employeeName = readln()

    println("Enter the age :")
    val employeeAge = readln().toIntOrNull() ?: 0

    println("Enter the salary :")
    val monthlySalary = readln().toDoubleOrNull() ?: 0.0

    println("Is employee id still active :")
    val isActive = readln().toBooleanStrictOrNull() ?: false

    val annualSalary = monthlySalary * 12

    val bonus = annualSalary * 0.10

    val totalAnnualSalary = annualSalary + bonus

    println("----- Employee Details -----")

    println("Name: $employeeName")
    println("Age: $employeeAge")
    println("Monthly Salary: $monthlySalary")
    println("Active Employee: $isActive")

    println("Annual Salary: $annualSalary")
    println("Annual Bonus: $bonus")

    println("Total Annual Salary: $totalAnnualSalary")
}