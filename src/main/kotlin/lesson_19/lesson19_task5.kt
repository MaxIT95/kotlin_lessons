package lesson_19

fun main() {

    val humans = mutableListOf<Human>()
    println(
        "Info about person entered in next order: Name," +
                " gender - variants: MALE, FEMALE"
    )

    var name: String
    var gender: Gender
    var continueAddingPeople: String
    val fiveHumans = mutableListOf<Human>()

    while (true) {
        println("Enter name:")
        name = readln()
        println("Enter gender (MALE or FEMALE):")
        gender = readGenderFromConsole(readln())
        fiveHumans.add(Human(name, gender))
        println("Human successfully added. Continue? Yes/No")
        continueAddingPeople = readln()
        humans.addAll(fiveHumans)

        if (fiveHumans.size % 5 == 0) {
            println("Added next five person: $fiveHumans")
            fiveHumans.clear()
        }

        if (continueAddingPeople.equals("No", ignoreCase = true)) {
            break
        }
    }
}

// пользователь может ошибится, пусть вводит пока не попадет во все буквы)
fun readGenderFromConsole(value: String): Gender {
    try {
        return Gender.valueOf(value)
    } catch (e: Exception) {
        println("Error when parsing gender, try again: \n Enter gender (MALE or FEMALE):")
        return readGenderFromConsole(readln())
    }
}

data class Human(val name: String, val gender: Gender) {

}

enum class Gender {
    MALE, FEMALE
}