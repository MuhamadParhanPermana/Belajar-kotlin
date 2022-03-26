package `Bab II Control Flow`

fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("$i")
    }

    ranges.forEach { value ->
        println("value is $value!")
    }
}