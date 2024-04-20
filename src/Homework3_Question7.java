import java.util.Scanner;

public class Homework3_Question7 {

	public static void main(String[] args) {
				
		//	Part 1: Prompt user to enter a 4-digit integer number.
				
		System.out.print("Enter 4-digit integer number: ");
		
		Scanner inputScanner = new Scanner(System.in);
		int userInput = inputScanner.nextInt();
		
		while (!(userInput / 1000 > 0 && userInput / 1000 < 10)) {
			System.out.println("Invalid entry.");
			System.out.print("\nEnter 4-digit integer number: ");
			userInput = inputScanner.nextInt();
		}

		
		//	Part 2: Extract digits at different places in this number, display these digits.
		
		int onesPlace = userInput % 10;
		int thousandsPlace = userInput / 1000;
		int tensPlace = userInput / 10 % 10;
		int hundredsPlace = userInput / 100 % 10;
		
		System.out.println("Thousands digit: " + thousandsPlace);
		System.out.println("Hundreds digit: " + hundredsPlace);
		System.out.println("Tens digit: " + tensPlace);
		System.out.println("Ones digit: " + onesPlace);
		
		//	Part 3: Generate a new number which is the reverse of the original number in (1). Display this new number.

		int newNumber = onesPlace * 1000 + tensPlace * 100 + hundredsPlace * 10 + thousandsPlace;

		System.out.println("\nNew number: " + newNumber);
		
		// Close scanner before ending program
		
		inputScanner.close();
		
	}

}
