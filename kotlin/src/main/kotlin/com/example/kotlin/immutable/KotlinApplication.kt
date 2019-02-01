package com.example.kotlin.immutable

class KotlinApplication

fun main(args: Array<String>) {

    println(listOf("a", "b", "c"))

    val letters = mapOf("a" to 1, "b" to 2, "c" to 3)

    println(letters)

    print("Value for A ${letters["a"]}")
}