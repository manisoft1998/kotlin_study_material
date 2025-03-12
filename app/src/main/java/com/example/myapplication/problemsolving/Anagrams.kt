package com.example.myapplication.problemsolving

fun isAnagram(str1: String, str2: String): Boolean {
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()
}

fun main() {
    println(isAnagram("listen", "silent"))  // Output: true
    println(isAnagram("hello", "world"))    // Output: false
}


