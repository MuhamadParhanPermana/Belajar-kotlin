package `Bab VII Concurrency Pada Kotlin`

/*
launch
Seperti yang sudah kita coba sebelumnya, fungsi ini digunakan untuk memulai sebuah coroutines
yang tidak akan mengembalikan sebuah hasil. launch akan menghasilkan Job yang bisa kita gunakan
untuk membatalkan eksekusi.

runBlocking
Fungsi ini dibuat untuk menjembatani blocking code menjadi kode yang dapat ditangguhkan.
runBlocking akan memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai.
Seperti contoh sebelumnya, kita bisa menggunakannya pada fungsi main() dan bisa juga untuk penerapan unit test.

async
Kebalikan dari launch, fungsi ini digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil.
Ketika menggunakannya, Anda harus berhati-hati karena ia akan menangkap setiap exception yang terjadi
di dalam coroutine. Jadi async akan mengembalikan Deferred yang berisi hasil atau exception.
Ketika yang dikembalikan adalah exception, maka Anda harus siap untuk menanganinya.
*/

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

// Async
fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}