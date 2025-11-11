package lesson_11

import lesson_11.Participant.Companion.SPEAK_STATUS
import lesson_11.Participant.Companion.USER_MUTED

fun main() {
    val participant = Participant("user", SPEAK_STATUS)
    val room = RoomCard("обложка", "название", arrayListOf(participant))
    println("Созданная комната: $room")
    room.changeStatusParticipant("user", USER_MUTED)
    println("Измененная комната: $room")
}

class RoomCard(
    val cover: String,
    val titleName: String,
    val participants: ArrayList<Participant>,
) {

    fun addParticipant(participant: Participant) {
        this.participants.add(participant)
        println("Добавлен участник: $participant")
    }

    fun changeStatusParticipant(userName: String, status: String) {
        participants.find { it.nickName == userName }?.status == status
    }

    override fun toString(): String {
        return "cover: $cover, titleName: $titleName, participants: $participants"
    }
}

class Participant(val nickName: String, var status: String) {

    companion object {
        const val SPEAK_STATUS = "разговаривает"
        const val MICRO_OFF = "микрофон выключен"
        const val USER_MUTED = "пользователь заглушен"
    }

    override fun toString(): String {
        return "nickName: $nickName, status: $status"
    }
}