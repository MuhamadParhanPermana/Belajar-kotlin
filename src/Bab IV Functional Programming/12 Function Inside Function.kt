package `Bab IV Functional Programming`

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) { // fun Int.validateNumber(){
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB
}