package com.prokudin.p03.greedy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun getMinimumCost(k: Int, c: Array<Int>): Int {
    c.sortWith(reverseOrder())
    var totalCost = 0
    for (i in c.indices) {
        val originalCost = c[i]
        totalCost += (i / k + 1) * originalCost
    }
    return totalCost
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()
    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val minimumCost = getMinimumCost(k, c)
    println(minimumCost)
}
