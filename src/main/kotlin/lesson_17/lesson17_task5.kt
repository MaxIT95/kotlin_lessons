package lesson_17

fun main() {
    val user = User("Max", "1234")

    user.login = "Max222"
    println(user.password)
    user.password = "444"
}

class User(_login: String, _password: String) {

    var login = _login
        set(value) {
            field = value
            println("Login changed successfully")
        }

    var password = _password
        set(value) {
            println("You can't change your password")
        }
        get() {
            val strBuilder = StringBuilder()

            for (i in 0..field.length) {
                strBuilder.append("*")
            }
            return strBuilder.toString()
        }
}