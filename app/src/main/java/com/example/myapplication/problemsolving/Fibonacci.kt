package com.example.myapplication.problemsolving

fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1
    var result = 0

    for (i in 2..n) {
        result = a + b  // Sum of previous two numbers
        a = b           // Move `b` to `a`
        b = result      // Update `b` to new Fibonacci number
    }
    return result
}

fun main() {
    println(fibonacci(5))  // Output: 5
    println(fibonacci(7))  // Output: 13
}

/*
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers, starting from 0 and 1.

Fibonacci Formula:
𝐹(𝑛)=𝐹(𝑛−1)+𝐹(𝑛−2)

Where:
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2)
*/

