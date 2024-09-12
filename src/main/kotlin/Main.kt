fun main() {

    do {
        println("\nWelcome to the Simple Calculator!")

        print("Enter the first number: ")
        val firstNumber = readln().toDoubleOrNull()

        print("Enter the second number: ")
        val secondNumber = readln().toDoubleOrNull()

        if (firstNumber == null || secondNumber == null) {
            println("\nInvalid Input! Please enter a valid number")
            return
        }

        println("Choose the operation:")
        println("1. Sum")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Remainder of the division")
        print("Enter the operation: ")
        val operation = readln()

        var result = when (operation) {
             "1" -> firstNumber + secondNumber
             "2" -> firstNumber - secondNumber
             "3" -> firstNumber * secondNumber
             "4" -> if (secondNumber != 0.0) firstNumber / secondNumber else {
                 println("\nError: Impossible to divide with zero!")
                 return
             }
             "5" -> firstNumber % secondNumber
             else -> {
                println("\nInvalid operation!")
                 return
            }
        }

        println("\nThe operation result is: $result")

        println("\nDo you want to restart the calculator? (y/n)")
        val restart = readln().lowercase()
    } while (restart == "y")

    print("\nExiting the calculator...")
}