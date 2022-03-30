package `Bab IV Functional Programming`

// Run
fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}

// With
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}

// Apply
fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}