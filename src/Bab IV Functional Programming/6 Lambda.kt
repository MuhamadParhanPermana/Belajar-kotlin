package `Bab IV Functional Programming`

/*
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}
*/

// Dengan lambda, kita bisa menyederhanakannya menjadi seperti di bawah ini:
val comparator = Runnable {
    // TODO:
}

// Menggunakan Lambda Expression
val message = { println("Hello From Lambda") }

fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }

// Higher-Order Function
fun main() {
    printResult(10){ value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
   output : 20

// Lambda with receiver
fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
   output : Hello from lambda

/* Function Type (typealias) cocok digunakan ketika kita mempunyai sebuah function type yang panjang.
Dengannya, kita bisa memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya.

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
*/
