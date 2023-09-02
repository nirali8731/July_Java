import java.util.Scanner;

public class factorialNumber_14th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("To calculate factorial, Enter the number:  ");

		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double num = a;

		//5*4*3*2*1
		for (double i = (a - 1); i > 1; i--) {

			num = num * i;
		}

		System.out.println("The factorial of this number is: " + num);
	}

}
