package com.prokudin.p03.greedy

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    arr.sort()
    var min = abs(arr[0] - arr[1])
    for (i in 1 until arr.size - 1) {
        val diff = abs(arr[i] - arr[i + 1])
        min = if (diff < min) diff else min
    }
    return min
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = minimumAbsoluteDifference(arr)
    println(result)
}
