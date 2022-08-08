package ru.cifrium

fun main () {
    // сумма текущей покупки
    var itemCurrentSum: Int = 1000_00

    //  сумма предыдущих покупок
    val itemSum1: Int = 30000_00

    // если пользователь покупает каждый месяц - ставим true, если нет - то false
    var history: Boolean = true

    val itemDiscount: Int = 100_00
    val itemMaxDiscount: Double = 0.05
    val itemExtradiscount: Double = 0.01
    var finalPrice: Int = itemCurrentSum
    var itemCurrentDiscountSum: Int = 0


    if (itemSum1 >= 1001_00 && itemSum1 <= 10_000_00){
        itemCurrentDiscountSum = itemDiscount
    }
    if (itemSum1 > 10_001_00) {
        itemCurrentDiscountSum = (finalPrice * itemMaxDiscount).toInt()
    }
    finalPrice = finalPrice - itemCurrentDiscountSum

    if (history == true){
        finalPrice = finalPrice - (finalPrice * itemExtradiscount).toInt()
    }
    println("Your final price is $finalPrice")
}
