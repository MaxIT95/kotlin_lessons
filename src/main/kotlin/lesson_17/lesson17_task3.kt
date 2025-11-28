package lesson_17

fun main() {

    val folder = Folder("testFolder", 4, false)

    println(folder.name)
}

class Folder(_name: String, var countFiles: Int, val isSecret: Boolean) {

    val name: String = _name
        get() {
            if (isSecret) {
                return "Folder is secret. Count files: 0"
            } else {
                return "$field, count files: $countFiles"
            }
        }
}