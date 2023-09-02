
public class third_mathValExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100, b = 200, c = a + b;

		System.out.println("Enter the first number: " + a);
		System.out.println("Enter the second number: " + b);

		c = addNumbers(a, b);

		System.out.println("The total is: " + c);

	}

	static int addNumbers(int n1, int n2) {
		return n1 + n2;
	}

}
