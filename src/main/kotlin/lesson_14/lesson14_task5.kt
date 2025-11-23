package lesson_14

import kotlin.random.Random

fun main() {
    val chat = Chat()

    val message1 = chat.addMessage("Max", "Hello friend!")
    val message2 = chat.addMessage("Max", "Hello friend!")

    val chileMessage1 = chat.addThreadMessage(message1.messageId, "John", "Hello Max! Have a good day")
    val chileMessage2 = chat.addThreadMessage(message1.messageId, "Andrew", "Hi Max! Cool boy")
    val chileMessage3 = chat.addThreadMessage(message2.messageId, "Sanchez", "Hello boys! Common everybody")

    chat.printChat()
}

class Chat() {

    var messages = mutableListOf<Message>()
    var childMessages = mutableListOf<ChildMessage>()

    fun addMessage(author: String, text: String): BaseMessage {
        val message = Message(Random.nextInt(), author, text)
        messages.add(message)

        return message
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String): BaseMessage {
        val childMessage = ChildMessage(parentMessageId, Random.nextInt(), author, text)
        childMessages.add(childMessage)

        return childMessage
    }

    fun printChat() {
        messages.forEach { mainMessage ->
            println("${mainMessage.author}: ${mainMessage.text}")
            childMessages.filter { it.parentMessageId == mainMessage.messageId }.forEach {
                println("\t ${it.author}: ${it.text}")
            }
        }
    }
}


abstract class BaseMessage(val messageId: Int, val author: String, val text: String)

class Message(messageId: Int, author: String, text: String) : BaseMessage(messageId, author, text)

class ChildMessage(val parentMessageId: Int, messageId: Int, author: String, text: String) :
    BaseMessage(messageId, author, text)