package com.example.kotlin.returnstatement

class KotlinApplication

fun main(args: Array<String>) {

    println(ColorConverter().transform("Red"))
    println(ColorConverter().transform("Green"))
    println(ColorConverter().transform("Blue"))
    // error
    // println(ColorConverter().transform("White"))
}

class ColorConverter {

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }
}