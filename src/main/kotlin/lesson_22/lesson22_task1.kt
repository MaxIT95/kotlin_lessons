package lesson_22

fun main() {
    val regBook1 = RegularBook("book1", "Ivan Ivanov")
    val regBook2 = RegularBook("book1", "Ivan Ivanov")
    val dataBook1 = DataBook("book2", "Oleg")
    val dataBook2 = DataBook("book2", "Oleg")
    // выведет false, т.к. сравниваем ссылки
    println(regBook1 == regBook2)
    // выведет true, т.к. сравниваем значение свойств
    println(dataBook1 == dataBook2)
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)