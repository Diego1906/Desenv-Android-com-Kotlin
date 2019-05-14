package exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    @Test
    fun reverseUsingSB() {
        Assert.assertEquals("bs niltok", reverseUsingSB("kotlin sb"))
    }

    @Test
    fun reverseUsingLoop() {
        Assert.assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }

    @Test
    fun reverseUsingFunReversed() {
        Assert.assertEquals("desrever nuf gnirts niltok", reverseUsingLoop("kotlin string fun reversed"))
    }
}