package `Bab I Kotlin Fundamental`
/*
\t: menambah tab ke dalam teks.
\n: membuat baris baru di dalam teks.
\’: menambah karakter single quote kedalam teks.
\”: menambah karakter double quote kedalam teks.
\\: menambah karakter backslash kedalam teks.
*/
fun main() {
    val text = "kotlin is \"Awesome!\""
    val pertama = text[0]

    println("Karakter pertama dari $text adalah huruf $pertama")
}

// Raw
fun main() {
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}