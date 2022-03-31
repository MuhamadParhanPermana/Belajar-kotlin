package `Bab V Object-Oriented Programming`

abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    val animal = Animal("dicoding animal", 2.6, 1, true)
}