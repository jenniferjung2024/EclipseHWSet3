
public class Homework3_Question4 {

	public static void main(String[] args) {
		
		// Part 1: Define an int variable x, initialize it with value 52, display x.
		
		int x = 52;
		System.out.println("x = " + x);
		
		
		// Part 2: Define a double variable y, initialize it with value 987.654, display y.
		
		double y = 987.654;
		System.out.println("y = " + y);
		
		
		// Part 3: Change variable x by adding 101 into to the original x (For example, if x is 100, add 101 into x, x will be 201). Display the original x (before add operation is performed) and new x.
		
		System.out.println("\nPart 3:");
		System.out.println("Original x = " + x);
		x += 101;
		System.out.println("New x = " + x);
		
		
		// Part 4: Assign y to x. Display x and y.
		
		System.out.println("\nPart 4:");
		x = (int)y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// Part 5: Define double variable z, add half (1/2) of x and one-third (1/3) of y into z. display z .
		
		System.out.println("\nPart 5:");
		double z =  0.5 * x + y * (1.0/3);
		System.out.println("z = " + z);

	}

}
