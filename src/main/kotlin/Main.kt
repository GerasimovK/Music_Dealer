package ru.cifrium

fun main () {
    val itemSum1: Int = 3000_00
    val itemDiscount: Int = 100_00
    val itemMaxdiscount: Double = 0.05
    val itemExtradiscount: Double = 0.01
    var FinalPrice: Double

    if (itemSum1 <= 1000_00) {
        FinalPrice = itemSum1 ()
    }
    if (itemSum1 >= 1000_00) but (itemSum1 <= 10_000_00) {
        FinalPrice = itemSum1 - itemDiscount ()
    }
    if (itemSum1 > 10_001_00) {
        FinalPrice = itemSum1 - (itemSum1 * itemMaxdiscount) {
        }
    }

    println("Итого к оплате $FinalPrice")

}