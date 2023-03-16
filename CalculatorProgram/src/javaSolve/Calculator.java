package javaSolve;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	 
		Scanner ua = new Scanner (System.in);
		System.out.println("My ClAcUlAtOr");
		System.out.println("");
		System.out.println("ATTENTION");
		System.out.println("Type 1 for Addition");
		System.out.println("Type 2 for subtraction");
		System.out.println("Type 3 for multiplication");
		System.out.println("Type 4 for divition");
		System.out.println("Type 5 for modulus");
		System.out.println("");
		System.out.println("ENTER THE NUMBER BELOW");
		System.out.print("");
		
		System.out.print("");
		int Num1 = ua.nextInt();
		
		System.out.print("");
		int Num2 = ua.nextInt();
		int result;
		int choice;
			
		choice = ua.nextInt();
		
			switch (choice) {
			
			case 1:
				result = Num1 + Num2;
				System.out.print("Sum = " + result);
				break;
			case 2:
				result = Num1 - Num2;
				System.out.print("Subtraction = " + result);
				break;
			case 3:
				result = Num1 * Num2;
				System.out.print("Multiplication = " + result);
				break;
			case 4:
				result = Num1 / Num2;
				System.out.print("divition = " + result);
				break;
			case 5:
				result = Num1 % Num2;
				System.out.print("Modulus = " + result);
				break;
				
				default:
					System.out.println("Incorrect Number or Symbol");
					System.out.println("Please Try agin");
				 return;
			}
	
	}

}
