package test;

import JavaProfessionalCourse2.Lesson21.Test1.Calculator;
import JavaProfessionalCourse2.Lesson21.Test1.CalculatorOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int x = 5;
        int y = 10;
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.sum(x,y);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int x = 5;
        int y = 10;
        Calculator calculator = new Calculator();
        int expected = 50;
        int actual = calculator.multiply(x,y);
        assertEquals(expected, actual);
    }
}