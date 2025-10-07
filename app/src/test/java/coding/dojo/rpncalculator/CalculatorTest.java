package coding.dojo.rpncalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  void calculate_evaluates_sum() {
    String expression = "11+";

    int result = this.calculator.evaluate(expression);

    assertEquals(2, result);
  }
}
