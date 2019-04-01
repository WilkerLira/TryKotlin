package br.com.sdm.ifsp.edu.trykotlin

enum class TIPO_OPERACAO{
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO
}

fun subtracao(a: Int, b: Int): Int{
    return a - b
}

//função tem dois inteiros e retorna um inteiro
fun operacao(op: TIPO_OPERACAO): (Int, Int) -> Int {
    val divisao: (Int, Int) -> Int = {x, y -> x/y}//entre chaves é um LAMBDA

    when(op){
        TIPO_OPERACAO.SOMA -> return fun(a: Int, b: Int): Int = a + b
        TIPO_OPERACAO.SUBTRACAO -> return ::subtracao
        TIPO_OPERACAO.MULTIPLICACAO -> return {a: Int, b: Int -> a * b}//LAMBDA
        TIPO_OPERACAO.DIVISAO -> return divisao
    }
}

fun executaOperacao(i: Int, j: Int, func:(Int, Int) -> Int): Int{
    return func(i, j)
}

fun main() {
    //Soma
    var acao: (Int, Int) -> Int = operacao(TIPO_OPERACAO.SOMA)
    var soma: Int = executaOperacao(20,10, acao)
    println("Soma: ${soma}")

    //Subtração
    acao = operacao(TIPO_OPERACAO.SUBTRACAO)
    println("Subtração: ${executaOperacao(20,10, acao)}")

    //Mulplicação
    val multiplicacao = executaOperacao(20,10, operacao(TIPO_OPERACAO.MULTIPLICACAO))
    println("Multiplicação: ${multiplicacao}")

    //Divisão
    println("Divisão: ${executaOperacao(10,20, operacao(TIPO_OPERACAO.DIVISAO))}")
}






















