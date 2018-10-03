fun main(args: Array<String>) {
    var number: Int = readLine()!!.toInt()

    if (number < 0) {
        println("Number $number is negative")
    } else {
        println("Number $number is positive or zero")
    }
}