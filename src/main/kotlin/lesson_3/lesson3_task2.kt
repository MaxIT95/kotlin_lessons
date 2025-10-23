package lesson_3

const val FIO_TEMPLATE: String = "ФИО %s %s %s, возраст %s"

fun main() {
    val name: String = "Татьяна"
    val surname: String = "Андреева"
    val patronymic: String = "Сергеевна"

    var age: Int = 20

    println(FIO_TEMPLATE.format(surname, name, patronymic, age))
    age = 22
    val surnameAfterMarriage: String = "Сидорова"

    println(FIO_TEMPLATE.format(surnameAfterMarriage, name, patronymic, age))

}
