import java.util.Scanner;


public class Homework3_Question8 {

	public static void main(String[] args) {
		
		System.out.print("Enter number of millimeters: ");
		
		Scanner inputScanner = new Scanner(System.in);
		
		int millimeters = inputScanner.nextInt();
		
		int meterConversion = millimeters/1000;
		
		int centimeterConversion = millimeters / 10 % 10;
		
		int millimeterConversion = millimeters % 10;
		
		System.out.println(millimeters + " millimeters = " + meterConversion + " meters + " + centimeterConversion + " centimeters + " + millimeterConversion + " millimeters");
			
		inputScanner.close();
	}

}
