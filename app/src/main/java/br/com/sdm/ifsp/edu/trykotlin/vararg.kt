package br.com.sdm.ifsp.edu.trykotlin

//vararg, pode colocar varios parâmetros
//no exemplo, tem varios parâmentros
fun multiplica(vararg  numeros: Double):Double{
    if (numeros.size == 0){
        return 0.0
    }

    var resultado: Double = 1.0
    for (numero in numeros){
        resultado *= numero
    }
    return resultado
}

fun main() {
    println(multiplica(1.0, 2.0, 3.5, 4.0, 6.2))

    //vararg com spread operator
    val listaParametros: List<Double> = listOf(1.0, 2.0, 3.5, 4.0, 6.2)
    multiplica(*listaParametros.toDoubleArray())//operador *, converte a lista nesse caso
}













