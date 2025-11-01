package lesson_7

import java.lang.Thread.sleep

const val PASSWORD_SIZE = 6

fun main() {

    val charPool = 'a'..'z'
    val numberPool = '0'..'9'

    val charArray: CharArray = CharArray(PASSWORD_SIZE)

    val password: StringBuilder = StringBuilder()
    var symbol: Char? = null

    for (i in 1..6) {

        symbol = if (i % 2 == 0) {
            numberPool.random()
        } else {
            charPool.random()
        }
        password.append(symbol)
    }
    println("Password: $password")
}