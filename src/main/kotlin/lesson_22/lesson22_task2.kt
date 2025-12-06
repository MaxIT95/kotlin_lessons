package lesson_22

fun main() {
    val regBook1 = RegularBookSecondVer("book1", "Ivan Ivanov")
    val dataBook1 = DataBookSecondVer("book2", "Oleg")
    // выводится имя класса + hash объекта, т.к. toString() не переопределен
    println(regBook1)
    // выводится состояние объекта (свойства, т.к. toString переопределен)
    println(dataBook1)
}

class RegularBookSecondVer(val name: String, val author: String)

data class DataBookSecondVer(val name: String, val author: String)