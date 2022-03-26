package `Bab IV Functional Programming`

private fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)
}

private fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}