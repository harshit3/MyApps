import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class GameLauncher extends JWindow {

	private JPanel contentPane;
	JProgressBar progressBar;
	Timer timer;
	int currentProgress=0;
	static final int MAX_DELAY=100;
	static final int MAX_PROGRESS=100;
	private JLabel lblGameLoading;
	int color=1;

	
	private void animation(){
		ActionListener l=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(currentProgress);
				currentProgress=currentProgress+5;
				if(currentProgress>MAX_PROGRESS){
					timer.stop();
					GameLauncher.this.setVisible(false);
					GameLauncher.this.dispose();
					MainScreen mainScreen=new MainScreen();
					mainScreen.setVisible(true);
				}
				
			if(color>5){color=1;}
				switch(color){
				case 1:lblGameLoading.setForeground(Color.RED);
						break;
				case 2:lblGameLoading.setForeground(Color.GREEN);
						break;
				case 3:lblGameLoading.setForeground(Color.MAGENTA);
						break;
				case 4:lblGameLoading.setForeground(Color.BLUE);
						break;
				case 5:lblGameLoading.setForeground(Color.YELLOW);
						break;
				default:lblGameLoading.setForeground(Color.BLACK);
				
				}
				color++;
				
		}
			
		};
		timer=new Timer(MAX_DELAY,l);
		timer.start();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
					GameLauncher frame = new GameLauncher();
					frame.setVisible(true);
					frame.animation();
				} 

	/**
	 * Create the frame.
	 */
	public GameLauncher() {
		setBackground(Color.BLACK);
		setBounds(400, 200, 400, 391);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setBounds(0, 0, 400, 347);
		contentPane.add(label);
		label.setIcon(new ImageIcon(GameLauncher.class.getResource("main.gif")));
		
		progressBar = new JProgressBar();
		progressBar.setBorder(null);
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		progressBar.setForeground(Color.PINK);
		progressBar.setBounds(0, 377, 402, 14);
		contentPane.add(progressBar);
		
		lblGameLoading = new JLabel("Game Loading...");
		lblGameLoading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGameLoading.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameLoading.setForeground(Color.YELLOW);
		lblGameLoading.setBackground(Color.BLACK);
		lblGameLoading.setBounds(0, 347, 400, 30);
		contentPane.add(lblGameLoading);
		
	}
}
