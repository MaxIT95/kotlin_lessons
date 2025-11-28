package lesson_18

fun main() {
    val bones1 = FourBones()
    val bones2 = SixBones()
    val bones3 = EightBones()

    val listBones = arrayListOf<ThrowBones>(bones1, bones2, bones3)

    listBones.forEach { it.throwBones() }
}

interface ThrowBones {
    fun throwBones() {
        println((1..6).random())
    }
}

class FourBones : ThrowBones
class SixBones : ThrowBones
class EightBones : ThrowBones