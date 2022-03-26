package `Bab I Kotlin Fundamental`

fun main() {
    val text: String? = null

    // Cara Biasa
    if (text != null){
        val textLength = text.length // ready to go
    }

    // Safe calls operator (?.)
    text?.length

    // Elvis Operator (?:)
    val textLength = text?.length ?: 7
}