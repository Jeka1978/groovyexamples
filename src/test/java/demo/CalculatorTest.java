package demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        int answer = calculator.plus(2, 3);
        Assert.assertEquals(answer,5);
    }
}