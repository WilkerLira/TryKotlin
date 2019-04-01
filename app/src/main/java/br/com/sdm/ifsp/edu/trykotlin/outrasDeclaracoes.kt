package br.com.sdm.ifsp.edu.trykotlin

fun main() {
    // String com tipo explícito
    var nome: String = "Pedro"

    // Tipo determinado implicitamente
    var sobrenome = "Nobile"

    // Var e val podem ser inicializados a posteriori
    var nomeMeio: String
    nomeMeio = "Northon"

    // Float
    var altura: Float = 1.74f

    // Inteiro
    var idade: Int = 36

    var peso: Double = 72.toDouble() // = 72.0
    println("Nome: ${nome} $nomeMeio $sobrenome, altura: ${altura}, idade: ${idade}, peso: $peso")
}