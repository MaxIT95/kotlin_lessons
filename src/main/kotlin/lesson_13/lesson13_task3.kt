package lesson_13

import java.util.Random

fun main() {

    val random = Random()

    val contacts = listOf(
        TelephoneContactInfo("name1", random.nextLong(), "GoodCompany"),
        TelephoneContactInfo("name2", random.nextLong(), null),
        TelephoneContactInfo("name3", random.nextLong(), "null"),
        TelephoneContactInfo("name4", random.nextLong(), "CosmicCompany"),
        TelephoneContactInfo("name5", random.nextLong(), null)
    )
    println("Компании: ${contacts.mapNotNull { it.company }}")
}

class TelephoneContactInfo(val name: String, val telephoneNumber: Long, val company: String? = null) {

    fun printInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $telephoneNumber\n" +
                    "- Компания: ${company ?: "<не указано>"}"
        )
    }
}