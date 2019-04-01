package br.com.sdm.ifsp.edu.trykotlin

//Funções de alta ordem
fun processaInteiros(i:Int, f:(Int) -> Int) : Int{
    return f(i)
}

fun processaInteiros(i:Int, j:Int, f:(Int,Int) -> Int) : Int{
    return f(i,j)
}

//Funções
fun somas(a: Int, b: Int): Int {
    return a + b
}
//Função inline, apenas adiciona inline no começo
inline fun multiplica(a: Int, b: Int): Int{
    return a * b
}

fun raizQuadrada(numero: Int): Int {
    for(n in 1..numero){
        if (n * n == numero){
            return n
        }
    }
    return -1
}

fun main() {
    //Chamada do primeiro passo
    println(processaInteiros(10,20, ::soma))
    println(processaInteiros(10,20, ::multiplica))
    println(processaInteiro(10, :: raizQuadrada))

    //Chamada do segundo passo, usando lambda
    println(processaInteiros(10,20){x, y ->  x + y})
    println(processaInteiros(10,20){x, y -> x * y})
    println(processaInteiro(16, ::raizQuadrada))
    //função processaInteiro, que faz a raiz quadrada
    processaInteiro(16, fun(numero: Int): Int{
        for (n in 1..numero){
            if (n * n == numero){
                return n
            }
        }
        return -1
    })
}

/*Dadas as funções
* 1- Na função main, faça chamadas normais das funções de alta ordem passando as funções,
* soma, multiplica e raizQuadrada como parâmetro de acordo com a equivalência dos parâmetros
* 2- Na função main, faça chamadas das funções de alta ordem passando expressões lambdas,
* equivalentes as funções soma, multiplica e raizQuadrada*/