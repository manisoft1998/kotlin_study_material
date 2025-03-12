package com.example.myapplication.problemsolving

fun main() {
    println(isPalindrome("MADAM"))
    println(isPalindrome("AMMA"))
    println(isPalindrome("APPA"))
    println(isPalindrome("GRAMMER"))
    println(isPalindromeNumber(121))
}

private fun isPalindrome(str: String): Boolean {

    val strCharArray = CharArray(str.length)
    var charIndex = str.length - 1

    for (index in str.indices) {
        strCharArray[charIndex--] = str[index]
    }

    return str == String(strCharArray)
}

fun isPalindromeNumber(num: Int): Boolean {
    if (num < 0) return false  // Negative numbers are not palindromes

    var original = num
    var reversed = 0

    while (original > 0) {
        val digit = original % 10   // Get last digit
        reversed = reversed * 10 + digit  // Append it to reversed number
        original /= 10  // Remove last digit
    }

    return num == reversed
}