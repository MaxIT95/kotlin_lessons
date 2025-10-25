package lesson_4

const val TABLE_COUNT = 13

fun main() {

    val reservedTodayTables = 13
    val reservedTomorrowTables = 9

    println(
        "Доступность столиков на сегодня: ${TABLE_COUNT - reservedTodayTables > 0}\n" +
                "Доступность столиков на завтра: ${TABLE_COUNT - reservedTomorrowTables > 0}"
    )


}
