import java.util.Scanner;

public class palindromeNumber_15th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palindrome number is the number which can be same when you do reverse

		System.out.println("Enter the number to find out if it's palindrome or not: ");

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int reverse = 0, temp, a;

		temp = num;

		while (temp != 0) {
			a = temp % 10;
			reverse = reverse * 10 + a;
			temp = temp / 10;
		}

		if (num == reverse) {
			System.out.println("The number is palindrome...");
		} else {
			System.out.println("The number is not palindrome...");
		}
	}
}
