fun main() {
    println("Digite quantos alunos fizeram prova:")
    val numAlunos = readln().toInt()
    val nomeAlunos = getAlunos(numAlunos)
    val notasAlunos = getNotas(numAlunos)

    nomeAlunos.forEachIndexed() { i, _ ->
        println(nomeAlunos[i])
        val media = calcMedia(notasAlunos)
        println("Média do aluno ${nomeAlunos[i]}: ${media[i]}")
    }
}

fun getAlunos(qtdAlunos: Int): Array<String>{
    return Array(qtdAlunos) { i ->
        println("Digite o nome do ${i+1}º aluno:")
        readln()
    }
}

fun getNotas(alunos: Int): Array<Array<Double>>{
    return Array(alunos) { i ->
        Array(3) { j ->
            println("Digite a ${j+1}ª nota do aluno ${i+1}")
            readln().toDouble()
        }
    }
}

fun calcMedia(notas: Array<Array<Double>>): Array<Double>{
    return Array(notas.size){ i ->
        calcMediaIndividual(notas[i])
    }
}

fun calcMediaIndividual(notas: Array<Double>): Double{
    var nota = 0.0
    notas.forEach { i -> nota += i }
    return nota / notas.size
}