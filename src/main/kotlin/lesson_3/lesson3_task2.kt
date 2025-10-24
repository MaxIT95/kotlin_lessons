package lesson_3

const val FIO_TEMPLATE: String = "ФИО %s %s %s, возраст %s"

fun main() {
    val name: String = "Татьяна"
    var surname: String = "Андреева"
    val patronymic: String = "Сергеевна"

    var age: Int = 20

    println("ФИО $surname $name $patronymic, возраст $age")
    age = 22
    surname = "Сидорова"

    println("ФИО $surname $name $patronymic, возраст $age")
}