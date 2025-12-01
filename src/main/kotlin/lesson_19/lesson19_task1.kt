package lesson_19

fun main() {
    val aquarium = Aquarium()

    aquarium.printTypeFishToAdd()
}
class Aquarium {

    fun printTypeFishToAdd() {
        println("You can add  ${FisnType.entries}")
    }
}

enum class FisnType {
    GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH
}