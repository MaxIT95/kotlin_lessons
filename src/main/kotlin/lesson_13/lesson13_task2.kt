package lesson_13

fun main() {
    val contact = TelephoneContact("test", 123L, null)
    contact.printInfo()
}

class TelephoneContact(val name: String, val telephoneNumber: Long, val company: String? = null) {

    fun printInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $telephoneNumber\n" +
                    "- Компания: ${company ?: "<не указано>"}"
        )
    }
}