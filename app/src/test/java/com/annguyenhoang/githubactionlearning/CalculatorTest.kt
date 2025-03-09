package com.annguyenhoang.githubactionlearning

import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    @Test
    fun `Given a = 1 and b = 2, the result should be 3`() {
        val a = 1
        val b = 2
        val expectedResult = 3
        Assert.assertEquals(
            expectedResult,
            Calculator.sum(a, b)
        )
    }
}