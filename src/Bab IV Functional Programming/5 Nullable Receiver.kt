package `Bab IV Functional Programming`

// Elvis operator
val Int?.slice: Int
    get() = this?.div(2) ?: 0

fun main() {
    val value: Int? = null

    println(value.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0

/* Kita juga bisa menentukan nilai dari receiver object jika bernilai null.
Sehingga kita tidak perlu lagi menggunakan operator safe call ketika ingin memanggil extension tersebut. */
fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slice)
    println(value1.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0