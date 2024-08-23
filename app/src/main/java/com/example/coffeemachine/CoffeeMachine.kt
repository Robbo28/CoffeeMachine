package com.example.coffeemachine

data class CoffeeDetails(
    val name : String,
    val sugarCount : Int,
    val size : String,
    val creamAmount : Int
)

fun main(){

    val coffeeForDenis = CoffeeDetails("Denis", 2, "xxl", 0)

    /*println("Who is the coffee for?")
    val name = readln()

    println("How many sugars would you like?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()*/

    makeCoffee(coffeeForDenis)
}

fun makeCoffee(coffeeDetails : CoffeeDetails){
    when {
        coffeeDetails.sugarCount < 0 -> println("Invalid input: sugar count cannot be negative. Try again ${coffeeDetails.name}")
        coffeeDetails.sugarCount == 0 -> println("Coffee with no sugar for ${coffeeDetails.name}")
        coffeeDetails.sugarCount == 1 -> println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
        else -> println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }
}