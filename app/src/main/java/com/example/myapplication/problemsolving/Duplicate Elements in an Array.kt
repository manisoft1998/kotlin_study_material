package com.example.myapplication.problemsolving

/*fun findDuplicates(arr: IntArray): Set<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    for (num in arr) {
        if (!seen.add(num)) {
            duplicates.add(num)
        }
    }
    return duplicates
}

fun main() {
    println(findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))  // Output: [2, 3]
}*/












fun main() {
    val numbers = intArrayOf(1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 1, 7, 9, 10)
    println(findDuplicates(numbers))
}

private fun findDuplicates(numbers: IntArray): MutableSet<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    numbers.forEach {
        if (!seen.add(it)) {
            duplicates.add(it)
        }
    }
    return duplicates
}



























