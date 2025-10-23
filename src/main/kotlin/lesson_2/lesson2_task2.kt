package lesson_2

fun main() {

    val countWorkers: Int = 50
    val salaryWorker: Int = 30000

    val countIntern: Int = 30
    val salaryIntern: Int = 20000

    val salaryConstantWorkers: Int = countWorkers * salaryWorker
    val salaryInterns: Int =  countIntern * salaryIntern
    val salaryWorkersAndInterns: Int = salaryConstantWorkers.plus(salaryInterns)
    val averageSalaryAfterInternsComing: Int = salaryWorkersAndInterns / (countWorkers + countIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryConstantWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $salaryWorkersAndInterns")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryAfterInternsComing")
}