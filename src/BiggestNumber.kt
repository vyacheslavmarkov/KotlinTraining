fun main(args: Array<String>) {
    var x: Int = readLine()!!.toInt()
    var y: Int = readLine()!!.toInt()
    var z: Int = readLine()!!.toInt()

    if (x > y) {
        if (x > z) {
            println("X is the biggest number: $x")
        } else {
            println("Z is the biggest number: $z")
        }
    } else {
        if (y > z) {
            println("Y is the biggest number: $y")
        } else {
            println("Z is the biggest number: $z")
        }
    }
}
