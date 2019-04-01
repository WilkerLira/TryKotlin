package br.com.sdm.ifsp.edu.trykotlin

//FUNÇÃO DE ALTA ORDEM
//Funções de alta ordem, são funções que recebe
//uma função como parametro ou retorna uma função

/*PASSANDO 1 FUNÇÃO POR PARÂMETRO*/
fun processaTexto(str1: String, str2: String, processa: (String, String) -> String):String{
    //processa é o nome do parâmetro declarado acima, que tem duas Strings declaradas
    return processa(str1, str2)
}

fun concatena(a: String, b: String): String{
    return "${a}${b}"
}

fun inverte(a: String, b: String): String{
    return a.reversed()+b.reversed()
}
//Estendendo List<String>
fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    val  listaStrings: MutableList<String> = mutableListOf()
    //forma pragmatica
    /* for(s in this){
        listaStrings.add(funcao(s))
    }*/
    this.forEach { listaStrings.add(funcao(it)) }
    return listaStrings

}
//função do tipo genérico<T>

fun<T> List<T>.paraCada(funcao: (T) -> T): List<T> {
    val  lista: MutableList<T> = mutableListOf()
    //forma pragmatica
    /* for(s in this){
        listaStrings.add(funcao(s))
    }*/
    this.forEach { lista.add(funcao(it)) }
    return lista

}

fun primeiraLetra(str: String): String {
    return str.first().toString()
}

fun ultimaLetra(str: String): String{
    return str.last().toString()
}

fun incrementa(i: Int): Int{
    return i + 1
}

fun main(){
    //EXEMPLO 1
    //nessa frase chama a função Concatena
    println(processaTexto("Olá ", "Mundo", ::concatena))//to chamando uma função(aqui fica como parametro) usando sinal de dois pontos
    println(processaTexto("Olá ", "Mundo", ::inverte))
    //usando lambda//toUpperCase é caixa alta, ou seja, letra maiuscula
    //println(processaTexto("Olá ", "Mundo", {x, y -> x.toUpperCase() + y.toUpperCase()}))

    //EXEMPLO 2
    val listaNomes: List<String> = listOf("Pedro", "João", "Maria", "José")
    //var listaPrimeiraLetra: List<String> = listaNomes.paraCadaString (::primeiraLetra)
    //var listaUltimaLetra: List<String> = listaNomes.paraCadaString (::ultimaLetra)

    var listaPrimeiraLetra: List<String> = listaNomes.paraCada (::primeiraLetra)
    var listaUltimaLetra: List<String> = listaNomes.paraCada (::ultimaLetra)

    val listaInteiros: List<Int> = (1..10).toList()
    val listaIncrementos: List<Int> = listaInteiros.paraCada (::incrementa)
    listaIncrementos.forEach { println(it) }

    //EXEMPLO DE IMPRESSÃO de parametro e função
    listaPrimeiraLetra.forEach{ println(it)}
    listaPrimeiraLetra.forEach(::println)
    listaPrimeiraLetra.forEach(){ println(it)}

    listaUltimaLetra.forEach { println(it) }
}














