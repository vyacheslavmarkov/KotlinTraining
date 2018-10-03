fun main(args: Array<String>) {
    var numberA: Int = readLine()!!.toInt()
    var numberB: Int = readLine()!!.toInt()

    if (numberA > numberB) {
        println("$numberA is bigger than $numberB")
    } else if (numberA < numberB) {
        println("Number $numberA is less than $numberB")
    } else {
        println("Number $numberA is equal to $numberB")
    }
}