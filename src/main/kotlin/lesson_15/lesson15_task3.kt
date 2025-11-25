package lesson_15

fun main() {
    val user1 = User("Max")
    val user2 = User("John")
    val admin = Admin("Kurt")

    admin.addUser(user1)
    admin.addUser(user2)
    admin.removeUser(user1)
}
abstract class SimpleUser(val name: String)

interface AdminAccessibility {
    fun addUser(user: SimpleUser)
    fun removeUser(user: SimpleUser)
}

class User(name: String) : SimpleUser(name) {}
class Admin(name: String) : SimpleUser(name), AdminAccessibility {

    override fun addUser(user: SimpleUser) {
        println("Добавляю юзера: ${user.name}")
    }

    override fun removeUser(user: SimpleUser) {
        println("Удаляю юзера: ${user.name}")
    }
}