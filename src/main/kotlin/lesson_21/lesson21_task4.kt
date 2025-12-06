package lesson_21

import java.io.File

fun main() {

    val file = File("C:\\Users\\kules\\OneDrive\\Рабочий стол\\шлюз\\text.txt")

    file.createNewFile()
    file.writeToBeginningFile("Кек\n")
    file.writeToBeginningFile("Кукареку\n")
    file.writeToBeginningFile("Привет!\n")
}

fun File.writeToBeginningFile(text: String) {
    writeText(text.lowercase() + readText())
}