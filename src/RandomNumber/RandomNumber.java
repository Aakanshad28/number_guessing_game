package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random ran = new Random();
		int randomNumber = ran.nextInt(100) + 1;
		//System.out.println("The Random Number is:" + randomNumber);
		while (true) {

			System.out.println("Enter your guessing number between(1-100):");
			Scanner scanner = new Scanner(System.in);
			
			int guess = scanner.nextInt();
			if (guess == randomNumber) {
				System.out.println("You Win!Your Guessing is correct.");
				break;
			} else if (randomNumber > guess) {
				System.out.println("Please try again!The number is greater than the guess number");
			} else {
				System.out.println("Please try again!The number is lesser than the guess number");
			}
			scanner.close();
		}

	}

}
