fun main() {

    do {
        println("Welcome to the Simple Calculator!")

        print("Enter the first number: ")
        var firstNumber = readln().toDouble()

        print("Enter the second number: ")
        var secondNumber = readln().toDouble()

        if (firstNumber == null || secondNumber == null) {
            println("Entrada inválida!")
            return
        }

        println("Choose the operation:")
        println("1. Sum")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Remainder of the division")
        print("Enter the operation: ")
        var operation = readln()

        var result = when (operation) {
             "1" -> firstNumber + secondNumber
             "2" -> firstNumber - secondNumber
             "3" -> firstNumber * secondNumber
             "4" -> if (secondNumber != 0.0) firstNumber / secondNumber else {
                 println("Error: Impossible to divide with zero!")
                 return
             }
             "5" -> firstNumber % secondNumber
             else -> {
                println("Invalid operation!")
                 return
            }
        }

        println("The operation result is: $result")

        println("Do you want to restart the calculator? (y/n)")
        var restart = readln().lowercase()
    } while (restart.contentEquals("y"))

    print("Exiting the calculator...")
}