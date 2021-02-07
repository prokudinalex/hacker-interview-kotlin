package com.prokudin.p02.arrays

import java.util.Scanner

fun rotateLeft(a: Array<Int>, rotations: Int): Array<Int> {
    if (rotations == a.size) {
        return a
    }

    var toRotate = rotations
    if (toRotate > a.size) {
        toRotate %= a.size
    }

    val result = IntArray(a.size).toTypedArray()
    a.copyInto(result, 0, toRotate, a.size)
    a.copyInto(result, a.size - toRotate, 0, toRotate)
    return result
}

fun main() {
    val scan = Scanner(System.`in`)
    val params = scan.nextLine()!!.split(" ")
    val rotations = params[1].trim().toInt()
    val array = scan.nextLine()!!.split(" ").map { it.trim().toInt() }.toTypedArray()
    println(rotateLeft(array, rotations).joinToString(" "))
}
