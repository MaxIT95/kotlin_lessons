package lesson_13

const val YES = "да"

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
        company = readln()

        if (company.isEmpty()) {
            contacts.addContact(PhoneContact(name, phone, null))
        } else {
            contacts.addContact(PhoneContact(name, phone, company))
        }
        println("Добавить еще один контакт? да/нет")
        if (readln().equals(YES, true)) {
            continue
        }
        break
    }
    println("Контакты: $contacts")

}

class ContactDictionary {

    val listContact = mutableListOf<PhoneContact>()

    fun addContact(contact: PhoneContact) {
        if (contact.telephoneNumber == null) {
            println("Номер телефона обязательное поле!")
        } else {
            listContact.add(contact)
        }
    }

    override fun toString(): String {
        return listContact.toString()
    }
}


class PhoneContact(val name: String, val telephoneNumber: Long?, val company: String? = null) {

    override fun toString(): String {
        return "- Имя: $name\n" +
                "- Номер: $telephoneNumber\n" +
                "- Компания: ${company ?: "<не указано>"}"
    }
}