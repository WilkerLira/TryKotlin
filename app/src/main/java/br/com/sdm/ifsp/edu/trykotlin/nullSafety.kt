package br.com.sdm.ifsp.edu.trykotlin

fun main(){
    var nome: String?//toda variável não é nulo, ou seja, não pode ser nulo
    nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Nascimento" //Interrogação e dois pontos, em kotlin tem o nome de Elvis

    //Usando if, o compilador imprimi essas duas linhas
    if (sobrenome != null) {
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }


    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    //Usando try/catch ele da uma execessão e imprimi
   try {
       println(sobrenome!!.capitalize())
       println(sobrenome!!.length)
   } catch (kne: KotlinNullPointerException){
       println("Deu excessão")
   }
}