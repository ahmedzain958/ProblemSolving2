package com.zainco.problemsolving

import java.util.*
import kotlin.collections.HashMap

/*

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
}*/

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val hashSet: HashMap<Int, Int> = HashMap()
    val iterator = ar.iterator()
    while (iterator.hasNext()) {
        val current = iterator.next()
        if (hashSet.isNullOrEmpty()) {
            hashSet[current] = 1
        } else {
            if (hashSet.contains(current)) {
                val frequency = hashSet[current]
                hashSet[current] = frequency!!.plus(1)
            } else {
                hashSet[current] = 1
            }
        }
    }
    var pairs = 0
    hashSet.forEach { (key, value) ->
        pairs += value shr 1
    }
    return pairs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
