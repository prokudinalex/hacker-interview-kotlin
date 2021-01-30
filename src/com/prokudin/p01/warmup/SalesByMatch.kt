package com.prokudin.p01.warmup

import java.util.*

/*
    Counts pairs of socks
 */
fun sockMerchant(ar: Array<Int>): Int {
    return ar.groupBy { it }
            .map { it.value.size / 2 }
            .sum()
}
/*
    9
    10 20 20 10 10 30 50 10 20
    3
 */
fun main() {
    val scan = Scanner(System.`in`)
    scan.nextLine()
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = sockMerchant(ar)
    println(result)
}
