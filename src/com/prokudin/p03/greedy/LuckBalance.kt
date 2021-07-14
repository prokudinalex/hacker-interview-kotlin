package com.prokudin.p03.greedy

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'luckBalance' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. 2D_INTEGER_ARRAY contests
 */

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val important = mutableListOf<Int>()
    var unimportantLuck = 0
    var importantLuck = 0
    for (contest in contests) {
        if (contest[1] == 0) {
            unimportantLuck += contest[0]
        } else {
            important.add(contest[0])
            importantLuck += contest[0]
        }
    }

    if (k >= important.size) {
        return importantLuck + unimportantLuck
    }

    important.sort()
    for (i in 0 until important.size - k) {
        importantLuck -= 2 * important[i] // multiple by 2 because it was count as lost contest before
    }

    return importantLuck + unimportantLuck
}

fun main(args: Array<String>) {
    val params = readLine()!!.trimEnd().split(" ")
    val n = params[0].toInt()
    val k = params[1].toInt()
    val contests = Array(n) { Array(2) { 0 } }
    for (i in 0 until n) {
        contests[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }
    val result = luckBalance(k, contests)
    println(result)
}
