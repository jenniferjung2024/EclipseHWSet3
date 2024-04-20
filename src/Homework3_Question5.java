import java.util.Scanner;

public class Homework3_Question5 {

	public static void main(String[] args) {

		// Part 1: Prompt user to enter 3 int type numbers, assign them to variables a, b, and c respectively.
		
			Scanner scnr = new Scanner(System.in);
		
			System.out.print("Enter first integer: ");
			int a = scnr.nextInt();
			
			System.out.print("Enter second integer: ");
			int b = scnr.nextInt();
						
			System.out.print("Enter third integer: ");
			int c = scnr.nextInt();
		
			
		// Part 2: Calculate sum of these numbers, store result in variable sum. Display message: “The sum of numbers [the-first-number], [the-second-number] and [the-third-number] is [sum]” – replace [the-first-number], [the-second-number], [the-third-number] and [sum] with real values.
		
			int sum = a + b + c;
			
			System.out.println("The sum of numbers " + a + ", " + b + " and " + c + " is " + sum);
			
			
		// Part 3: Calculate the average of these 3 numbers, store result in variable average. Display message “The average of numbers [the-first-number], [the-second-number] and [the-third-number] is [average]”. – replace [the-first-number], [the-second-number], [the-third-number] and [average] with real values.
		
			double average = sum / 3.0;
			
			System.out.println("The average of numbers " + a +", " + b + " and " + c + " is " + average);
			
			
		// Close scanner before ending program.
			
			scnr.close();
		
	}

}
