package org;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(result, 8, "Addition result is incorrect");
    }

    @Test
    public void testAdditionNegative() {
        int result = calculator.add(-2, -3);
        Assert.assertEquals(result, -5, "Addition with negatives failed");
    }

    @Test
    public void testAdditionMix() {
        int result = calculator.add(-2, 5);
        Assert.assertEquals(result, 3, "Addition with negatives failed");
    }
}
