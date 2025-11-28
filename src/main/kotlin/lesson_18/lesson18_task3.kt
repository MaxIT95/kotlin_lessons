package lesson_18

fun main() {

    val tamagochi = Tamagochi()
    val dog = Dog("Jack", "bones")
    val cat = Cat("Catty", "fish")
    val fox = Fox("Sonya", "berries")

    val listAnimal = listOf<Animal>(dog, cat, fox)

    listAnimal.forEach { tamagochi.doAction(it, AnimalAction.EAT) }
}

class Tamagochi {

    fun doAction(animal: Animal, action: AnimalAction) {
        when (action) {
            AnimalAction.EAT -> animal.eat()
            AnimalAction.SLEEP -> animal.sleep()
        }
    }
}

abstract class Animal(val name: String, val food: String) {

    fun eat() {
        println("$name -> eating $food")
    }

    fun sleep() {
        println("$name -> sleeping")
    }
}

class Dog(name: String, food: String) : Animal(name, food)
class Cat(name: String, food: String) : Animal(name, food)
class Fox(name: String, food: String) : Animal(name, food)

enum class AnimalAction {
    SLEEP, EAT
}