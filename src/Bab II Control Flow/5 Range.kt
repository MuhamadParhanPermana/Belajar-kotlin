package `Bab II Control Flow`

fun main() {
    /*
    val rangeInt = 1..10
    val rangeInt = 1.rangeTo(10)
    val downInt = 10.downTo(1)
    val rangeChar = 'A'.rangeTo('F')
    */
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}