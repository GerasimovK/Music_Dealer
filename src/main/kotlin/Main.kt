package ru.cifrium

fun main () {
    val itemSum1: Double = 3000_00.00
    val itemDiscount: Int = 100_00
    val itemMaxdiscount: Double = 0.05
    val itemExtradiscount: Double = 0.01
    var finalPrice: Double

    if (itemSum1 <= 1000_00) {
        finalPrice = itemSum1.toDouble()
    }
    if (itemSum1 >= 1000_00 && itemSum1 <= 10_000_00) {
        finalPrice = (itemSum1 - itemDiscount).toDouble()
    }
    if (itemSum1 > 10_001_00) {
        finalPrice = itemSum1 - (itemSum1 * itemMaxdiscount) {
        }
    }

    println("Итого к оплате $finalPrice")
    // Проверка изменений 3

}
