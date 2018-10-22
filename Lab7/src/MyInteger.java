
public class MyInteger {
	private int value;
	
	public MyInteger(int newValue) {
		value = newValue;
	}
	public int getIntValue() {
		return value;
	}
	
	public boolean isEven() {
		if(value%2 == 0) {
			return true;
		}
		else
			return false;
	}
	public boolean isOdd() {
		if(value%2 ==1) {
			return true;
		}
		else
			return false;
	}
	public boolean isPrime() {
		for(int i = 2; i < value; i++) {
			if(value%i ==0) { 
				return false; // if not a prime
			}
		}
		return true;
	}
	
	public static boolean isEven(int x) {
		if(x%2 == 0) {
			return true;
		}
		else
			return false;
	}
	public static boolean isOdd(int x) {
		if(x%2 == 1) {
			return true;
		}
		else 
			return false;
	}
	public static boolean isPrime(int x) {
		for(int i = 2; i < x; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger x) {
		return MyInteger.isEven(x.getIntValue());
	}
	public static boolean isOdd(MyInteger x) {
		return MyInteger.isOdd(x.getIntValue());
	}
	public static boolean isPrime(MyInteger x) {
		return MyInteger.isPrime(x.getIntValue());
	}
	
	public boolean equals(int x) {
		return (x == value);
	}
	public boolean equals(MyInteger x) {
		return (x.getIntValue() == this.getIntValue());
	}
	
	public static int parseInt(String x) {
		return Integer.parseInt(x);
	}

}
