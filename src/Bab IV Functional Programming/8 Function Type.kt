package `Bab IV Functional Programming`

typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

// Kita bisa memanfaatkan operator invoke() untuk membuat instance dari sebuah function type
val sumResult = sum.invoke(10, 10)
val multiplyResult = multiply.invoke(20, 20)

// Atau kita bisa langsung saja tanpa invoke()
val sumResult = sum(10, 10)
val multiplyResult = multiply(20, 20)

// Penggunaan safe call nya
typealias Arithmetic = ((Int, Int) -> Int)?
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
sum?.invoke(10, 20)
