fun main(args: Array<String>) {
    println("Enter first number:")
    var x: Int = readLine()!!.toInt()
    println("Enter second number:")
    var y: Int = readLine()!!.toInt()
    println("Allowed operations: Addition, Subtraction, Multiplication, Division")
    var operation: String = readLine()!!.toString()

    when (operation) {
        "Addition" -> print("Addition result: ${x + y}")
        "Subtraction" -> print("Subtraction result: ${x - y}")
        "Multiplication" -> print("Multiplication result: ${x * y}")
        "Division" -> print("Division result : ${x * y}")
        else -> println("Unknown operation: $operation")
    }
}
