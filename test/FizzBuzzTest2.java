import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest2 {

	@Test
	public void returnsNumberForNumberNotDivisibleByThreeAndFive() {
		FizzBuzz b = new FizzBuzz();
		assertEquals("14", b.calculate(14));
	}
	
	@Test
	public void returnFizzForNumberDivisibleByThree() {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Fizz", b.calculate(6));
	}
	@Test
	public void returnBuzzForNumberDivisibleByFive() {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Buzz", b.calculate(10));
	}

	@Test
	public void returnsFizzBuzzforNumberDivisibleByThreeAndFive() throws Exception {
		FizzBuzz b = new FizzBuzz();
		assertEquals("FizzBuzz", b.calculate(30));
	}
}
