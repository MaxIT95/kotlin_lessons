package lesson_15

fun main() {
    val musicTool = MusicTool("guitar", 1, listOf(SpareParts("string", 1)))
    musicTool.findSparePart("string")
}

abstract class Item(val name: String, val count: Int)

interface FindSpareParts {
    fun findSparePart(name: String)
}

class MusicTool(name: String, count: Int, val spareParts: List<SpareParts>) : Item(name, count), FindSpareParts {

    override fun findSparePart(name: String) {
        println("Try to find part: $name...")
    }
}

class SpareParts(name: String, count: Int) : Item(name, count)