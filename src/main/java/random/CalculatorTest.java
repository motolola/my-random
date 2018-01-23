package random;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void test() {		
		assertTrue(Calculator.add(2.2, 5.3) == 7.5);
		
	}
	
	@Test
	public void factorialTest() {
		assertTrue(Calculator.factorial(4) == 24);
	}

}
