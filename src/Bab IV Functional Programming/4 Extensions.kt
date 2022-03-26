package `Bab IV Functional Programming`

// Extension Functions
fun Int.printInt() {
    print("value $this")
}
////////////////////////////
fun main() {
    10.printInt()
}

fun Int.printInt() {
    print("value $this")
}
    output : value 10
////////////////////////////
fun main() {
    println(10.plusThree())
}

fun Int.plusThree(): Int {
    return this + 3
}
    output : 13

// Extension Properties
val Int.slice: Int
    get() = this / 2
////////////////////////////
fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this / 2

   output : 5