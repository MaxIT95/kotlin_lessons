package lesson_7

const val MIN_LENGTH_PASSWORD = 6
const val INIT_COUNT_CHAR = 3

fun main() {

    val downCharRange = 'a'..'z'
    val upperCharRange = 'A'..'Z'
    val numberRange = '0'..'9'
    val allCharsAndNumbersRange = downCharRange + upperCharRange + numberRange

    println("Введите желаемую длину пароля")
    var passwordLength = readln().toInt()

    if (passwordLength < MIN_LENGTH_PASSWORD) {
        println("Минимальная длина пароля - $MIN_LENGTH_PASSWORD")
        passwordLength = MIN_LENGTH_PASSWORD
    }

    val listChars = mutableListOf<Char>()

    // первые три символа заполняем из трех range
    listChars.add(downCharRange.random())
    listChars.add(upperCharRange.random())
    listChars.add(numberRange.random())

    // далее рандом на оставшееся кол-во символов
    for (i in 1..passwordLength - INIT_COUNT_CHAR) {
        val char = allCharsAndNumbersRange.random()
        listChars.add(char)
    }
    println("$listChars")
    listChars.shuffle()
    println("$listChars")
}