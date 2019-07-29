package com.zainco.problemsolving

import java.util.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    if (s == "a") return n
    var string = s
    val i = 1
    var repeatedNumber = 0L
    while (i > 0) {
        string += string
        if (string.length.toLong() >= n) {
            val stringLength = string.length.toLong()
            val difference = (stringLength - n).toInt()
            val repeatedString = string.dropLast(difference)
            repeatedNumber = n.minus(repeatedString.replace("a", "").length)
            break
        }
    }
    return repeatedNumber
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)

}