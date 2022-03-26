package `Bab III Data Classes dan Collections`

fun main() {
    val list = (1..1000000).toList()
    // Tanpa sequences
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // Dengan sequences
    list.asSequence() { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // Dengan generateSequences
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}