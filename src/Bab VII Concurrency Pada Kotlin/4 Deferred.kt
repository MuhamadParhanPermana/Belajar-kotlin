package `Bab VII Concurrency Pada Kotlin`

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}