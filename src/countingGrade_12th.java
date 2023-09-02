import java.util.Iterator;
import java.util.Scanner;

public class countingGrade_12th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] marks = new float[3];
		float sum = 0, avg = 0;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the marks of 3 subjects: ");

		for (int i = 0; i < 3; i++) {
			marks[i] = scn.nextFloat();
		}
		for (int e = 0; e < 3; e++) {
			sum = sum + marks[e];
			avg = sum / 3;
		}

		if (avg >= 95) {
			System.out.println("Your Grade is: A+");
		} else if (avg >= 85 && avg < 95) {
			System.out.println("Your Grade is: A");
		} else if (avg < 85 && avg >= 70) {
			System.out.println("Your Grade is: B");
		} else if (avg < 70 && avg >= 55) {
			System.out.println("Your Grade is: C");
		} else {
			System.out.println("\n FAIL!!!TRY NEXT TIME TO GET GOOD SCORES. GOOD LUCK!!!");
		}

	}

}
