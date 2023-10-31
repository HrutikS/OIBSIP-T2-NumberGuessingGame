package game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Contains a welcome page and all rules of the game. Can include an image as well.
public class WelcomeWindow {
	
	public void welcome() {
		
		//Creating Frame
		JFrame frame = new JFrame();
		frame.setTitle("Welcome Window");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		
		
        //Creating Label for Title
		JLabel label = new JLabel("<html><h1><strong>Number Guessing Game</strong></h1><hr></html>");
		label.setBounds(100,50,350,50);
		label.setForeground(Color.white);
		frame.add(label);
		
		
		//Creating Label for Rules
		JLabel labelForRulesHeading = new JLabel("<html>"+"<h3><u>Rules</u></h3>"+"</html>");
		labelForRulesHeading.setForeground(Color.white);
		frame.add(labelForRulesHeading);
		labelForRulesHeading.setBounds(100, 40, 300, 200);
		
		JLabel labelForRules = new JLabel("<html>"+
											"<ul>" +
		        							"<li>Start Game.</li>" +             
		        							"<li>Generate a random number between 1-100.</li>" +
		        							"<li>Enter your guess in the text box.</li>" + 
		        							"<li>You get 3 Attempts to get the correct answer.</li>" +
		        							"</ul><html>");
		labelForRules.setBounds(100, 110, 300, 200);
		labelForRules.setForeground(Color.white);
		frame.add(labelForRules);
		
		
		//Creating Button
		JButton button = new JButton();
		frame.add(button);
		button.setText("Start Game");
		button.setBounds(200,295,100,30);
		button.addActionListener(e -> {
			GameWindow obj = new GameWindow();
			obj.game();
			frame.dispose();
		});
		button.setLayout(null);

		frame.setVisible(true);
		
	}

}
