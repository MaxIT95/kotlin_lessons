package lesson_16

fun main() {
    val order = StoreOrder(1, Status.IN_PROGRESS)
    order.changeStatus(Status.COMPLETED)
}

class StoreOrder(id: Int, status: Status) {
    private val orderNumber = id
    private var statusValue = status

    fun changeStatus(status: Status) {
        setStatus(status)
        println("Current status $statusValue")
    }

    private fun setStatus(status: Status) {
        this.statusValue = status
    }
}

enum class Status {
    IN_PROGRESS, COMPLETED
}