package com.example.certificationroadmap



fun oddsVsEvens(n: Int): String {
    var oddSum = 0
    var evenSum = 0
    var current = n

    while (current > 0) {
        val digit = current % 10
        if (digit % 2 == 0) {
            evenSum += digit
        } else {
            oddSum += digit
        }
        current /= 10
    }

    return when {
        oddSum > evenSum -> "odd"
        evenSum > oddSum -> "even"
        else -> "equal"
    }
}
fun main(){
    println(oddsVsEvens(12345))
}
