package com.example.coffeemachine

fun main(){

    println("Who is the coffee for?")
    val name = readln()

    println("How many sugars would you like?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    makeCoffee(name, sugarCountInt)
}

fun makeCoffee(name : String, sugarCount : Int){
    when {
        sugarCount < 0 -> println("Invalid input: sugar count cannot be negative. Try again $name")
        sugarCount == 0 -> println("Coffee with no sugar for $name")
        sugarCount == 1 -> println("Coffee with $sugarCount spoon of sugar for $name")
        else -> println("Coffee with $sugarCount spoons of sugar for $name")
    }
}