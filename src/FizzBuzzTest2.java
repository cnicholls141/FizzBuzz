import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest2 {

	@Test
	public void returnsNumberForNumberNotDivisibleByThreeAndFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("12", b.calculate(12));
	}
	
	@Test
	public void returnFizzForNumberDivisibleByThree(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Fizz", b.calculate(6));
	}
	@Test
	public void returnBuzzForNumberDivisibleByFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Fizz", b.calculate(10));
	}
	@Test
	public void returnsFizzBuzzForNumberDivisibleByThreeAndFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("FizzBuzz", b.calculate(30));
	}

}
