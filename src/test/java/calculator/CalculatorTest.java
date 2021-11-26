package calculator;

//import Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addCalcTest() {
        Assert.assertEquals("Sum is incorrect", 3, calculator.add(1, 2));
    }

    @Test
    public void subtractCalcTest() {
        Assert.assertEquals("Subtraction is incorrect", 0, calculator.subtract(5, 5));
    }

    @Test
    public void multiplyCalcTest() {
        Assert.assertEquals("Multiplication is incorrect", 8, calculator.multiply(4, 2));
    }

    @Test
    public void divideCalcTest() {
        Assert.assertEquals("Division is incorrect", 2, calculator.divide(10, 5));
    }

    @Test
    public void divideByZeroCalcTest() {
        Assert.assertEquals("Dividing by zero is incorrect", 0, calculator.divide(3, 0));
    }
}
