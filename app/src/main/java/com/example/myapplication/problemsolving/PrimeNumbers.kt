package com.example.myapplication.problemsolving

import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    println(isPrime(7))  // Output: true
    println(isPrime(10)) // Output: false
}
