package `Bab IV Functional Programming`

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

// Nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai dengan vararg
fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}

fun sets(vararg number: Int): Int {
    ...
}