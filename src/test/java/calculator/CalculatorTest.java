package calculator;

/*
Create Calculator class and implement operations: addition, subtraction, multiplication,
 division. Then create CalculatorTest class with tests above operations.

 User Story: tichet in Jira de tipul Story care va va indica BUSINESS LEVEL ce trebuie sa faca
  functionalitatea

  -Who?
  -What?
  -Why?

  As a user of digital scientific calculator.
  I want to be able to do addition, substaction etc
  So I can do calculation faster.

  Acceptance Criteria

  Tasks & Sub-tasks:
  -addition (assigned to Peeps 1)
      -- failing test
      -- implementaion & passing test
      -- refactor & commit
  -substraction (assigned to Peeps 2)
  -multimplication (assigned to Peeps 3)
  -division (assigned to Peeps 4)


 Conform metodologiei TDD:
 1. scrie testul care pica
 2. scriem implementarea care trece testul
 3. refactorizam
 */

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private final Calculator calculatorUT = new Calculator();

    @Test
    public void testAdd() {
    assertEquals(5.0, calculatorUT.add(2,3));   // if( 5 == calculatorUT.ad(2,3) {test pass} else {throw exceptiom
    assertEquals(-1.0, calculatorUT.add(-2 ,1));
    assertEquals(0.0, calculatorUT.add(2, -2));
    }


    @Test
    public void testSubstract(){
        assertEquals(-1.0, calculatorUT.subtract(2,3));
        assertEquals(-1.0, calculatorUT.add(-2 ,1));
        assertEquals(0.0, calculatorUT.add(2, -2));

    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculatorUT.multiply(2,3));
        assertEquals(-2.0, calculatorUT.multiply(-2 ,1));
        assertEquals(-4.0, calculatorUT.multiply(2, -2));

    }

    @Test
    public void testDivide(){
        assertEquals(1.5, calculatorUT.divide(3,2));
        assertEquals(-2.0, calculatorUT.divide(-2 ,1));
        assertEquals(-1.0, calculatorUT.divide(2, -2));

        /*
        Al doilea argument al metrodei assertThrows este o interfata functionala neparametrizata
         */
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorUT.divide(1,0);
        });
        assertEquals("Divide by zero", exception.getMessage());
    }
}
