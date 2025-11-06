package lesson_10

fun main() {

    val bonesValues = 1..6

    val machineResult = throwBones(bonesValues)
    val humanResult = throwBones(bonesValues)

    println("Ход машины: $machineResult")
    println("Ход человека: $humanResult")

    if (machineResult > humanResult) {
        println("Победила машина")
    } else if (machineResult < humanResult) {
        println("Победил человечество")
    } else {
        println("Победила дружба!")
    }
}

fun throwBones(bonesValues: IntRange): Int {
    return bonesValues.random()
}