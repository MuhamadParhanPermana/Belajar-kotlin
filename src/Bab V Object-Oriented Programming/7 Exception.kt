package `Bab V Object-Oriented Programming`

// ArithmeticException (merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol)
fun main() {
    val someValue = 6
    println(someValue / 0)
}

// NumberFormatException (disebabkan karena terjadi kesalahan dalam format angka)
fun main() {
    val someStringValue = "18.0"
    println(someStringValue.toInt())
}

// NullPointerException (terjadi karena sebuah variabel atau objek memiliki nilai null)
fun main() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}
