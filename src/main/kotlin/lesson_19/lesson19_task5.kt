package lesson_19

fun main() {

    val humans = mutableListOf<Human>()
    println(
        "Info about person entered in next order: Name," +
                " gender - variants: MALE, FEMALE"
    )

    var name: String
    var gender: Gender

    repeat(5) {
        println("Enter name:")
        name = readln()
        println("Enter gender (MALE or FEMALE):")
        gender = readGenderFromConsole(readln())
        humans.add(Human(name, gender))
        println("Human successfully added.")
    }

    println(humans)
}

fun readGenderFromConsole(value: String): Gender {
    while (true) {
        try {
            return Gender.valueOf(value)
        } catch (e: Exception) {
            println("Error when parsing gender, try again: \n Enter gender (MALE or FEMALE):")
            continue
        }
    }
}

data class Human(val name: String, val gender: Gender)

enum class Gender {
    MALE, FEMALE
}