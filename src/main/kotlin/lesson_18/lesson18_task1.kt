package lesson_18

fun main() {

    val order1 = Order(1)
    val order2 = Order(2)

    order1.printOrderInfo("product1")
    order2.printOrderInfo(listOf("product1", "product2"))
}

class Order(_id: Int) {

    val id = _id

    fun printOrderInfo(item: String) {
        println("Заказан товар: [$item]")
    }

    fun printOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: $items")
    }
}