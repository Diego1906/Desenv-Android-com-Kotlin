package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {
    @Test
    fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase?"))
    }

    @Test
    fun countConsonants() {
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes"))
    }

    @Test
    fun countVowels2() {
        Assert.assertEquals(6, countVowels2("Diego Farias"))
    }

    @Test
    fun countConsonants2() {
        Assert.assertEquals(5, countConsonants("Aline Ramos"))
    }


    @Test
    fun countVowelsAndConsonants() {
        var phrase = "Estou gostando muito de aprender kotlin"
        Assert.assertEquals(15, countVowels(phrase)) // Vogal
        Assert.assertEquals(19, countConsonants(phrase)) // Consoante
    }

    @Test
    fun countVowelsFilter(){
        Assert.assertEquals(8, countVowelsFilter("Minha frase com vogais!") )
    }
}