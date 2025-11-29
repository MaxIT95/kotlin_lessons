package lesson_19

fun main() {
    val aquarium = Aquarium()

    aquarium.printTypeFishToAdd()
}
class Aquarium {

    fun printTypeFishToAdd() {
        println("You can add  ${FisnType.GUPPY}, ${FisnType.ANGELFISH}," +
                " ${FisnType.GOLDFISH}, ${FisnType.SIAMESE_FIGHTING_FISH}")
    }
}

enum class FisnType {
    GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH
}