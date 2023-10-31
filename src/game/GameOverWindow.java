package game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameOverWindow extends GuessingOperation{
	
	public void gameOver() {
		
		//Creating frame
		JFrame frame = new JFrame();
		frame.setTitle("Game Over");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		
		//Label for Game Over
		JLabel labelForGameOver = new JLabel("<html>"+"<h1>Game Over !!</h1>"+"</html>");
		labelForGameOver.setForeground(Color.white);
		labelForGameOver.setBounds(170, 30, 150, 150);
		frame.add(labelForGameOver);
		
		//Label for Score
		JLabel labelForScore = new JLabel("<html>"+"<h2>Your Score : "+score+"</h2>"+"</html>");
		labelForScore.setForeground(Color.white);
		labelForScore.setBounds(180, 80, 150, 150);
		frame.add(labelForScore);
		
		//Button for New Game
		JButton buttonForNewGame = new JButton();
		buttonForNewGame.setText("Start New Game");
		buttonForNewGame.setBounds(170, 205, 150, 30);
		buttonForNewGame.addActionListener(e -> {
			GameWindow obj = new GameWindow();
			obj.game();
			frame.dispose();
		});
		
		//Button for Exit
		JButton buttonForExit = new JButton();
		buttonForExit.setText("Exit Game");
		buttonForExit.setBounds(170, 255, 150, 30);
		buttonForExit.addActionListener(e -> {
			System.out.println("Game Exited");
			System.exit(0);
		});
		
		//Adding components to frame
		frame.add(buttonForNewGame);
		frame.add(buttonForExit);
		frame.setVisible(true);
		
	}

}
