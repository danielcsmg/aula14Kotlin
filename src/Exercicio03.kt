fun main() {
    println("Digite seu peso:")
    val peso = readln().toDouble()

    println("Digite sua altura:")
    val altura = readln().toDouble()

    val imc = calcIMC(peso, altura)
    val classIMC = classificacaoIMC(imc)

    println("Seu IMC é $imc você está com $classIMC.")
}

fun calcIMC(peso: Double, altura: Double): Double{
    val imc = peso / (altura * altura)
return "%.2f".format(imc).replace(",", ".").toDouble()
}

fun classificacaoIMC(imc: Double): String{
    return when {
        imc < 18.5 -> "Magreza"
        imc < 25.0 -> "Peso Normal"
        imc < 30.0 -> "Sobrepeso"
        imc < 40.0 -> "Obesidade"
        else -> "Obesidade Grave"
    }
}