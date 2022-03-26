package `Bab I Kotlin Fundamental`
/*
intArrayOf() : IntArray
booleanArrayOf() : BooleanArray
charArrayOf() : CharArray
longArrayOf() : LongArray
shortArrayOf() : ShortArray
byteArrayOf() : ByteArray
*/
fun main() {
    // val array = arrayOf(1, 3, 5, 7)
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}