package com.example.myapplication.problemsolving

fun reverseString(str: String): String {
    val result = CharArray(str.length)// create new char array with fixed size using string length
    var j = str.length - 1

    for (i in str.indices) {
        result[j--] = str[i]  // assign first char of string to result char array in the last position using j variable
    }

    return String(result)  // convert char array to string
}

fun main() {
    println(reverseString("Kotlin"))  // Output: niltoK
}