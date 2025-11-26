package lesson_16

fun main() {
    val cube = Cube()

    cube.getRandomValue()
}

class Cube {
    private val randomInt = (1..6).random()

    fun getRandomValue() {
        println("Bones value: $randomInt")
    }
}