package com.zainco.problemsolving

import android.os.Build
import android.support.annotation.RequiresApi


fun main() {
    val n = 4

    val ar = intArrayOf(514,514, 5, 4, 5, 5, 4)

    val result = sockMerchant(n, ar)
    println(result)
}

fun sockMerchant(n: Int, ar: IntArray): Int {
    val hashSet: HashMap<Int, Int> = HashMap()
    val iterator = ar.iterator()
    val frequency = 1
    while (iterator.hasNext()) {
        val current = iterator.nextInt()
        if (hashSet.isNullOrEmpty()) {
            hashSet[current] = 1
        } else if (!hashSet.isNullOrEmpty()) {
            if (hashSet.contains(current)) {
                hashSet[current] = frequency + 1
            } else {
                hashSet[current] = 1
            }
        }
    }
    println(hashSet)
    var pairs = 0
    hashSet.forEach { (key, value) ->
        pairs += value shr 1
    }
    println(pairs)
    return pairs
}