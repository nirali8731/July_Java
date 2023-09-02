import java.util.Scanner;

public class checkEvenOdd_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;

		System.out.println("Enter the number to find out if the number is odd/even: ");

		// get the input from user
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();

		if (a % 2 == 0) {
			System.out.println("The number " + a + " is even.");
		} else {
			System.out.println("The number " + a + " is odd.");
		}

	}

}
