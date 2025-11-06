package lesson_10

const val LOGIN = "user"
const val PASSWORD = "password"

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
        return "sdfsdg"
    }
    return null
}

fun getBucket(): List<String> {
    return listOf("Яйца", "Картошка", "Хлеб")
}

