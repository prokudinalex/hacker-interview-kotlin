package com.prokudin.p02.arrays

import java.util.*

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var max = Int.MIN_VALUE
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            if (i > 0 && i < arr.size - 1
                    && j > 0 && j < arr.size - 1) {
                val sum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] +
                        arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1]
                if (sum >= max) {
                    max = sum
                }
            }
        }
    }
    return max
}

fun main() {
    val scan = Scanner(System.`in`)
    val arr = Array(6) { Array<Int>(6) { 0 } }
    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }
    println(hourglassSum(arr))
}
