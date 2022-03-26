package `Bab I Kotlin Fundamental`

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isOpen = now > officeOpen

    // Conjunction atau AND (&&)
    val isOpenWithConjunction = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpenWithConjunction")

    // Disjunction atau OR (||)
    val isCloseWithDisjunction = now < officeOpen || now > officeClosed
    println("Office is closed : $isCloseWithDisjunction")

    // Negation atau NOT (!)
    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}