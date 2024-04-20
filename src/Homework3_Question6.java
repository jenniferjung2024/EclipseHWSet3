import java.util.Scanner;

public class Homework3_Question6 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter value for x: ");
		
		Scanner scr = new Scanner(System.in);
		
		double x = scr.nextDouble();
		
		double y = 1.0/3 * x * x - 3.0/5 * x + 5.0/7;
		
		System.out.print("function f(" + x +") = ");
		System.out.printf("%.6f", y);
		
		scr.close();
		
	}

}
