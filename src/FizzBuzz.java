
public class FizzBuzz {

	private int dividend;
	private int divisor;
	
	
	
	public FizzBuzz() {
		// TODO Auto-generated constructor stub
	}

	public String calculate (int number) {
		
		//number = dividend;
		
		if (isDivisibleBy(number, 5) && !isDivisibleBy(number, 3)) {
			return "Buzz";
		}
		if (isDivisibleBy(number, 3) && !isDivisibleBy(number, 5)) {
			return "Fizz";
		}
		if (isDivisibleBy(number, 3) && isDivisibleBy(number, 5)) {
			return "FizzBuzz";
		}
		else {
			return Integer.toString(number);
		}
	
	}
	
	private boolean isDivisibleBy(int dividend, int divisor) {
		
		if (dividend % divisor == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}


}
