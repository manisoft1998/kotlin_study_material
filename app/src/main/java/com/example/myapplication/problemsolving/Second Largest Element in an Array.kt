package com.example.myapplication.problemsolving


fun findSecondLargest(arr: IntArray): Int? {
    if (arr.size < 2) return null  // If array has less than 2 elements, no second largest exists

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    arr.forEach { num ->
        if (num > largest) {
            secondLargest = largest  // Update second largest
            largest = num  // Update largest
        } else if (num > secondLargest && num != largest) {
            secondLargest = num  // Update second largest if it's smaller than largest
        }
    }


    return if (secondLargest == Int.MIN_VALUE) null else secondLargest
}

fun main() {
    val arr = intArrayOf(10, 20, 5, 8, 30, 25)
    println(findSecondLargest(arr))  // Output: 25
}
