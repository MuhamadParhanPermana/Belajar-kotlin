package `Bab IV Functional Programming`

// Let
fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
}
/*
Dengan menggunakan fungsi let seperti pada kode di atas,
kita bisa mengurangi penggunaan operator safe call seperti berikut:
fun main() {
    val message: String? = null
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)
}
*/

// Also
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}