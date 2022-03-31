package `Bab VI Kotlin Generics`

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100) , Car(120))
    val vehicleList = carList
}
/*
Dari contoh di atas, kita melihat bagaimana variance menggambarkan keterkaitan antara carList
dan vehicleList di mana Car merupakan subtipe dari Vehicle.

Nah, itu adalah contoh sederhana bagaimana variance bekerja.
Lalu bagaimana cara membuat kelas generic yang memiliki variance?
Caranya sama seperti ketika kita membuat generic kelas pada umumnya.
Namun untuk tipe parameternya kita membutuhkan kata kunci out untuk covariant atau kunci in untuk contravariant.
*/

// Covariant
interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}
/*
Ketika kita menandai sebuah tipe parameter dengan kata kunci out
maka nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya
sebagai return type. Serta tidak dapat dikonsumsi seperti menjadikannya sebagai
tipe argumen untuk setiap fungsi di dalam kelas tersebut.
*/

// Contravariant
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}
/*
Berbanding terbalik dengan saat kita menandainya dengan kata kunci out,
bagaimana saat kita menandainya dengan dengan kata kunci in ?
Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya
sebagai argumen untuk setiap fungsi yang ada di dalam kelas tersebut
dan tidak untuk diproduksi. Contoh dari deklarasinya bisa kita lihat pada kelas Comparable
*/