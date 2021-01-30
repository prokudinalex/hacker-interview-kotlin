package com.prokudin.p01.warmup

import java.util.*

fun repeatedString(s: String, n: Long): Long {
    if (n <= s.length.toLong()) {
        val shortString = s.substring(0, n.toInt())
        return shortString.count { 'a' == it }.toLong()
    }

    val wordCount = n / s.length
    val tail = s.substring(0, (n % s.length).toInt())
    return s.count { 'a' == it }.toLong() * wordCount + tail.count { 'a' == it }.toLong()
}

fun main() {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val n = scan.nextLine().trim().toLong()
    println(repeatedString(s, n))
}
