package `Bab III Data Classes dan Collections`

fun main() {
    // List
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true, /*User()*/)
    println(anyList[3])
    /*
    Informasi tambahan
    Mutable List atau list yang dapat di manipulasi kodenya
    val anyList = mutableListOf('a', "Kotlin", 3, true, User())
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array
    */

    // Set
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    print(5 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)
    /*
    Informasi tambahan
    //integerSet.add(6) // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
    */

    // Maps
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])
    // Dengan getValue
    println(capital.getValue("Jakarta"))
    /*
    Hasilnya sama saja. Namun sebenarnya terdapat sebuah perbedaan antara keduanya.
    Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing, konsol akan
    menampilkan hasil null saat key yang dicari tidak ada di dalam Map.
    Sedangkan saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.
    */

    // Menampilkan keys
    val mapKeys = capital.keys
    //mapKeys: [Jakarta, London, New Delhi]

    // Menampilkan values
    val mapValues = capital.values
    //mapValues: [Indonesia, England, India]

    /*
    informasi tambahan
    Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable.
    Mari kita ubah map capital yang sudah kita buat sebelumnya menjadi mutable.

    val mutableCapital = capital.toMutableMap()
    Selanjutnya kita bisa menambahkan key-value baru menggunakan fungsi put().

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
    Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses,
    hasil nya akan sulit untuk diprediksi.
    */
}