package lesson_16
fun main() {

    val user = User("user", "123")
    println("password is correct: ${user.validatePassword("123")}")
}

class User(userName: String, password: String) {
    private val login = userName
    private val passwordValue = password

    fun validatePassword(password: String): Boolean {
        return password == passwordValue
    }
}