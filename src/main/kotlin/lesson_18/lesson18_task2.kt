package lesson_18

fun main() {
    val bones1 = FourBones()
    val bones2 = SixBones()
    val bones3 = EightBones()

    val listBones = arrayListOf<Bones>(bones1, bones2, bones3)

    listBones.forEach { it.throwBones() }
}

abstract class Bones(val count: Int) {
    fun throwBones() {
        println((1..count).random())
    }
}

class FourBones : Bones(4)
class SixBones : Bones(6)
class EightBones : Bones(8)