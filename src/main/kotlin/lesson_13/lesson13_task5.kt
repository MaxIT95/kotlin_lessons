package lesson_13

const val YES = "да"

fun main() {

    val contacts = ContactDictionaryDto()

    var name: String
    var phone: Long
    var company: String?

    while (true) {
        println("введите имя контакта")
        name = readln()
        println("введите номер телефона")
        try {
            phone = readln().toLong()
        } catch (ex: NumberFormatException) {
            println("Ошибка $ex")
            continue
        }
        phone = readln().toLong()
        println("введите название компании")
        company = readln()

        if (company.isEmpty()) {
            contacts.addContact(PhoneContactDto(name, phone, null))
        } else {
            contacts.addContact(PhoneContactDto(name, phone, company))
        }
        println("Добавить еще один контакт? да/нет")
        if (readln().equals(YES, true)) {
            continue
        }
        break
    }
    println("Контакты: $contacts")

}

class ContactDictionaryDto {

    val listContact = mutableListOf<PhoneContactDto>()

    fun addContact(contact: PhoneContactDto) {
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


class PhoneContactDto(val name: String, val telephoneNumber: Long?, val company: String? = null) {

    override fun toString(): String {
        return "- Имя: $name\n" +
                "- Номер: $telephoneNumber\n" +
                "- Компания: ${company ?: "<не указано>"}"
    }
}
