package com.example.myapplication.problemsolving

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    return (arr1 + arr2).sortedArray()
}

fun main() {
    println(mergeSortedArrays(intArrayOf(1, 3, 5), intArrayOf(2, 4, 6)).joinToString())
    // Output: 1, 2, 3, 4, 5, 6
}
