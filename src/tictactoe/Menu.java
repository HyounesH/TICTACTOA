package tictactoe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 356);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton playerbtn = new JButton("Play VS Player");
		playerbtn.setIcon(new ImageIcon("./icons/player.png"));
		playerbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
            TicTacToe player=new TicTacToe();
            player.setVisible(true);
            setVisible(false);
			}
		});
		playerbtn.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 16));
		playerbtn.setBounds(127, 69, 209, 42);
		contentPane.add(playerbtn);
		
		JButton computerbtn = new JButton("Play VS Computer");
		computerbtn.setIcon(new ImageIcon("./icons/cmptr.png"));
		computerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgainstComputer computer=new AgainstComputer();
				computer.setVisible(true);
				setVisible(false);
			}
		});
		computerbtn.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 16));
		computerbtn.setBounds(127, 143, 209, 42);
		contentPane.add(computerbtn);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon("./icons/exit.png"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer=JOptionPane.showConfirmDialog(null, "Do You Want Really To Exit This Window ??","Exit Window",JOptionPane.YES_NO_OPTION);
				if(answer==JOptionPane.YES_OPTION){
					setVisible(false);
				}
			}
		});
		btnExit.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 16));
		btnExit.setBounds(127, 222, 209, 42);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 444, 327);
		label.setIcon(new ImageIcon("./tictactoebg/MenuBg.png"));
		contentPane.add(label);
	}

}
