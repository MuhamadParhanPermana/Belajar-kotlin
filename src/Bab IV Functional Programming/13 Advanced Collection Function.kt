package `Bab IV Functional Programming`

// Fold
val numbers = listOf(1, 2, 3)
val fold = numbers.fold(10) { current, item -> // val fold = numbers.foldRight(10) { item, current ->
    println("current $current")
    println("item $item")
    println()
    current + item
}

println("Fold result: $fold")

// Drop
val number = listOf(1, 2, 3, 4, 5, 6)
val drop = number.drop(3) // val drop = number.dropLast(3)

println(drop)

// Take
val total = listOf(1, 2, 3, 4, 5, 6)
val take = total.take(3) // val take = total.takeLast(3)

println(take)

// Slice
val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val slice = total.slice(3..6) // val slice = total.slice(3..6 step 2)

println(slice)
/*
Versi Lebih spesifiknya
val index = listOf(2, 3, 5, 8)
val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val slice = total.slice(index)

println(slice)
*/

// Distinct
val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
val distinct = total.distinct()

println(distinct)

// Chunked
val word = "QWERTY"
val chunkedTransform = word.chunked(3) { // val chunked = word.chunked(3)
    it.toString().toLowerCase()
}

println(chunked)