package `Bab V Object-Oriented Programming`
/*
Class: Merupakan sebuah blueprint yang terdapat properti dan fungsi di dalamnya
Properties: Karakteristik dari sebuah kelas, memiliki tipe data.
Functions: Kemampuan atau aksi dari sebuah kelas.
*/
class Animal( // Class
             val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean // Properties
) {

    fun eat(){ // Functions
        println("$name makan !")
    }
}