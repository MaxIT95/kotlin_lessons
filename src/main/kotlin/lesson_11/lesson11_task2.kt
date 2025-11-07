package lesson_11

fun main() {

    val user = User2("123", "user1", "test@mail.ru", "pass123", null)

    println("user: $user")

    user.changePassword()
}

class User2(
    val uuid: String,
    val login: String,
    val post: String,
    var password: String,
    var bio: String?
) {
    override fun toString(): String {
        return "Uuid: $uuid, login: $login, post: $post, password: $password, bio: $bio"
    }

    fun readBioFromConsole() {
        this.bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль")

        if (this.password == readln()) {
            println("Введите новый пароль")
            this.password = readln()
            println("Пароль изменен успешно!")
        } else {
            println("Пароль введен неверно!")
        }
    }
}