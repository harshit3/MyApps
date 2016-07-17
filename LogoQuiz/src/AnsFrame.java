
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AnsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton originalButton;
	private String correctAnswer;
	private JButton btnSumit;
	static int counter=0;
	/**
	 * Launch the application.
	 */
	
	private void checkYourAnswer(){
		String yourAnswer=textField.getText();
		if(yourAnswer.equalsIgnoreCase(correctAnswer)){
			JOptionPane.showMessageDialog(this,"CORRECT");
			this.setVisible(false);
			this.dispose();
			originalButton.setEnabled(false);
			counter++;
			if(counter==7){
				JOptionPane.showMessageDialog(this,"You are now qualified for next level");
				LogoQuiz.btnNextLevel.setVisible(true);
			}
		}	
		else
			JOptionPane.showMessageDialog(this,"Sorry, WRONG");
	}
	public static void main(String[] args) {
		
				} 
	/**
	 * Create the frame.
	 */
	public AnsFrame(String correctAnswer,String imageName,JButton b) {
		
		originalButton=b;
		this.correctAnswer=correctAnswer;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 580, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btn=new JButton("");
		btn.setIcon(new ImageIcon(LogoQuiz.class.getResource(imageName)));
		contentPane.add(btn);
		btn.setBounds(46, 78, 198, 187);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField.setBounds(293, 131, 198, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeAnswerHere = new JLabel("Type Answer Here");
		lblTypeAnswerHere.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTypeAnswerHere.setBounds(312, 105, 167, 22);
		contentPane.add(lblTypeAnswerHere);
		
		btnSumit = new JButton("SUBMIT");
		btnSumit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkYourAnswer();
			}
		});
		btnSumit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSumit.setBounds(329, 215, 131, 23);
		contentPane.add(btnSumit);
		
	}
}
