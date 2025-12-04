package lesson_19

fun main() {

    val tank = Tank()
    tank.armoring(Bullet.GREEN)
    tank.shot()

    tank.armoring(Bullet.RED)
    tank.shot()

    tank.armoring(Bullet.BLUE)
    tank.shot()
}

class Tank {

    var currentBulletType: Bullet? = null

    fun armoring(bullet: Bullet) {
        this.currentBulletType = bullet
    }

    fun shot() {
        println("Shot with damage: ${currentBulletType?.value}")
    }
}

enum class Bullet(val value: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}
