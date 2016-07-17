
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	private void launchTicTacToe(){
		TicTacToe  tictac=new TicTacToe();
		tictac.setVisible(true);
	}
	
	private void launchLogoQuiz(){
		LogoQuiz logoQuiz=new LogoQuiz();
		logoQuiz.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450,300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launchTicTacToe();
			}
		});
		mnGame.add(mntmTictactoe);
		
		JMenuItem mntmLogoQuiz = new JMenuItem("Logo Quiz");
		mntmLogoQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launchLogoQuiz();
			}
		});
		mnGame.add(mntmLogoQuiz);
		
		JMenuItem mntmKbc = new JMenuItem("KBC");
		mnGame.add(mntmKbc);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen.this.setVisible(false);
				MainScreen.this.dispose();
			}
		});
		mnGame.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 434, 240);
		contentPane.add(label);
		label.setIcon(new ImageIcon(MainScreen.class.getResource("home.gif")));
	}
}
