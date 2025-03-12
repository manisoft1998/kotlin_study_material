package com.example.myapplication.problemsolving

/*
fun findMissingNumber(arr: IntArray): Int {
    val n = arr.size + 1
    val totalSum = n * (n + 1) / 2
    val actualSum = arr.sum()
    return totalSum - actualSum
}

fun main() {
    println(findMissingNumber(intArrayOf(1, 2, 3, 5)))  // Output: 4
}
*/

/*fun findMissingNumber(arr: IntArray, n: Int): Int {
    val expectedSum = n * (n + 1) / 2  // Expected sum of numbers from 1 to N
    var actualSum = 0  // We will manually calculate sum

    // Loop to calculate sum instead of using sum() function
    for (num in arr) {
        actualSum += num
    }

    return expectedSum - actualSum  // Missing number
}*/

fun main() {
    val arr = intArrayOf(11, 12, 15, 16, 17)  // Missing: 13, 14
    findMissingNumbers(arr)
}

 fun findMissingNumbers(numbers: IntArray) {
    // Step 1: Find min and max dynamically
    var min = numbers[0]
    var max = numbers[0]

    for (num in numbers) {
        if (num < min) min = num
        if (num > max) max = num
    }

    // Step 2: Create a boolean array to track missing numbers
    val present = BooleanArray(max + 1) // By default, all values are false

    // Step 3: Mark existing numbers
    for (num in numbers) {
        present[num] = true
    }

    // Step 4: Identify missing numbers
    println("Missing Numbers:")
    for (i in min..max) {
        if (!present[i]) {
            println(i)
        }
    }
}
