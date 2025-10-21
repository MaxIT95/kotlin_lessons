package lesson_2

fun main() {

    val countWorkers: Int = 50
    val salaryWorker: Int = 30000

    val countIntern: Int = 30
    val salaryIntern: Int = 20000

    // Расходы на выплату зарплаты постоянных сотрудников;
    val salaryConstantWorkers: Int = countWorkers * salaryWorker
    val salaryInterns: Int =  countIntern * salaryIntern
    // Общие расходы по ЗП после прихода стажеров;
    val salaryWorkersAndInterns: Int = salaryConstantWorkers.plus(salaryInterns)

    // Средняя ЗП одного сотрудника после устройства стажеров.

    val averageSalaryAfterInternsComing: Int = salaryWorkersAndInterns / (countWorkers + countIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryConstantWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $salaryWorkersAndInterns")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryAfterInternsComing")
}