package `Bab III Data Classes dan Collections`

fun main() {
    /*filter() dan filterNot()*/
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    // evenList: [2, 4, 6, 8, 10] filter()
    // untuk menyaring bilangan yang habis dibagi 2 (dua)
    // atau biasa disebut dengan bilangan genap

    val notEvenList = numberList.filterNot { it % 2 == 0 }
    // notEvenList: [1, 3, 5, 7, 9]
    // filterNot() kebalikannya dari filters()

    /*map()*/
    val multipliedBy5 = numberList.map { it * 5 }
    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    /*count()*/
    print(numberList.count())
    // Output: 10
    print(numberList.count { it % 3 == 0 })
    // Output: 3

    /*find(), firstOrNull(), & lastOrNull()*/
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    // firstOddNumber: 1
    // firstOrNullNumber: null

    /*first() & last()*/
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)
    // Output: Exception in thread "main" java.util.NoSuchElementException:
    // Collection contains no element matching the predicate.

    /*sum()*/
    val total = numberList.sum()
    // total: 55

    /*sorted()*/
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    // ascendingSort: [i, k, l, n, o, t]

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
    // descendingSort: [t, o, n, l, k, i]
}