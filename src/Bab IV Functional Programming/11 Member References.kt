package `Bab IV Functional Programming`

/*
saat mendeklarasikan sebuah lambda dengan function type, kita bisa menggunakannya seperti berikut:
*/
val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }

// Reflection
val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}

// Function References (::)
fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber) // val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
}

fun isEvenNumber(number: Int) = number % 2 == 0 // fun Int.isEvenNumber() = this % 2 == 0

// Property References
var message = "Kotlin"

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}