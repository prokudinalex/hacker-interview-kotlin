package com.prokudin.p01.warmup

fun countingValleys(path: String): Int {
    var level = 0
    var valleys = 0
    path.toCharArray().forEach {
        if (it == 'D') {
            level--
        } else {
            if (level == -1) {
                valleys++
            }
            level++
        }
    }
    return valleys
}

fun main() {
    readLine()
    println(countingValleys(readLine()!!))
}
