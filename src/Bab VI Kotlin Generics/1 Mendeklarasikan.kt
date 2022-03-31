package `Bab VI Kotlin Generics`

// Interface
interface List<T>{
    operator fun get(index: Int) : T
}

// Class
class LongList : List<Long>{
    override fun get(index: Int): Long {
        /* .. */
    }
}
class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        /* .. */
    }
}

// Functions
fun <T> run(): T {
    /*...*/
}

// Constraint Type Parameter (membatasi tipe apa saja yang dapat digunakan sebagai parameter.)
class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        /* .. */
    }
}