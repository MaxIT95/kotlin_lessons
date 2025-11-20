package lesson_13

const val NO = "нет"

fun main() {

    val contacts = ContactDictionary()

    var name: String
    var phone: Long?
    var company: String?

    while (true) {
        println("введите имя контакта")
        name = readln()
        println("введите номер телефона")
        phone = readln().toLongOrNull()
        println("введите название компании")
        company = readln().let { it.ifEmpty { null } }
        if (phone == null) {
            println("Номер телефона обязательное поле!")
        } else {
            contacts.addContact(PhoneContact(name, phone, company))
            println("Добавить еще один контакт? да/нет")
            if (readln().equals(NO, true)) {
                break
            }
        }
    }
    println("Контакты: $contacts")

}

class ContactDictionary {

    val listContact = mutableListOf<PhoneContact>()

    fun addContact(contact: PhoneContact) {
        listContact.add(contact)
    }

    override fun toString(): String {
        return listContact.toString()
    }
}


class PhoneContact(val name: String, val telephoneNumber: Long, val company: String? = null) {

    override fun toString(): String {
        return "- Имя: $name\n" +
                "- Номер: $telephoneNumber\n" +
                "- Компания: ${company ?: "<не указано>"}"
    }
}