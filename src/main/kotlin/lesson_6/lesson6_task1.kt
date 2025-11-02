package lesson_6

fun main() {

    println("Регистрация\n")
    println("Придумайте логин\n")

    val login = readln();

    println("Придумайте пароль")
    val password = readln();

    println("Учетная запись создана")

    while (true) {
        println("Введите логин")
        val loginFromConsole = readln()

        println("Введите пароль")
        val passwordFromConsole = readln()

        if (login == loginFromConsole && password == passwordFromConsole) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверно указан логин/пароль")
        }
    }
}