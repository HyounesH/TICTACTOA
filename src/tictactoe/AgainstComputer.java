package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AgainstComputer extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton pion1,pion2,pion3,pion4,pion5,pion6,pion7,pion8,pion9;
	private JButton[] pions=new JButton[9];
	private JTextField playerXfield;
	private JTextField playerOfield;
	private JLabel playerOlabel;
	private JLabel playerXlabel;
	private JLabel turnX,turnY;
	private int CurrentPlayer=0;
	private String[] Players=new String[2];
	private boolean IsGameOver=false;
	private JLabel GameStatus;
	private JLabel tictactoeAnimation;
	private Thread t;
	private String[] XOstrings={"X","O"};
	private JLabel playerlabel;
	private static int player1Score=0,Player2Score=0;
	private JLabel scorePlayerX,scorePlayerY;
    private JLabel bg;
	private TicTacToe tic=new TicTacToe();

		/**
	 * Create the frame.
	 */
	public AgainstComputer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350,150, 753, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Tictactoepanel = new JPanel();
		Tictactoepanel.setBackground(Color.WHITE);
		Tictactoepanel.setBounds(0, 88, 502, 380);
		contentPane.add(Tictactoepanel);
		GridLayout grids = new GridLayout(3,3);
		Tictactoepanel.setLayout(grids);
		
	    pion1 = new JButton("");
	    pion1.setForeground(new Color(30, 144, 255));
	    pion1.setFont(new Font("Tekton Pro", Font.BOLD, 99));
	    pion1.setToolTipText("");
		Tictactoepanel.add(pion1);
		
		pion2 = new JButton("");
		pion2.setForeground(new Color(30, 144, 255));
		pion2.setFont(new Font("Tekton Pro", Font.BOLD, 99));
		pion2.setToolTipText("");
		Tictactoepanel.add(pion2);
		
		pion3 = new JButton("");
		pion3.setForeground(new Color(30, 144, 255));
		pion3.setFont(new Font("Tekton Pro", Font.BOLD, 99));
		pion3.setToolTipText("");
		Tictactoepanel.add(pion3);
		
		pion4 = new JButton("");
		pion4.setForeground(new Color(30, 144, 255));
		pion4.setFont(new Font("Tekton Pro", Font.BOLD, 99));
		pion4.setToolTipText("");
		Tictactoepanel.add(pion4);
		
		pion5 = new JButton("");
		pion5.setForeground(new Color(30, 144, 255));
		pion5.setFont(new Font("Tekton Pro", Font.BOLD, 99));
		pion5.setToolTipText("");
		Tictactoepanel.add(pion5);
		
	    pion6 = new JButton("");
	    pion6.setForeground(new Color(30, 144, 255));
	    pion6.setFont(new Font("Tekton Pro", Font.BOLD, 99));
	    pion6.setToolTipText("");
		Tictactoepanel.add(pion6);
		
		pion7 = new JButton("");
		pion7.setForeground(new Color(30, 144, 255));
		pion7.setFont(new Font("Tekton Pro", Font.BOLD, 99));
		pion7.setToolTipText("");
		Tictactoepanel.add(pion7);
		
        pion8 = new JButton("");
        pion8.setForeground(new Color(30, 144, 255));
        pion8.setFont(new Font("Tekton Pro", Font.BOLD, 99));
        pion8.setToolTipText("");
		Tictactoepanel.add(pion8);
		
	    pion9 = new JButton("");
	    pion9.setForeground(new Color(30, 144, 255));
	    pion9.setFont(new Font("Tekton Pro", Font.BOLD, 99));
	    pion9.setToolTipText("");
		Tictactoepanel.add(pion9);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 747, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		menuBar.add(mnFile);
		
		JMenuItem mntmReplay = new JMenuItem("REPLAY");
		mntmReplay.setIcon(new ImageIcon("./icons/replay.png"));
		mntmReplay.setFont(new Font("Tekton Pro", Font.ITALIC, 13));
		mntmReplay.addActionListener(replayAction);
		mnFile.add(mntmReplay);
		
		JMenuItem mntmClose = new JMenuItem("CLOSE");
		mntmClose.setIcon(new ImageIcon("./icons/close.png"));
		mntmClose.setFont(new Font("Tekton Pro", Font.ITALIC, 13));
		mntmClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int inswer=JOptionPane.showConfirmDialog(null,"DO YOU WANT REALLY TO EXIT THIS WINDOW ?","Exit Window",JOptionPane.YES_NO_CANCEL_OPTION);
			if(inswer==JOptionPane.YES_OPTION){
				setVisible(false);
			}
				
			}
		});
		
		JMenuItem mntmMenu = new JMenuItem("Menu");
		mntmMenu.setIcon(new ImageIcon("./icons/menu.png"));
		mntmMenu.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		mntmMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu menu=new Menu();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		mnFile.add(mntmMenu);
		mnFile.add(mntmClose);
		
		JMenu mnEdit = new JMenu("View");
		mnEdit.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		menuBar.add(mnEdit);
		
		JMenuItem mntmBackground = new JMenuItem("Background");
		mntmBackground.setIcon(new ImageIcon("./icons/background.png"));
		mntmBackground.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		mntmBackground.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BackgoundChooser bg=new BackgoundChooser("computer");
				bg.setVisible(true);
				setVisible(false);
				
			}
		});
		mnEdit.add(mntmBackground);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		menuBar.add(mnAbout);
		
		JMenuItem mntmHowToPlay = new JMenuItem("HOW TO PLAY ?");
		mntmHowToPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
            How_To_Play rules=new How_To_Play();
            rules.setVisible(true);
			}
		});
		mntmHowToPlay.setIcon(new ImageIcon("./icons/help.png"));
		mntmHowToPlay.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 13));
		mnAbout.add(mntmHowToPlay);
		
		playerXlabel = new JLabel("Player X");
		playerXlabel.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 15));
		playerXlabel.setBounds(52, 32, 78, 14);
		contentPane.add(playerXlabel);
		
		playerXfield = new JTextField();
		playerXfield.setBounds(133, 28, 122, 20);
		contentPane.add(playerXfield);
		playerXfield.setColumns(15);
		
		playerOfield = new JTextField("Computer");
		playerOfield.setForeground(new Color(0, 191, 255));
		playerOfield.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 12));
		playerOfield.setColumns(15);
		playerOfield.setBounds(133, 57, 122, 20);
		playerOfield.setEditable(false);
		playerOfield.setEnabled(true);
		contentPane.add(playerOfield);
		
	    playerOlabel = new JLabel("Player O");
		playerOlabel.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 15));
		playerOlabel.setBounds(52, 61, 78, 14);
		contentPane.add(playerOlabel);
		
		JLabel iconPlayerX = new JLabel("");
		iconPlayerX.setIcon(new ImageIcon("./icons/player1.png"));
		iconPlayerX.setBounds(8, 25, 25, 23);
		contentPane.add(iconPlayerX);
		
		JLabel iconPlayerO = new JLabel("");
		iconPlayerO.setIcon(new ImageIcon("./icons/computer.png"));
		iconPlayerO.setBounds(8, 54, 25, 23);
		contentPane.add(iconPlayerO);
		
		turnX = new JLabel("");
		turnX.setBounds(278, 32, 60, 14);
		contentPane.add(turnX);
		
		turnY = new JLabel("");
		turnY.setHorizontalAlignment(SwingConstants.CENTER);
		turnY.setBounds(278, 60, 60, 14);
		contentPane.add(turnY);
		
		GameStatus = new JLabel("");
		GameStatus.setHorizontalAlignment(SwingConstants.CENTER);
		GameStatus.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 20));
		GameStatus.setForeground(new Color(75, 0, 130));
		GameStatus.setBounds(524, 300, 200, 60);
		contentPane.add(GameStatus);
		
		tictactoeAnimation = new JLabel("");
		tictactoeAnimation.setHorizontalAlignment(SwingConstants.CENTER);
		tictactoeAnimation.setBounds(524, 90, 200, 126);
		tictactoeAnimation.setIcon(new ImageIcon("./tictactoeIcons/tictactoe1.png"));
		contentPane.add(tictactoeAnimation);
		
		playerlabel = new JLabel();
		playerlabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerlabel.setForeground(new Color(139, 0, 0));
		playerlabel.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 29));
		playerlabel.setBounds(524, 245, 200, 60);
		contentPane.add(playerlabel);
		JButton replaybtn = new JButton("REPLAY");
		replaybtn.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				replaybtn.setBackground(Color.BLACK);
				replaybtn.setForeground(Color.WHITE);
			}
		});
		replaybtn.addActionListener(replayAction);
		replaybtn.setBackground(new Color(173, 216, 230));
		replaybtn.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 17));
		replaybtn.setBounds(524, 380, 200, 60);
		contentPane.add(replaybtn);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 18));
		lblScore.setBounds(580, 32, 78, 29);
		contentPane.add(lblScore);
		
		JLabel playerXScoreIcone = new JLabel("");
		playerXScoreIcone.setBounds(535, 62, 25, 23);
		playerXScoreIcone.setIcon(new ImageIcon("./icons/player1.png"));
		contentPane.add(playerXScoreIcone);
		
		JLabel playerOScoreIcon = new JLabel("");
		playerOScoreIcon.setBounds(712, 62, 25, 23);
		playerOScoreIcon.setIcon(new ImageIcon("./icons/computer.png"));
		contentPane.add(playerOScoreIcon);
		
		scorePlayerX = new JLabel("0");
		scorePlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		scorePlayerX.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 14));
		scorePlayerX.setBounds(567, 62, 25, 23);
		contentPane.add(scorePlayerX);
		
		scorePlayerY= new JLabel("0");
		scorePlayerY.setHorizontalAlignment(SwingConstants.CENTER);
		scorePlayerY.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 14));
		scorePlayerY.setBounds(680, 62, 25, 23);
		contentPane.add(scorePlayerY);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setForeground(new Color(64, 224, 208));
		lblVs.setHorizontalAlignment(SwingConstants.CENTER);
		lblVs.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 14));
		lblVs.setBounds(616, 62, 35, 23);
		contentPane.add(lblVs);
		
		bg = new JLabel("New label");
		bg.setBounds(0, 0, 753, 497);
		setBackground("./tictactoebg/defaultBg.png");
		contentPane.add(bg);
		initialize();
		for(JButton pion:pions){
			pion.addActionListener(this);
		}
		
	}
	ActionListener replayAction=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			IsGameOver=false;
		     CurrentPlayer=0;
		     playerlabel.setText(Players[CurrentPlayer].toUpperCase());
		     GameStatus.setText("IS YOUR TURN");
		     for(JButton pion:pions){
		    	 pion.setText("");
		         pion.setForeground(new Color(30, 144, 255));

		     }
		}
	};
	
	private void initialize(){
		pions[0]=pion1;
		pions[1]=pion2;
		pions[2]=pion3;
		pions[3]=pion4;
		pions[4]=pion5;
		pions[5]=pion6;
		pions[6]=pion7;
		pions[7]=pion8;
		pions[8]=pion9;
	
		new TicTacToe().bgMusic();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
JButton pionTarget= (JButton)e.getSource();
		
		getPlayersName();
   
    if(IsGameOver) return;
    if(! tic.pionValid(pionTarget)){
    	GameStatus.setText("Pion Not Valid !");
    	setAnimation();
    }
    else{
    	
    	tic.setSymbol(pionTarget,XOstrings[CurrentPlayer]);
    	
    	IsGameOver=WinnerExists();
    	
        if(IsGameOver){
        	playerlabel.setText(Players[CurrentPlayer].toUpperCase());
        	GameStatus.setText( " IS WIN !");
        	return ;
        }
        if(bourdIsFull()){
        	playerlabel.setText("");
        	GameStatus.setText("Game Over");
        	IsGameOver=true;
        	return;
        }
        
        CurrentPlayer=CurrentPlayer^1;
        playerlabel.setText(Players[CurrentPlayer].toUpperCase());
        GameStatus.setText(" IS YOUR TURN !");
        
         getPionBlank(XOstrings[CurrentPlayer]);
       IsGameOver=WinnerExists();
    	
        if(IsGameOver){
        	playerlabel.setText(Players[CurrentPlayer].toUpperCase());
        	GameStatus.setText( " IS WIN !");
        	return ;
        }
        if(bourdIsFull()){
        	playerlabel.setText("");
        	GameStatus.setText("Game Over");
        	IsGameOver=true;
        	return;
        }    
        
        CurrentPlayer=CurrentPlayer^1;
        playerlabel.setText(Players[CurrentPlayer].toUpperCase());
        GameStatus.setText(" IS YOUR TURN !");        
    }
    
	}
	public boolean bourdIsFull() {
		for(JButton pion:pions){
			if(tic.pionValid(pion)){
				return false;
			}
		}
		return true;
	}
	public boolean WinnerExists() {
		if(pion1.getText()==XOstrings[CurrentPlayer] &&
				pion2.getText()==XOstrings[CurrentPlayer] &&
				pion3.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion1, pion2, pion3);
			score(XOstrings[CurrentPlayer]);
		
			
			return true;
		}
		if(pion4.getText()==XOstrings[CurrentPlayer] &&
				pion5.getText()==XOstrings[CurrentPlayer] &&
				pion6.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion4, pion5, pion6);
			score(XOstrings[CurrentPlayer]);
			
			return true;
		}
		if(pion7.getText()==XOstrings[CurrentPlayer] &&
				pion8.getText()==XOstrings[CurrentPlayer] &&
				pion9.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion7, pion8, pion9);
			score(XOstrings[CurrentPlayer]);
			
			return true;
		}
		
		if(pion1.getText()==XOstrings[CurrentPlayer] &&
				pion5.getText()==XOstrings[CurrentPlayer] &&
				pion9.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion1, pion5, pion9);
			score(XOstrings[CurrentPlayer]);
			return true;
		}
		if(pion3.getText()==XOstrings[CurrentPlayer] &&
				pion5.getText()==XOstrings[CurrentPlayer] &&
				pion7.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion3, pion5, pion7);
			score(XOstrings[CurrentPlayer]);
			return true;
		}
		if(pion1.getText()==XOstrings[CurrentPlayer] &&
				pion4.getText()==XOstrings[CurrentPlayer] &&
				pion7.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion1, pion4, pion7);
			score(XOstrings[CurrentPlayer]);
			return true;
		}
		if(pion2.getText()==XOstrings[CurrentPlayer] &&
				pion5.getText()==XOstrings[CurrentPlayer] &&
				pion8.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion2, pion5, pion8);
			score(XOstrings[CurrentPlayer]);
			return true;
		}
		if(pion3.getText()==XOstrings[CurrentPlayer] &&
				pion6.getText()==XOstrings[CurrentPlayer] &&
				pion9.getText()==XOstrings[CurrentPlayer]){
			tic.setWinnerColor(pion3, pion6, pion9);
			score(XOstrings[CurrentPlayer]);
			return true;
		}
			return false;
		}
	private void getPlayersName(){
		String Player1,Player2;
		if(playerXfield.getText().length()==0){
			Player1=playerXlabel.getText();
		}
		else{
			Player1=playerXfield.getText();
		}
		Players[0]=Player1;
		if(playerOfield.getText().length()==0){
			Player2=playerOlabel.getText();
		}
		else{
			Player2=playerOfield.getText();
		}
		Players[1]=Player2;
	}
	public void setAnimation(){
		t=new Thread(){

			@Override
			public void run() {
				try {
					sleep(100);
					tictactoeAnimation.setIcon(new ImageIcon("./tictactoeIcons/tictactoe2.png"));
					sleep(100);
					tictactoeAnimation.setIcon(new ImageIcon("./tictactoeIcons/tictactoe3.png"));
					sleep(100);
					tictactoeAnimation.setIcon(new ImageIcon("./tictactoeIcons/tictactoe1.png"));
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		};
		t.start();
		Thread t=new Thread(){

			@Override
			public void run() {
				try{
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File("./audio/T_note.wav"));
				Clip clip=AudioSystem.getClip();
				clip.open(audio);
			    clip.start();
			   
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		
		};
		t.start();
	}
	public void score(String player){
		if(player.toString().equals("X")){
			player1Score++;
			scorePlayerX.setText(String.valueOf(player1Score));
			
		}
		if(player.toString().equals("O")){
			Player2Score++;
			scorePlayerY.setText(String.valueOf(Player2Score));
			
		}
	}
	public void waitForComputerTurn(){
		Thread t=new Thread(){

			@Override
			public void run() {
				try {
					sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		};
		t.start();
	}
	
	public void getPionBlank(String symbol){
		Random rand=new Random();
		int i=0;
		i=rand.nextInt(8);
		boolean notFinded=true;
		while(notFinded){
			if(pions[i].getText().toString().length()==0){
				pions[i].setText(symbol);
				notFinded=false;
			}
			i=rand.nextInt(8);	
		}
		
	}
	public void setBackground(String url){
		bg.setIcon(new ImageIcon(url));
	}
	}

