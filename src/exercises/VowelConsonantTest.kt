package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test
    fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas voagis tem esta frase?"))
    }

/*
    @Test fun countConsonants(){
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes"))
    }
 */


    @Test
    fun countVowelsAndConsonants() {
        var phrase = "Estou gostando muito de aprender kotlin"
        Assert.assertEquals(15, countVowels(phrase)) // Vogal
        // Assert.assertEquals(19, countConsonants(phrase) ) // Consoante
    }
}