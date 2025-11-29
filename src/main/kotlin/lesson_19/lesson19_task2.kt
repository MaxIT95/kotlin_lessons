package lesson_19

fun main() {
    val item1 = Item(1, "sweatshot", Category.CLOTHING)
    val item2 = Item(2, "pen", Category.CHANCELLERY)
    val item3 = Item(3, "WATER", Category.OTHER)

    item1.printInfo()
    item2.printInfo()
    item3.printInfo()
}
class Item(val id: Int, val name: String, val category: Category) {

    fun printInfo() {
        println("$id, $name, ${category.getName()}")
    }
}

enum class Category(val categoryName: String) {
    CLOTHING("одежда"), CHANCELLERY("канцелярия"), OTHER("другое");

    fun getName(): String = when (this) {
        CLOTHING -> CLOTHING.categoryName
        CHANCELLERY -> CHANCELLERY.categoryName
        OTHER -> OTHER.categoryName
    }
}