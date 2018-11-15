package tictactoe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class How_To_Play extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public How_To_Play() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 484);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnTicTacToe = new JTextPane();
		txtpnTicTacToe.setEditable(false);
		txtpnTicTacToe.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		txtpnTicTacToe.setText("Tic Tac Toe is a simple game which, if played optimally by both players, will always result in a tie. However, many players (especially younger children) still enjoy it, and Tic Tac Toe can be made significantly more complex by increasing the size of the board.");
		txtpnTicTacToe.setBounds(10, 67, 302, 96);
		contentPane.add(txtpnTicTacToe);
		
		JLabel tic = new JLabel("TIC");
		tic.setForeground(new Color(229,38,128));
		tic.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 24));
		tic.setBounds(152, 21, 59, 25);
		contentPane.add(tic);
		
		JLabel tac = new JLabel("TAC");
		tac.setForeground(new Color(25,195,69));
		tac.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 24));
		tac.setBounds(199, 21, 59, 25);
		contentPane.add(tac);
		
		JLabel toe = new JLabel("TOE");
		toe.setForeground(new Color(26,228,188));
		toe.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 24));
		toe.setBounds(257, 21, 59, 25);
		contentPane.add(toe);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 15));
		lblPlayers.setBounds(10, 163, 73, 25);
		contentPane.add(lblPlayers);
		
		JTextPane txtpnTwoPlayers = new JTextPane();
		txtpnTwoPlayers.setEditable(false);
		txtpnTwoPlayers.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		txtpnTwoPlayers.setText("Two Players\r\nPlayerX  VS PlayerO  or PlayerX  Vs Computer\r\n");
		txtpnTwoPlayers.setBounds(10, 182, 285, 44);
		contentPane.add(txtpnTwoPlayers);
		
		JLabel lblGoal = new JLabel("Goal");
		lblGoal.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 15));
		lblGoal.setBounds(10, 225, 73, 25);
		contentPane.add(lblGoal);
		
		JTextPane txtpnHeGoalOf = new JTextPane();
		txtpnHeGoalOf.setEditable(false);
		txtpnHeGoalOf.setText("he goal of Tic Tac Toe is to be the first player to get three in a row on a 3x3 grid");
		txtpnHeGoalOf.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		txtpnHeGoalOf.setBounds(10, 247, 285, 44);
		contentPane.add(txtpnHeGoalOf);
		
		JLabel lblPlayingTicTac = new JLabel("Playing Tic Tac Toe");
		lblPlayingTicTac.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 15));
		lblPlayingTicTac.setBounds(10, 292, 214, 25);
		contentPane.add(lblPlayingTicTac);
		
		JTextPane txtpnXAlwaysGoes = new JTextPane();
		txtpnXAlwaysGoes.setEditable(false);
		txtpnXAlwaysGoes.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		txtpnXAlwaysGoes.setText("X always goes first.\r\n\r\nPlayers alternate placing Xs and Os on the board until either (a) one player has three in a row, horizontally, vertically or diagonally; or (b) all nine squares are filled.\r\n\r\nIf a player is able to draw three Xs or three Os in a row, that player wins.\r\n\r\nIf all nine squares are filled and neither player has three in a row, the game is over.");
		txtpnXAlwaysGoes.setBounds(10, 317, 285, 104);
		contentPane.add(txtpnXAlwaysGoes);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("./tictactoeIcons/tictactoe04.png"));
		label.setBounds(322, 67, 156, 104);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("./tictactoeIcons/tictactoe02.png"));
		label_1.setBounds(322, 198, 156, 104);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("./tictactoeIcons/tictactoe03.png"));
		label_2.setBounds(322, 340, 156, 104);
		contentPane.add(label_2);
	}
}
