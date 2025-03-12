package com.example.myapplication.chapters


//Lambda function is a anonymous function that can be stored in
// variable and passed as parameter or returned as function.
fun main() {

    storingToVariable()
    typeInferenceInLambda()
    lambdaWithSingleParameter()
    higerOrderFunctionWithLambda()
    returningLambdaFunction()
//    inlineFunctionForPerformance()
//    anonymousFunctionVsLambda()
}

fun returningLambdaFunction() {
    val res = lambdaWithReturn(5)
    println("returningLambdaFunction-->" + res(10))
}

fun lambdaWithReturn(factor: Int): (Int) -> Int {
    return { number -> factor * number }
}

fun higerOrderFunctionWithLambda() {
    val res = higher(10, 20) { a, b ->
        a + b
    }
    println("higerOrderFunctionWithLambda-->$res")
}

fun higher(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}

fun lambdaWithSingleParameter() {
    val multiply: (Int) -> Int = {
        it * it
    }
    println("lambdaWithSingleParameter-->" + multiply(5))
}

private fun storingToVariable() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int ->
        a + b
    }

    println("storingToVariable-->" + sum(2, 3))
}

fun typeInferenceInLambda() {
    val subtraction = { a: Int, b: Int ->
        a - b
    }
    println("typeInferenceInLambda -->" + subtraction(10, 5))
}

