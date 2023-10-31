package game;

import javax.swing.JOptionPane;

public class GuessingOperation extends GameWindow{
	
	public void operate(){
		
		if(userGuess == randomGenerated) {
			score += 1;
			userAttempts = 3;
			randomGenerated = 0;
			JOptionPane.showMessageDialog(null, "Correct Answer!!");
			System.out.println("Correct Answer!!");
			JOptionPane.showMessageDialog(null, "Generate a new Number");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect Answer. Try Again.");
			System.out.println("Incorrect Answer!!");
			userAttempts -= 1;
		}
		
	}

}
