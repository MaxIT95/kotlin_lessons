package lesson_10

fun main() {
    println("Введите длину пароля")
    val passwordLength = readln().toInt()

    val password = generatePassword(passwordLength)
    println("Пароль: $password")
}

fun generatePassword(length: Int): String {
    val specialSymbols = '!'..'/'
    val numbers = '0'..'9'

    val password = CharArray(length)

    var i = 0

    while (i < length) {
        if (i % 2 == 0) {
            password[i] = numbers.random()
        } else {
            password[i] = specialSymbols.random()
        }
        i++
    }
    return password.joinToString("")
}

