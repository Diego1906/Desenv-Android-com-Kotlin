class Pessoa03(var nome: String) {

    var ano: Int? = null
    var endereco: String? = null

    /*
    * O construtor secundário é obrigado a chamar o construtor primário através do uso da palavra chave "this"
    */
    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }

    /*
    O construtor terceário segue o mesmo processo do construtor secundário.
    * */
    constructor(nome: String, ano: Int, endereco: String) : this(nome) {
        this.ano = ano
        this.endereco = endereco
    }

    fun saudacao() {
        println("Olá, meu nome é $nome")
        println("O ano é $ano")
    }
}

fun main() {
    val p1: Pessoa03 = Pessoa03("Aline")
    val p2: Pessoa03 = Pessoa03("Diego", 1987)
    val p3: Pessoa03 = Pessoa03("Helena", 1964, "Tomisaburo")

    p1.saudacao()
    p2.saudacao()
    p3.saudacao()
}


