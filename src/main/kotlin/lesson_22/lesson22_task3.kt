package lesson_22

fun main() {
    val testObject = TestDataClass("Nick", 21, "Chicago")
    val (name, age, city) = testObject

    println("$name, $age, $city")
}


data class TestDataClass(val name: String, val age: Int, val city: String)