package com.prokudin.p01.warmup

fun jumpingOnClouds(clouds: Array<Int>): Int {
    var jumps = -1
    val n: Int = clouds.size
    var i = 0
    while (i < n) {
        if (i < n - 2 &&
                (clouds[i + 1] == 1 || clouds[i + 1] == 0 && clouds[i + 2] == 0)) { // jump over
            i++
        }
        i++
        jumps++
    }
    return jumps
}

fun main() {
    readLine()
    println(jumpingOnClouds(readLine()!!.split(" ").map{ it.trim().toInt() }.toTypedArray()))
}
