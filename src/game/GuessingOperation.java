package game;

import javax.swing.JOptionPane;

//Contains logic to:
	//match user guess with generated number.
	//update score.
	//update attempts.

public class GuessingOperation extends GameWindow{
	
	public void operate(){
		if(userGuess > randomGenerated ) {
			System.out.println("Your Guess is Higher than Generated number. Try again.");
			JOptionPane.showMessageDialog(null, "Your Guess is Higher than Generated number. Try again.");
			userAttempts -= 1;
		}else if(userGuess < randomGenerated) {
			System.out.println("Your Guess is Lower than Generated number. Try again.");
			JOptionPane.showMessageDialog(null, "Your Guess is Lower than Generated number. Try again.");
			userAttempts -= 1;
		}else if(userGuess == randomGenerated) {
			score += 1;
			userAttempts = 10;
			randomGenerated = 0;
			JOptionPane.showMessageDialog(null, "Correct Answer!!");
			System.out.println("Correct Answer!!");
			JOptionPane.showMessageDialog(null, "Generate a new Number");
		}
		
	}

}
