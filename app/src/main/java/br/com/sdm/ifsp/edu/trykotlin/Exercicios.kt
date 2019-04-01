package br.com.sdm.ifsp.edu.trykotlin

//Exercicio 3
fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

//função foo, ela tem dois parâmentros inteiros, e uma função dentro dela que
//passa valores inteiros
fun foo(a: Int, b: Int, f:(Int, Int)->Int ): Int = f(a,b)

fun bar(x: String, y: String, func:(String,String)-> String): String = func(x,y)

fun main() {
    println(foo(10,20, ::soma))
    println(bar("Wil","ker", ::cat))

    println("****************")

    println(xpto(2,3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}
//Exercicio 4
//função genérica
fun<T> xpto(x: T, y: T, f:(T,T)->T): T = f(x,y)

