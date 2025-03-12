package com.example.myapplication.test

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

import kotlinx.coroutines.*

fun main(): Unit = runBlocking { // Use runBlocking to ensure the main function waits for completion
    launch(Dispatchers.IO) { // Launch a coroutine on IO dispatcher
        printNumber()
    }
}

suspend fun printNumber() {
    val numbers = arrayOf(2, 1, 3, 4)

    numbers.forEach {
        println(it) // Print number without a newline
        printCharacters() // Call another suspend function
    }
}

suspend fun printCharacters() {
    val charArray = arrayOf("a", "b", "c", "d")

    charArray.forEach {
        print(it) // Print character with a newline
    }
}
