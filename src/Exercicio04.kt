fun main() {
    println("Digite a base:")
    val baseDigitada = readln().toInt()

    println("Digite a altura:")
    val alturaDigitada = readln().toInt()

    val area = areaRetangulo(baseDigitada, alturaDigitada)

    println("O seu retângulo de base $baseDigitada e altura $alturaDigitada é $area.")
}

fun areaRetangulo(base: Int, altura: Int): Int{
    return base * altura
}