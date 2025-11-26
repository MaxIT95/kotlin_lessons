package lesson_15

fun main() {
    val user1 = User("Max")
    val admin = Admin("Kurt")

    val msgId = user1.writeMessage("Hello")
    user1.readForum()
    user1.readForum()
    admin.deleteUser(user1)
    admin.deleteMessage(msgId)
}

abstract class SimpleUser(val name: String) {

    var messageId: Int = 1

    fun readForum() {
        println("$name read forum...")
    }

    fun writeMessage(message: String): Int {
        println("${name}: $message")
        return messageId++
    }
}

interface AdminAccessibility {
    fun deleteMessage(messageId: Int)
    fun deleteUser(user: SimpleUser)
}

class User(name: String) : SimpleUser(name)

class Admin(name: String) : SimpleUser(name), AdminAccessibility {

    override fun deleteMessage(messageId: Int) {
        println("Remove message with id: $messageId")
    }

    override fun deleteUser(user: SimpleUser) {
        println("Remove user: ${user.name}")
    }
}