package lesson_11

import kotlin.random.Random

fun main() {
    val forum = Forum()

    val memberMax = forum.createNewUser("Max")
    val memberAndrew = forum.createNewUser("Andrew")
    forum.createNewMessage(memberMax.userId, "Привет Андрей!")
    forum.createNewMessage(memberAndrew.userId, "Привет Макс!")
    forum.createNewMessage(memberMax.userId, "Пока Андрей")
    forum.createNewMessage(memberAndrew.userId, "Пока Макс...")

    forum.printThread()
}

class Forum {
    val members = mutableListOf<MemberForum>()
    val messages = mutableListOf<MessageForum>()

    fun createNewUser(userName: String): MemberForum {
        val userId = Random.nextInt()
        val member = MemberForum(userId, userName)
        members.add(member)

        return member
    }

    fun createNewMessage(userId: Int, message: String) {
        val member = members.find { it.userId == userId }

        if (member != null) {
            messages.add(MessageForum(userId, message))
        }
    }

    fun printThread() {
        messages.forEach { msg ->
            val member = members.find { msg.authorId == it.userId }

            println("${member?.userName}: ${msg.message}")
        }
    }
}

class MemberForum(val userId: Int, val userName: String)
class MessageForum(val authorId: Int, val message: String)
