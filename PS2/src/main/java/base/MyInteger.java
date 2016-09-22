package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (this.iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (this.isEven() == false)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		if (this.isEven() == false) {
			boolean prime = true;
			for (int x = 2; x <= this.iValue / 2; x++) {
				if (this.iValue % 2 == 0) {
					prime = false;
					break;
				}
			}
			return prime;
		} else
			return false;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int num) {
		if (MyInteger.isEven(num) == false)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int num) {
		if (MyInteger.isEven(num) == false) {
			boolean prime = true;
			for (int x = 2; x <= num / 2; x++) {
				if (num % 2 == 0) {
					prime = false;
					break;
				}
			}
			return prime;
		} else
			return false;
	}

	public static boolean isEven(MyInteger integer) {
		if (integer.iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyInteger integer) {
		if (MyInteger.isEven(integer) == false)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger integer) {
		if (MyInteger.isEven(integer) == false) {
			boolean prime = true;
			for (int x = 2; x <= integer.iValue / 2; x++) {
				if (integer.iValue % 2 == 0) {
					prime = false;
					break;
				}
			}
			return prime;
		} else
			return false;
	}

	public boolean equals(int x) {
		if (this.iValue == x)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger integer) {
		if (this.iValue == integer.iValue)
			return true;
		else
			return false;
	}
}
