fun main(args: Array<String>) {
    var number: Int = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("Number $number is even")
    } else {
        println("Number $number is odd")
    }
}