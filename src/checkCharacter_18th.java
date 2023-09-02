import java.util.Scanner;

public class checkCharacter_18th {

	public static void main(String[] args) {

		System.out.println("Enter the character: ");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

//		if else condition

		if (str == "a" || str == "e" || str == "i" || str == "o" || str == "u")
			System.out.println(str + " is vowel");
		else
			System.out.println(str + " is consonant");

//		switch case

//		switch (str) {
//		case "a":
//		case "e":
//		case "i":
//		case "o":
//		case "u":
//			System.out.println(str + " is vowel");
//			break;
//		default:
//
//		}

	}
}
