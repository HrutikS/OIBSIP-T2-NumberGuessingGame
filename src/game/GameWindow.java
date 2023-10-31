package game;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Welcome window of the game.
//Contains name of game, rules and Start Game button.

public class GameWindow {

	public static int randomGenerated = 0;
	public static int userGuess = 0;
	public static int userAttempts = 3;
	public static int score = 0;
	JLabel labelForPoints; 
	JLabel labelForAttempts;

	public void game() {

		//Creating frame
		JFrame frame = new JFrame();
		frame.setTitle("Number Guessing Game!!!");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		
		//Label for Score
		labelForPoints = new JLabel();
		score = 0;
		labelForPoints.setText("Score : "+score);
		labelForPoints.setBounds(400,-35,200,100);
		labelForPoints.setForeground(Color.white);
		
		//Label for Attempts
		labelForAttempts = new JLabel();
		userAttempts = 3;
		labelForAttempts.setText("Attempts : "+userAttempts);
		labelForAttempts.setBounds(400,-15,200,100);
		labelForAttempts.setForeground(Color.white);

		
		//Creating button for Generating random number
		JButton buttonForGenerate = new JButton();
		buttonForGenerate.setText("Generate Random Number");
		buttonForGenerate.setBounds(108, 90, 270, 30);
		//Adding action listener to buttonForGenerate
		buttonForGenerate.addActionListener(e -> {
			Random random = new Random();
			randomGenerated  = random.nextInt(1, 101);
			//MessageDialogBox
			JOptionPane.showMessageDialog(null, "Random number generated");
			System.out.println("Random number :"+randomGenerated);
			JOptionPane.showMessageDialog(null, "Enter your guess");
		});


		//Creating text box for user guesses.
		JTextField textField = new JTextField(20);
		textField.setBounds(108, 180, 270, 30);
		textField.setText("Enter your guess here");


		//Creating button for Generating random number
		JButton buttonForUser = new JButton();
		buttonForUser.setText("Submit");
		GuessingOperation obj = new GuessingOperation();
		buttonForUser.setBounds(108, 220, 270, 30);
		//Adding action listener to buttonForUser. 
		buttonForUser.addActionListener(e -> {
			String text = textField.getText();
			userGuess = Integer.parseInt(text);
			obj.operate();
			System.out.println("Score on game window:"+score);
			System.out.println("Attempts on game window:"+userAttempts);
			labelForPoints.setText("Score : "+score);
			labelForAttempts.setText("Attempts : "+userAttempts);
			if(userAttempts <= 0) {
				GameOverWindow object  = new GameOverWindow();
				object.gameOver();
				frame.dispose();
			}
		});
		
		
		//Creating button to end game
		JButton buttonToEnd = new JButton();
		buttonToEnd.setText("End Game");
		buttonToEnd.setBounds(110,300, 120,30);
		buttonToEnd.addActionListener(e -> {
			GameOverWindow object  = new GameOverWindow();
			object.gameOver();
			frame.dispose();
		});
		
		
		//Creating button to exit game
		JButton buttonToExit = new JButton();
		buttonToExit.setText("Exit Game");
		buttonToExit.setBounds(255,300, 120,30);
		buttonToExit.addActionListener(e -> {
			System.out.println("Game Exited");
			System.exit(0);
		});
		
		
		//Adding components to frame
		frame.add(labelForPoints);
		frame.add(labelForAttempts);
		frame.add(buttonForGenerate);
		frame.add(textField);
		frame.add(buttonForUser);
		frame.add(buttonToEnd);
		frame.add(buttonToExit);

		frame.setVisible(true);
	
	}

}
