package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qa.calculator.Calculator;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setup() {
		System.out.println("starting test");
		calculator = new Calculator();
	}
	
	@Test
	public void Testwithmultiply1() {
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void Testwithmultiply2() {
		assertEquals(6, calculator.multiply(3, 2));}
	
	@Test(expected = IllegalArgumentException.class)
	public void Testwithdivide1() {
		assertEquals(1.5, calculator.divide(3, 2),0);}
	
	@Test
	public void Testwithdivide2() {
		assertEquals(5, calculator.divide(10, 2));}
	
	@Test
	public void Testwithadd1() {
		assertEquals(5, calculator.add(3, 2));}
	
	@Test
	public void Testwithadd2() {
		assertEquals(5, calculator.add(3, 2));}
	
	@Test
	public void Testwithsubtract1() {
		assertEquals(1, calculator.subtract(3, 2));}
	
	@Test
	public void Testwithsubtract2() {
		assertEquals(1, calculator.subtract(3, 2));}
	
	@After
	public void tearDown() {
		System.out.println("finishing test");
	}
	
}
