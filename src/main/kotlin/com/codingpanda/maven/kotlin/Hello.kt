package com.codingpanda.maven.kotlin

fun main(args: Array<String>) {
    println("Hello, World")
    val a: Int =5 // immediate assignment
    val b =9 // `Int` type is inferred
    val c = 14
    val d : Int // Type required when no initializer is provided
    d = 3 // deferred assignment
    println("Sum of $a and $b is: ${sum(a,b)}")
    println("Subtraction of $c and $d is: ${subtract(c,d)}")
}

/*A function with two Int parameters and Int return type.*/
fun sum(a: Int,b: Int): Int{
   return a+b
}

/*A function body can be an expression. Its return type is understood implicitly.*/
fun subtract(c: Int,d:Int) = c-d

