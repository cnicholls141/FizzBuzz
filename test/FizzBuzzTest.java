import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	
	public void returnsNumberForNumberNotDivisibleByThreeAndFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("12", b.calculate(12));
	}
	
	public void returnFizzForNumberDivisibleByThree(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Fizz", b.calculate(6));
	}
	public void returnBuzzForNumberDivisibleByFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("Fizz", b.calculate(10));
	}
	
	public void returnsFizzBuzzForNumberDivisibleByThreeAndFive(int number) {
		FizzBuzz b = new FizzBuzz();
		assertEquals("FizzBuzz", b.calculate(30));
	}
	
}
