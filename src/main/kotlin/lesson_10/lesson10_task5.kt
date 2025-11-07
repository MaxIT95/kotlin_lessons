package lesson_10

const val LOGIN = "user"
const val PASSWORD = "password"
const val TOKEN_LENGTH = 32

fun main() {

    val token = authorization()

    if (token == null) {
        println("Неверный логин или пароль!")
    } else {
        println("Корзина: ${getBucket()}")
    }

}

fun authorization(): String? {

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (login == LOGIN && password == PASSWORD) {
        return generateToken()
    }
    return null
}

fun generateToken(): String {
    val lettersRange = ('a'..'z') + ('A'..'Z')
    val numbersRange = '0'..'9'
    val tokenArray = CharArray(TOKEN_LENGTH)


    for (i in 0.rangeUntil(TOKEN_LENGTH))
        if (i % 2 == 0) {
            tokenArray[i] = lettersRange.random()
        } else {
            tokenArray[i] = numbersRange.random()
        }
    return tokenArray.joinToString("")
}

fun getBucket(): List<String> {
    return listOf("Яйца", "Картошка", "Хлеб")
}

