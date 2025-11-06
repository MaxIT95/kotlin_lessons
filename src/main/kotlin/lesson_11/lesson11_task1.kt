package lesson_11

fun main() {

    val user1 = User("123", "user1", "test@mail.ru", "pass123")
    val user2 = User("456", "user1", "test222@mail.ru", "pass456")

    println("user1: $user1")
    println("user2: $user2")
}

class User(
    val uuid: String,
    val login: String,
    val post: String,
    val password: String
) {

    override fun toString(): String {
        return "Uuid: $uuid, login: $login, post: $post, password: $password"
    }
}
