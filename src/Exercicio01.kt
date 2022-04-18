fun main() {
    println("Digite o número que deseja fazer a soma: ")
    val resultadoDoSomatorio = somatorio(readln().toInt())

    println("O resultado do somatório é: $resultadoDoSomatorio")
}


fun somatorio(num: Int): Int{
    var soma = 0
    for(i in 1..num){
        soma += i
    }
    return soma
}
