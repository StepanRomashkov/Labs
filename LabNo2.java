package testing;

import java.util.Scanner;

public class LabNo2 {

	private static final String[] MAIN_STORY_CHOICES = {"west", "east", "north", "south"};
	
	private static Scanner scan = new Scanner(System.in);

	private static String  makeChoice(String[] input) {
		boolean correct = false;
		String choice = "";
		while (!correct) {
			choice = scan.nextLine();
			for (int i = 0; i < input.length; i++) {
				if (input[i].equals(choice)) {
					correct = true;
					return choice;
				}
			}
			if (!correct) {
				System.out.println("Your choice is invalid! Your possible choices are:");
				for (int j = 0; j < input.length; j++)
					if (j == input.length - 1)
						System.out.print(input[j] + ". Try again: ");
					else
						System.out.print(input[j] + ", ");
				}
		}
		return choice;
	}
		
	public static void main(String[] args) {
		String name = "";
		boolean townVisited = false;
		boolean islandVisited = false;
		boolean krakenVisited = false;
		boolean gameOver = false;
		boolean again = true;
		
		String storyBegins = "Congratulations! You made the right choice of becoming a brave captain of a soccer... I mean the Nobz pirate crew. As you sail off a freshly robbed small port town you found yourself after a week of pretty pointless sailing facing an obvious choice: what to do next? Rumors says that there's a secluded treasure island to the west of where you are. To the south is an another small port town ready to be robbed. To the east is a dangerous waters where the horrific sea monster Kraken lurks somewhere in the deep. Finally to the north is nothing but open sea which is tempting by it's unknown. Where do you want to sail: west, east, north or south?";
		String goWest1stTimeBeforeTown = "You with your crew searched the entire island which was quite small so you hadn't spent too much time. At the middle of the island you found a cave full of treasure. Congratulations! Now you are rich! More of it, there were so much treasure that you couldn't take it all at one time! You loaded your ship full. End of the story. But wait! What about adventures? You're still can do something! You can go south to the port town and feel the taste of a sweet pillaging or you can sail north and explore the ocean. Finally you can try your luck with the Kraken to the east! Where do you want to go now?";
		String goWestAfterTownX = "With your extended crew you moor to the treasure island. You found a great treasure in the cave! But your crew decided not to share it with their \"dear\" captain... They're pirates after all! Bastards! They murdered you and that's the end of the story.";
		String goWest2ndTimeX = "Actually There's no point in returning to the island now. Instead you went to the north and after a few days of exploring you found a big port city, disbanded your crew and spent the rest of your life living happily. Happy end!";
		String goEastEmpty = "Yarrrr!!! You really are " + name + ", The Brave! Or just stupid enough to go after Kraken. But let's cut off the drama. In fact, the Kraken is just an overgrown squid on steroids but still dangerous! You fired at him with with all of your firepower and damaged him but not enough to kill. Luckily you managed to escape in one piece. Maybe if you had enough people... Who knows? Well, at least you survived. You still can go anywhere you like: west to search for the treasure island, north to the unknown, south to pillage the port town. Or you want to push your luck and go east again for the second time? It's up to you.";
		String goEast2ndTimeX = "Yarrr... You don't know where to stop do you? Unlucky. You've been crushed by the Kraken. End of the story. Bad end.";
		String goEastLoadedX = "Yarrrrrr!!! The treasure in your cargo makes you feel very lucky! You found Kraken and fired at him with with all of your firepower! You even managed to damage him but not enough to kill. You decided to sail away as fast as possible but your treasure didn't let you go fast enough. Kraken just smashed your ship in pieces with his mighty tentacles. You're dead. Bad luck.";
		String goEastAfterTownX = "This time you have more people and extra ship! Beware, Kraken! I'm on my way! You did it! Your firepower was good enough to kill the beast! You've got one of the Kraken's tentacles end decided to search te area. Soon you found a large port city nearby which sea trade was paralized by Kraken. You brought a great news to the city and presented the tentacle as a proof of slaying the vile beast. The city praised you and your crew as the local heroes. After that you decided to stay in that hospitable place for the rest of your life. Congratulations! You won!";
		String goNorthX = "You decided to explore the open ocean to the north. Unfortunately you went too far to the north and after several weeks of sailing you and your crew  died of starvation. Horrible end.";
		String goSouth1stTime = "You found a small port town with almost unguarded. There was a new ship in the harbour which you decided to keep for yourself. After you pillaged the town some of desperate locals joined your crew. Now you have 2 ships and more men! Where do you want to go now? North to the open ocean? West to the treasure island or maybe you want to go after Kraken with more power? Or maybe yo want to return to the poor town to the south? Make your choice, " + name + ".";
		String goSouth2ndTimeX = "There is nothing good left in the town but as you were approaching the harbour you've been unlucky to meet the Imperial fleet which sank your ships in no time. Greed is not good thing you know... End of the story.";
		String goEastAllVisitedStillAlive = "It's REALLY SPECTACULAR that you went THAT DAMN FAR in this adventure!!!! Unbelievable! You survived after meeting Kraken! Filled your ship with treasure! Got another ship and aditional crew members! You didn't died that far! Of course you killed that damn beast and gained all glory which is only possible! Congratulations! You are absolute winner!";
				
		
		System.out.println("Welcome to Nobz Pirate Ship!");
		System.out.print("What is your name? ");
		name = scan.nextLine();
		
		System.out.println(name + ", would you like to play a game?");
		String playerChoice = scan.nextLine();
		
		if (playerChoice.equalsIgnoreCase("no")) {
			System.out.println("Game over. You'll never be a brave pirate!");
			scan.close();
			return; //get out of here
		}
		//if I got here, they didn't say no
		while (again) {
			System.out.println(storyBegins);
			playerChoice = makeChoice(MAIN_STORY_CHOICES);
			if (playerChoice.equals("west")) {
				System.out.println(goWest1stTimeBeforeTown);
				islandVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else if (playerChoice.equals("north")) {
				System.out.println(goNorthX);
				gameOver = true;
			} else if (playerChoice.equals("east")) {
				System.out.println(goEastEmpty);
				krakenVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else {
				System.out.println(goSouth1stTime);
				townVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			}
			
			if ((playerChoice.equals("west") && townVisited) && !gameOver) {
				System.out.println(goWestAfterTownX);
				gameOver = true;
			} else if ((playerChoice.equals("west") && islandVisited) && !gameOver) {
				System.out.println(goWest2ndTimeX);
				gameOver = true;
			} else if ((playerChoice.equals("west") && krakenVisited) && !gameOver) {
				System.out.println(goWest1stTimeBeforeTown);
				islandVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else if ((playerChoice.equals("east") && krakenVisited) && !gameOver) {
				System.out.println(goEast2ndTimeX);
				gameOver = true;
			} else if ((playerChoice.equals("east") && islandVisited) && !gameOver) {
				System.out.println(goEastLoadedX);
				gameOver = true;
			} else if ((playerChoice.equals("east") && townVisited) && !gameOver) {
				System.out.println(goEastAfterTownX);
				gameOver = true;
			} else if ((playerChoice.equals("south") && townVisited) && !gameOver) {
				System.out.println(goSouth2ndTimeX);
				gameOver = true;
			} else if ((playerChoice.equals("south") && islandVisited) && !gameOver) {
				System.out.println(goSouth1stTime);
				townVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else if ((playerChoice.equals("south") && krakenVisited) && !gameOver) {
				System.out.println(goSouth1stTime);
				townVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else if (playerChoice.equals("north") && !gameOver) {
				System.out.println(goNorthX);
				gameOver = true;
			}
			
			if ((playerChoice.equals("east") && islandVisited) && !gameOver) {
				System.out.println(goEastLoadedX);
				gameOver = true;
			} else if ((playerChoice.equals("east") && townVisited) && !gameOver) {
				System.out.println(goEastAfterTownX);
				gameOver = true;
			} else if ((playerChoice.equals("west") && islandVisited) && !gameOver) {
				System.out.println(goWest2ndTimeX);
				gameOver = true;
			} else if ((playerChoice.equals("west") && townVisited) && !gameOver) {
				System.out.println(goWestAfterTownX);
				gameOver = true;
			} else if (((playerChoice.equals("south") && krakenVisited) && islandVisited) && !gameOver) {
				System.out.println(goSouth1stTime);
				townVisited = true;
				playerChoice = makeChoice(MAIN_STORY_CHOICES);
			} else if ((playerChoice.equals("south") && townVisited) && !gameOver) {
				System.out.println(goSouth2ndTimeX);
				gameOver = true;
			} else if (playerChoice.equals("north") && !gameOver) {
				System.out.println(goNorthX);
				gameOver = true;
			}
			
			if (playerChoice.equals("east") && !gameOver) {
				System.out.println(goEastAllVisitedStillAlive);
				gameOver = true;
			} else if (playerChoice.equals("west") && ! gameOver) {
				System.out.println(goWestAfterTownX);
				gameOver = true;
			} else if (playerChoice.equals("south") && !gameOver) {
				System.out.println(goSouth2ndTimeX);
				gameOver = true;
			} else if (!gameOver) {
				System.out.println(goNorthX);
				gameOver = true;
			}
						
			System.out.println("Do you want to play again? (y/n)");
			playerChoice = scan.nextLine();
			if (!playerChoice.equalsIgnoreCase("y")) {
				again = false;
				System.out.println("Thank you for playing! Bye!");
			} else
				gameOver = false;
		}
		scan.close();
	}

}
