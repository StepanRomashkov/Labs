package testing;

import java.util.Random;
import java.util.Scanner;

public class LabNo5 {
	
	public static int rollDice(int numOfSides) {
		Random rand = new Random();
		int result;
			result = rand.nextInt(numOfSides) + 1;  
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfSides, numOfDice;
		boolean again;
		
		do {
			again = false;
			System.out.println("Please, enter the number of sides of a dice you want to roll: ");
			numOfSides = scan.nextInt();
			System.out.println("How many dice you want to roll?");
			numOfDice = scan.nextInt();
			System.out.println("Good! Here's your rolls:");
			for (int i = 0; i < numOfDice; i++) {
				System.out.print((i + 1) + ": ");
				System.out.println(rollDice(numOfSides));
			}
			scan.nextLine();
			System.out.println("Do you want to do it again? (y/n)");
			if (scan.nextLine().equals("y"))
				again = true;
			else {
				System.out.println("Bye!");
				break;
			}
		} while (again);
		scan.close();
	}

}
