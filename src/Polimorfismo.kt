interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Gerente - Bônus de 1200")
    }
}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Tecnico - Bônus de 500")
    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        println("Analista - Bônus de 900")
    }
}

fun main() {
    val gerente: Funcionario = Gerente()
    val tecnico: Funcionario = Tecnico()
    val analista: Funcionario = Analista()

    calculo(gerente)
    calculo(tecnico)
    calculo(analista)
}

fun calculo(funcionario: Funcionario) {
    funcionario.calculaBonus()
}