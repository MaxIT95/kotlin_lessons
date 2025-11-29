package lesson_18

fun main() {
    val bones1 = FourBones(4)
    val bones2 = SixBones(6)
    val bones3 = EightBones(8)

    val listBones = arrayListOf<Bones>(bones1, bones2, bones3)

    listBones.forEach { it.throwBones() }
}

abstract class Bones(val count: Int) {
    fun throwBones() {
        println((1..count).random())
    }
}

class FourBones(count: Int) : Bones(count)
class SixBones(count: Int) : Bones(count)
class EightBones(count: Int) : Bones(count)