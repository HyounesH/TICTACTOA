package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class BackgoundChooser extends JFrame {

	private JPanel contentPane;
	private JComboBox BgcomboBox;
    private JButton okbtn;
    private JLabel bgLabel;
    private static String Background;
    private static String rightF;


	/**
	 * Create the frame.
	 */
	public BackgoundChooser(String Ftarget) {
		this.rightF=Ftarget;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 444, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblChooseBackground = new JLabel("Choose Background");
		lblChooseBackground.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 15));
		lblChooseBackground.setBounds(10, 11, 172, 17);
		panel.add(lblChooseBackground);
		
		BgcomboBox = new JComboBox();
		BgcomboBox.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 13));
		BgcomboBox.setModel(new DefaultComboBoxModel(new String[] {"default", "geometry_dash", "green_water", "liquide_splash", "red_ink", "watermelon_slice"}));
		BgcomboBox.setBounds(179, 8, 172, 20);
		BgcomboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (BgcomboBox.getSelectedItem().toString()) {
				
				case "geometry_dash":
					bgLabel.setIcon(new ImageIcon("./background_images/geometry_dash.png"));
					Background= "./tictactoebg/geometry_dash.png";
					break;
				case "green_water":
					bgLabel.setIcon(new ImageIcon("./background_images/green_water.png"));
					Background= "./tictactoebg/green_water.png";
					break;
				case "liquide_splash":
					bgLabel.setIcon(new ImageIcon("./background_images/liquide_splash.png"));
					Background= "./tictactoebg/liquide_splashe.png";
					break;
				case "red_ink":
					bgLabel.setIcon(new ImageIcon("./background_images/red_ink.png"));
					Background= "./tictactoebg/red_ink.png";
					break;
				case "watermelon_slice":
					bgLabel.setIcon(new ImageIcon("./background_images/watermelon_slice.png"));
					Background= "./tictactoebg/watermelon_slice.png";
					break;

		   
		     	default:
					bgLabel.setIcon(new ImageIcon("./background_images/defaultBg.png"));
					Background= "./tictactoebg/defaultBg.png";
					break;
				}
				
			}
		});
		panel.add(BgcomboBox);
		
		okbtn = new JButton("OK");
		okbtn.setBackground(new Color(205, 92, 92));
		okbtn.setFont(new Font("Tekton Pro Cond", Font.BOLD | Font.ITALIC, 14));
		okbtn.setBounds(361, 8, 57, 22);
		okbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rightF.equals("player")){
					TicTacToe tic=new TicTacToe();
					tic.setVisible(true);
					tic.setBackground(Background);
					setVisible(false);
				}
				
				if(rightF.equals("computer")){
					AgainstComputer cmp=new AgainstComputer();
					cmp.setVisible(true);
					cmp.setBackground(Background);
					setVisible(false);
				}

				
			}
		});
		panel.add(okbtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(0, 35, 444, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		bgLabel = new JLabel("");
		bgLabel.setBounds(68, 27, 300, 180);
		bgLabel.setIcon(new ImageIcon("./background_images/defaultBg.png"));
		panel_1.add(bgLabel);
		
	}
}
