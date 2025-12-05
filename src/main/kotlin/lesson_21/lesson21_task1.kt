package lesson_21

fun main() {
    println("Hello".vowelCount())
}

val vowels = arrayOf('a', 'e', 'i', 'o', 'y')

fun String.vowelCount(): Int {
    var countVowels = 0

    this.lowercase().forEach {
        if (vowels.contains(it)) {
            countVowels++
        }
    }
    return countVowels
}