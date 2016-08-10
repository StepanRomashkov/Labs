package testing;

import java.util.Scanner;

public class LabNo3 {

	public static void main(String[] args) {
		System.out.println("Learn your squares and cubes!");
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
			System.out.print("Please enter the number: ");
			int num = scan.nextInt();
			
			System.out.println("Number" + "\t" + "Squared" + "\t   " + "Cubed");
			System.out.println("======" + "\t" + "=======" + "\t   " + "=====");
			for (int i = 1; i <= num; i++) {
				System.out.println(i + "\t " + (int)Math.pow(i, 2) + "\t    " + (int)Math.pow(i, 3));
			}
			
			System.out.println("Do you want to do it again? (yes/no)");
			scan.nextLine();
			choice = scan.nextLine();
		}
		System.out.println("Bye!");
		scan.close();

	}

}
