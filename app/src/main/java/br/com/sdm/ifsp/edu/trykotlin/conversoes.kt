package br.com.sdm.ifsp.edu.trykotlin

fun main() {

    var numString: String = 10.toString()//.toString converte String para Inteiro
    val numDouble: Double = numString.toDouble()//toDouble, converteu a variavel acima em Double
    val numFloat: Float = numDouble.toFloat()//toFloat, converte a variavel numDouble em Float
    val numInteiro: Int = numFloat.toInt()//toInt, converte numFloat em Inteiro

    println(numInteiro.toString())

    //Cast As
    //usando Cast
    val any: Any = "Any equivale a Object em Java"
    // val string: String = any as String
    if (any is String) {
        println("${any}: é uma String")
    }
}