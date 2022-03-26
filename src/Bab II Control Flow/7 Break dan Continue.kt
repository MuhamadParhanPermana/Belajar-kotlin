package `Bab II Control Flow`

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    // Continue
    for (i in listOfInt) {
        if (i == null) continue
        println("Dengan continue maka hasilnya $i")
    }

    // Break
    for (i in listOfInt) {
        if (i == null) break
        println("Dengan break maka hasilnya $i")
    }
}