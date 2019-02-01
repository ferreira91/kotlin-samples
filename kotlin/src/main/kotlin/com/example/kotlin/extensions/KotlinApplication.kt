package com.example.kotlin.extensions

class KotlinApplication

fun main(args: Array<String>) {

    val printer = Printer()

    //"".join() Here is NOT possible because the context
    println(printer.print("Data element for example"))
}

class Printer {

    fun print(value: String):String {
        return value.join()
    }

    private fun String.join():String {
        return this.replace(" ", "", false)
    }
}