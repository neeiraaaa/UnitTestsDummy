package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void addCalcTest() {
        Assert.assertEquals("Sum is incorrect", 15, calc.add(5, 10));
    }

    @Test
    public void subtractCalcTest() {
        Assert.assertEquals("Subtraction is incorrect", 5, calc.subtract(10, 5));
    }

    @Test
    public void multiplyCalcTest() {
        Assert.assertEquals("Multiplication is incorrect", 50, calc.multiply(10, 5));
    }

    @Test
    public void divideCalcTest() {
        Assert.assertEquals("Division is incorrect", 2, calc.divide(10, 5));
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void divideByZeroCalcTest() {
        Assert.assertEquals("Dividing by zero is incorrect", 0, calc.divide(10, 0));
    }
}
