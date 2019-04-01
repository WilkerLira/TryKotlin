package br.com.sdm.ifsp.edu.trykotlin

//Função simples
fun multiplo(a: Int = 10, b: Int): Boolean{

    return a % b == 0
   /* val c: Int = a % b//c recebe o resto da divisão
    if (c == 0){
        return true
    }
    return false*/
}
//Função acima foi reduzida, exemplo  abaixo
//EXEMPLO 1
//Uma forma de usar operdor ternario
//fun multiplo(a: Int = 10, b: Int) = if (a % b == 0) true else false

//EXEMPLO 2
//singleExpression
//fun multiplo(a: Int = 10, b: Int) = a % b == 0




/*Função estendida*/
//função INFIXADA, não recebe mais que dois parâmetros
/*infix fun Int.multiplo(b: Int): Boolean {
    val c: Int = this % b
    if (c == 0) {
        return true
    }
    return false
}*/

fun main() {
    println(multiplo(10,2))
   // println(10.multiplo(2))
   // println(10 multiplo 2)
}













