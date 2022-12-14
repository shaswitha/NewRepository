package practice;

public class Methods {

	public static void main(String[] args) {

		System.out.println("Starting of main method");

		int r1 = addition(20, 30);
		System.out.println("output of addition received to main method is " + r1);

		double r2 = multiplication(2, 3.5, 5.4);
		System.out.println("output of multiplication received to main method is " + r2);

		System.out.println("Ending of main method");

	}

	static int addition(int num1, int num2) {
		System.out.println("input received are " + num1 + " and " + num2);
		int result = num1 + num2;
		System.out.println("output is " + result);
		return result;
	}

	static double multiplication(int num1, double num2, double num3) {
		System.out.println("input received are " + num1 + " and " + num2 + " and " + num3);
		double result = num1 * num2 * num3;
		return result;
	}

}
