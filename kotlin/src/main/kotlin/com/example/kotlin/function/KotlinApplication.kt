package com.example.kotlin.function

class KotlinApplication

fun main(args: Array<String>) {

	val printer = Printer()
	printer.hello()
	printer.hello("Oi", "golang")
	printer.hello(language = "javascript")

}

class Printer {

	fun hello(greeting: String = "Oi", language: String = "java") {
		println("$greeting $language")
	}
}

