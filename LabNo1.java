package testing;

import java.util.Scanner;

public class LabNo1 {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Length:");
			float length = scan.nextFloat();
			
			System.out.println("Enter Width:");		
			float width = scan.nextFloat();
			
			System.out.println("Enter Height:");
			float height = scan.nextFloat();
			
			float result = length * width;
			System.out.println("Area: " + result);
			result = 2*(length + width);
			System.out.println("Perimeter: " + result);
			result = length * width * height;
			System.out.println("Volume: " + result);
			
			System.out.println("To calculate something else type \"y\". To quit type anything:");
			scan.nextLine();
			
			String again = scan.nextLine();
			if (!again.equals("y")) {
				
				break;
			}
		}
	}

}
