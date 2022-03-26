package `Bab IV Functional Programming`

// Lambda receiver (this)
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

// Lambda argument (it)
val text = "Hello"
text.let {
    val message = "$it Kotlin"
    println(message)
}