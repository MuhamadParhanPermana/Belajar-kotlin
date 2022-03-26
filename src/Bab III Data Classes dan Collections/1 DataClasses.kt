package `Bab III Data Classes dan Collections`

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int) {
    // Behaviour
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    // Tanpa data class
    val user = User("nrohmen", 17)
    println(user)

    // Dengan data class
    val dataUser = DataUser("nrohmen", 17)
    println(dataUser)

    // Copy
    val dataUser4 = dataUser.copy()
    println(dataUser4)
    val dataUser5 = dataUser.copy(name = "farhan",age = 19)
    println(dataUser5)

    // Destructuring Declarations
    val name = dataUser5.component1()
    val age = dataUser5.component2()
    /*
    Versi lebih sederhananya
    val (name, age) = dataUser5
    */
    println("My name is $name, I am $age years old")

    // behaviour
    dataUser.intro()
}