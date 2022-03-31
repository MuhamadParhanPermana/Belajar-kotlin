package `Bab VII Concurrency Pada Kotlin`

// Menggunakan launch():
fun main() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

// Menggunakan Job():
fun main() = runBlocking {
    val job = Job()
}

// CoroutineStart.LAZY (job tanpa langsung menjalankannya)
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        TODO("Not implemented yet!")
    }
}

// Menjalankan Job
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start() // Dengan start()
    println("Other task")

    job.join() // Dengan join()
    println("Other task")
}
/*
Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai,
sedangkan join() akan menunda eksekusi sampai job selesai. Jika kode pertama dijalankan
*/

// Membatalkan Job
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
}
/*
Perlu diketahui bahwa jika cancel() dipanggil dalam job baru yang belum dijalankan,
job tersebut tidak akan melalui state Cancelling, melainkan akan langsung memasuki state Cancelled.
Kita juga bisa menambahkan parameter terhadap fungsi cancel(), yaitu parameter cause yang bisa digunakan
untuk memberitahu kenapa sebuah job dibatalkan.

job.cancel(cause = CancellationException("Time is up!"))
*/
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}