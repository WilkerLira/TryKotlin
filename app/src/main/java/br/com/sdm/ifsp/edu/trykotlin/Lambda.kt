package br.com.sdm.ifsp.edu.trykotlin

//função lambda, é passada como parâmetro, e implementação 

fun processaInteiro(i: Int, f: (j:Int) -> Int): Int{
    return f(i)
}

fun inverte(x: Int): Int = x * -1 //função single expresssion

fun Int.executa(f: (Int) -> Int): Int{
    return f(this)
}

fun main() {
    //Passando uma função comum como parâmetro
    val n: Int = processaInteiro(10, :: inverte)
    println(n)
    //Passando uma função lambda como parâmetro
    //função lambda, recebe apenas um parãmetro
    val n2: Int = processaInteiro(11, {x -> -1 * x})//x aqui é int, porque a função processaInteiro é Int
    println(n2)

    //Passando uma função lambda como parâmetro, com um parâmetro apenas
    val n3: Int = processaInteiro(12, {-1 * it})//x aqui é int, porque a função processaInteiro é Int
    println(n3)

    //Passando uma função lambda como último parâmetro
    val n4: Int = processaInteiro(11) {-1 * it}
    println(n4)

    //Passando lambda para uma função estendida
    val n5: Int = 14.executa(){-1 * it}
    println(n5)

    //Passando lambda para uma função estendida
    val n6: Int = 15.executa{-1 * it}//forma mais comum de usar o lambda
    println(n6)

    //Atribuindo uma lambda a uma variável
    val funcaoLambda: (Int) -> Int = {x: Int -> -1 * x}//várivel recebeu uma função
    val n7: Int = processaInteiro(16, funcaoLambda)
    println(n7)

    val funcaoLambda2 = {x: Int -> -1 * x}
    val n8: Int = processaInteiro(17, funcaoLambda)
    println(n8)
}

















