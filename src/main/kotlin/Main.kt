package org.example

fun main() {
    print("Сколько раз повторить? Число: ")
    val x = readln()!!.toInt()
    printHi(x)
}

fun printHi(number: Int) {
    for (i in 0..<number) {
        println("${i + 1}) Hello World!")
    }
}