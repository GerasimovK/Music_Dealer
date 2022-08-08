package ru.cifrium

fun main () {
    // сумма текущей покупки
    var itemCurrentSum: Int = 1000_00

    //  сумма предыдущих покупок
    val itemSum1: Int = 3000_00

    // если пользователь покупает каждый месяц - ставим true, если нет - то false
    var history: Boolean = true

    val itemDiscount: Int = 100_00
    val itemMaxDiscount: Double = 0.05
    val itemExtradiscount: Double = 0.01
    var finalPrice: Int = itemCurrentSum

    if ( itemSum1 > 1 && itemSum1 <= 1000 && history == true){
        finalPrice = (itemCurrentSum - (itemCurrentSum * itemExtradiscount)).toInt()
    }
    if (itemSum1 >= 1001_00 && itemSum1 <= 10_000_00 && history == true) {
        finalPrice = ((itemCurrentSum - itemDiscount)).toInt()
        finalPrice = finalPrice - (finalPrice * itemExtradiscount).toInt()
    }
    if (itemSum1 >= 1001_00 && itemSum1 <= 10_000_00 && history == false) {
        finalPrice = ((itemCurrentSum - itemDiscount)).toInt()
    }
    if (itemSum1 > 10_001_00 && history == true) {
        finalPrice = (itemCurrentSum - (itemCurrentSum * itemMaxDiscount)).toInt()
        finalPrice = finalPrice - (finalPrice * itemExtradiscount).toInt()
    }
    if (itemSum1 > 10_001_00 && history == false) {
        finalPrice = (itemCurrentSum - (itemCurrentSum * itemMaxDiscount)).toInt()
    }
    println("Your final price is $finalPrice")
}
