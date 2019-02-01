package com.example.kotlin.filter

class KotlinApplication

fun main(args: Array<String>) {

    val numbers = listOf(3, 5, 7, -1, -100)

    println(numbers)

    println(numbers.filter { it > 0 })
}
