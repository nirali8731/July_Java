import java.util.Scanner;

public class largeNumber_13th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b;
		
		//getting first number
		System.out.println("Enter the first number: ");
		Scanner scn1 = new Scanner(System.in);
		a = scn1.nextDouble();
		
		//getting second number
		System.out.println("Enter the first number: ");
		Scanner scn2 = new Scanner(System.in);
		b = scn2.nextDouble();
		
		if(a>b)
		{
			System.out.println("The Number " + a + " is bigger than " + b);
		}
		else
		{
			System.out.println("The Number " + b + " is bigger than " + a);
		}
	}

}
