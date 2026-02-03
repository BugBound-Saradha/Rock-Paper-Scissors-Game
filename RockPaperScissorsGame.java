package day4Package;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// Get user option
		System.out.println(
				"Let's play Rock, Paper, Scissors game !\nPlease choose your option\n1. Rock\n2. Paper\n3. Scissors");
		Scanner input = new Scanner(System.in);
		int userOption = input.nextInt();
		input.close();
		// Check if user has entered valid option from 1 to 3
		// If user entered invalid option, display error message
		if (userOption < 1 || userOption > 3) {
			System.out.println("Invalid option selected, option must be 1, 2 or 3");
			return;
		} else {
			// If user entered valid option, proceed with the game
			Random random = new Random();
			int sysOption = random.nextInt(1, 4); // Generate random number between 1 and 3
			switch (userOption) {
			case 1:
				// Possible outcomes when user selected option 1
				switch (sysOption) {
				case 1:
					// User option is 1 and system-generated random option is 1
					System.out.println("You chose Rock, system chose Rock, It's a DRAW !");
					break;
				case 2:
					// User option is 1 and system-generated random option is 2
					System.out.println("You chose Rock, system chose Paper, The system wins, better luck next time !");
					break;
				case 3:
					// User option is 1 and system-generated random option is 3
					System.out.println("You chose Rock, system chose Scissors, You win, Congratulations !");
					break;
				}
				break;
			case 2:
				// Possible outcomes when user selected option 2
				switch (sysOption) {
				case 1:
					// User option is 2 and system-generated random option is 1
					System.out.println("You chose Paper, system chose Rock, You win, Congratulations !");
					break;
				case 2:
					// User option is 2 and system-generated random option is 2
					System.out.println("You chose Paper, system chose Paper, It's a DRAW !");
					break;
				case 3:
					// User option is 2 and system-generated random option is 3
					System.out.println(
							"You chose Paper, system chose Scissors, The system wins, better luck next time !");
					break;
				}
				break;
			case 3:
				// Possible outcomes when user selected option 3
				switch (sysOption) {
				case 1:
					// User option is 3 and system-generated random option is 1
					System.out
							.println("You chose Scissors, system chose Rock, The system wins, better luck next time !");
					break;
				case 2:
					// User option is 3 and system-generated random option is 2
					System.out.println("You chose Scissors, system chose Paper, You win, Congratulations !");
					break;
				case 3:
					// User option is 3 and system-generated random option is 3
					System.out.println("You chose Scissors, system chose Scissors, It's a DRAW !");
					break;
				}
				break;
			}

		}

	}

}
