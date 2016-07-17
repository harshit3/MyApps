import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	int width=50;
	boolean isXor0=true;
	JButton button_1 = new JButton("");
	JButton button_2 = new JButton("");
	JButton button_3 = new JButton("");
	JButton button_4 = new JButton("");
	JButton button_5 = new JButton("");
	JButton button_6 = new JButton("");
	JButton button_7 = new JButton("");
	JButton button_8 = new JButton("");
	JButton button_9 = new JButton("");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
					JOptionPane.showMessageDialog(frame,"WELCOME!");
	}

	
	
	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setTitle("TIC-TAC-TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 400, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_1);
			}
		});
		
		
		button_1.setBounds(74, 32, width, 23);
		contentPane.add(button_1);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_2);
				
			}
		});
		
		
		button_2.setBounds(162, 32, width, 23);
		contentPane.add(button_2);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_3);
				
			}
		});
		
		
		button_3.setBounds(256, 32, width, 23);
		contentPane.add(button_3);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_4);
				
			}
		});
		
		
		button_4.setBounds(74, 102, width, 23);
		contentPane.add(button_4);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_5);
				
			}
		});
		
		
		button_5.setBounds(162, 102, width, 23);
		contentPane.add(button_5);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_6);
				
			}
		});
		
		
		button_6.setBounds(256, 102, width, 23);
		contentPane.add(button_6);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_7);
				
			}
		});
		
		
		button_7.setBounds(74, 168, width, 23);
		contentPane.add(button_7);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_8);
				
			}
		});
		
		
		button_8.setBounds(162, 168, width, 23);
		contentPane.add(button_8);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(button_9);
				
			}
		});
		
		
		button_9.setBounds(256, 168, width, 23);
		contentPane.add(button_9);
		
		JButton btnRestartGame = new JButton("Restart Game");
		btnRestartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});
		btnRestartGame.setBounds(121, 227, 121, 23);
		contentPane.add(btnRestartGame);
	}
	
	
	private boolean isRowBlank(JButton ...b){
		boolean rowBlank=true;
		for(JButton b1:b){
		if(b1.getText().trim().length()!=0)
			return false;
		else
			rowBlank=true;
		}
		return rowBlank;
	}
		
	
	private boolean isRowMatch(JButton b1,JButton b2,JButton b3){
		if(!isRowBlank(b1,b2,b3)){
			if(b1.getText()==b2.getText() && b1.getText()==b3.getText())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	private void resetGame(){
		button_1.setText("");
		button_2.setText("");
		button_3.setText("");
		button_4.setText("");
		button_5.setText("");
		button_6.setText("");
		button_7.setText("");
		button_8.setText("");
		button_9.setText("");
		isXor0=true;
	}
	
	private boolean isGameOver(){	
		
		/*if(button_1.getText().trim().length()!=0 && button_2.getText().trim().length()!=0 && button_3.getText().trim().length()!=0){
			if(button_1.getText().equals(button_2.getText()) && button_1.getText().equals(button_3.getText())){
				return true;
			}
		}
		if(button_1.getText().trim().length()!=0 && button_4.getText().trim().length()!=0 && button_7.getText().trim().length()!=0){
			if(button_1.getText().equals(button_4.getText()) && button_1.getText().equals(button_7.getText())){
				return true;
			}
		}
		if(button_1.getText().trim().length()!=0 && button_5.getText().trim().length()!=0 && button_9.getText().trim().length()!=0){
			if(button_1.getText().equals(button_5.getText()) && button_1.getText().equals(button_9.getText())){
				return true;
			}
		}
		if(button_2.getText().trim().length()!=0 && button_5.getText().trim().length()!=0 && button_8.getText().trim().length()!=0){
			if(button_2.getText().equals(button_5.getText()) && button_2.getText().equals(button_8.getText())){
				return true;
			}
		}
		if(button_4.getText().trim().length()!=0 && button_5.getText().trim().length()!=0 && button_6.getText().trim().length()!=0){
			if(button_4.getText().equals(button_5.getText()) && button_4.getText().equals(button_6.getText())){
				return true;
			}
		}
		if(button_3.getText().trim().length()!=0 && button_5.getText().trim().length()!=0 && button_7.getText().trim().length()!=0){
			if(button_3.getText().equals(button_5.getText()) && button_3.getText().equals(button_7.getText())){
				return true;
			}
		}
		if(button_7.getText().trim().length()!=0 && button_8.getText().trim().length()!=0 && button_9.getText().trim().length()!=0){
			if(button_7.getText().equals(button_8.getText()) && button_7.getText().equals(button_9.getText())){
				return true;
			}
		}
		if(button_3.getText().trim().length()!=0 && button_6.getText().trim().length()!=0 && button_9.getText().trim().length()!=0){
			if(button_3.getText().equals(button_6.getText()) && button_3.getText().equals(button_9.getText())){
				return true;
			}
		}
		return false;
	}*/
		if(isRowMatch(button_1,button_2,button_3)){
			return true;
		}
		else if(isRowMatch(button_1,button_4,button_7)){
			return true;
		}
		else if(isRowMatch(button_1,button_5,button_9)){
			return true;
		}
		else if(isRowMatch(button_2,button_5,button_8)){
			return true;
		}
		else if(isRowMatch(button_4,button_5,button_6)){
			return true;
		}
		else if(isRowMatch(button_3,button_5,button_7)){
			return true;
		}
		else if(isRowMatch(button_7,button_8,button_9)){
			return true;
		}
		else if(isRowMatch(button_3,button_6,button_9)){
			return true;
		}
		else return false;
			
	}
	
	private boolean isGameDraw(JButton ...b){
		boolean gameDraw=false;
		for(JButton b1:b){
			if(b1.getText().trim().length()==0)
				return false;
			else
				gameDraw=true;
		}
		return gameDraw;
	}
	
	
	private void printXor0(JButton btn){
		if(btn.getText().trim().length()==0){
		if(isXor0){
			btn.setText("X");
		}
		else{
			btn.setText("0");			
		}
		isXor0=!isXor0;
		}
		if(isGameOver()){
			JOptionPane.showMessageDialog(this,"Game Over "+btn.getText()+" U win.");
			resetGame();
		}
		if(isGameDraw(button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9)){
			JOptionPane.showMessageDialog(this,"Game Draw");
			resetGame();
		}
	}
}
