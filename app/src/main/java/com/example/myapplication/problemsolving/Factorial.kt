package com.example.myapplication.problemsolving

fun main() {
    println(factorialNumber(3))
}

private fun factorialNumber(number: Int): Long {
    var factorial = 1L
    for (index in 2..number) {// Starts from 2, skipping the unnecessary 1
        factorial *= index
    }
    return factorial
}
//
//🚀 Key Takeaways
//✅ Multiplication by 1 is redundant → Start from 2.
//✅ Saves 1 extra iteration → Slightly optimized.
//✅ Produces the same correct output.