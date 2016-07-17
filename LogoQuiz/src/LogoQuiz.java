import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class LogoQuiz extends JFrame {

	private JPanel contentPane;
	static JButton btnNextLevel;
	/**
	 * Launch the application.
	 */
	
	private void askAnswer(String correctAnswer,String imageName,JButton b){
		AnsFrame ansFrame=new AnsFrame(correctAnswer,imageName,b);
		ansFrame.setVisible(true);
	}
	public static void main(String[] args) {
		
					LogoQuiz frame = new LogoQuiz();
					frame.setVisible(true);
				}

	/**
	 * Create the frame.
	 */
	public LogoQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Logo Quiz");
		setBounds(110, 80, 1150, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Dominos","dominos.jpg",b1);
			}
		});
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b1.setIcon(new ImageIcon(LogoQuiz.class.getResource("dominos.jpg")));
		b1.setBounds(40, 11, 174, 169);
		contentPane.add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Audi","audi.jpg",b2);
			}
		});
		b2.setIcon(new ImageIcon(LogoQuiz.class.getResource("audi.jpg")));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b2.setBounds(253, 11, 174, 169);
		contentPane.add(b2);
		
		JButton b3 = new JButton("New button");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("McDonalds","mcd.jpg",b3);
			}
		});
		b3.setIcon(new ImageIcon(LogoQuiz.class.getResource("mcd.jpg")));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b3.setBounds(479, 11, 174, 169);
		contentPane.add(b3);
		
		JButton b4 = new JButton("New button");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("BMW","bmw.jpg",b4);
			}
		});
		b4.setIcon(new ImageIcon(LogoQuiz.class.getResource("bmw.jpg")));
		b4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b4.setBounds(703, 11, 174, 169);
		contentPane.add(b4);
		
		JButton b5 = new JButton("New button");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Pizza Hut","pizzahut.jpg",b5);
			}
		});
		b5.setIcon(new ImageIcon(LogoQuiz.class.getResource("pizzahut.jpg")));
		b5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b5.setBounds(929, 11, 174, 169);
		contentPane.add(b5);
		
		JButton b6 = new JButton("New button");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Mitsubishi","mitsubishi.jpg",b6);
			}
		});
		b6.setIcon(new ImageIcon(LogoQuiz.class.getResource("mitsubishi.jpg")));
		b6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b6.setBounds(40, 222, 174, 169);
		contentPane.add(b6);
		
		JButton b7 = new JButton("New button");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Intel","intel.jpg",b7);
			}
		});
		b7.setIcon(new ImageIcon(LogoQuiz.class.getResource("intel.jpg")));
		b7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b7.setBounds(253, 222, 174, 169);
		contentPane.add(b7);
		
		JButton b8 = new JButton("New button");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("DELL","dell.jpg",b8);
			}
		});
		b8.setIcon(new ImageIcon(LogoQuiz.class.getResource("dell.jpg")));
		b8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b8.setBounds(479, 222, 174, 169);
		contentPane.add(b8);
		
		JButton b9 = new JButton("New button");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("ITC Limited","itclimited.jpg",b9);
			}
		});
		b9.setIcon(new ImageIcon(LogoQuiz.class.getResource("itclimited.jpg")));
		b9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b9.setBounds(703, 222, 174, 169);
		contentPane.add(b9);
		
		JButton b10 = new JButton("New button");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askAnswer("Angry Birds","angrybirds.jpg",b10);
			}
		});
		b10.setIcon(new ImageIcon(LogoQuiz.class.getResource("angrybirds.jpg")));
		b10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		b10.setBounds(929, 222, 174, 169);
		contentPane.add(b10);
		
		btnNextLevel = new JButton("Next Level");
		btnNextLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(LogoQuiz.this,"COMING SOON");
			}
		});
		btnNextLevel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNextLevel.setBounds(153, 422, 816, 23);
		contentPane.add(btnNextLevel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((JOptionPane.showConfirmDialog(LogoQuiz.this,"Do you really want to quit")==0)){
				LogoQuiz.this.setVisible(false);
				LogoQuiz.this.dispose();
				}
			}
		});
		btnExit.setBounds(1035, 422, 89, 23);
		contentPane.add(btnExit);
		btnNextLevel.setVisible(false);
						
		}
	}
