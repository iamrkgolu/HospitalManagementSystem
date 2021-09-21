package com.org.hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class FeedBack extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedBack frame = new FeedBack();
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
	public FeedBack() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 1, 1168, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getLblNewLabel_1_3(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(545).addComponent(getBtnNewButton_1_1(),
						GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(420).addComponent(getTextField_1_1(),
						GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getTextArea_1(),
						GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(420).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(400).addComponent(getBtnNewButton_2(),
						GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getLblNewLabel_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(360).addComponent(getLblNewLabel_4(),
						GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getLblNewLabel_2_1(),
						GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getLblNewLabel_1_2_1(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(420).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel_3(),
						GroupLayout.PREFERRED_SIZE, 1134, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(165)
						.addComponent(getLblNewLabel_1_3(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(355).addComponent(getBtnNewButton_1_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(244).addComponent(getTextField_1_1(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(438).addComponent(getTextArea_1(),
						GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(165).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(561).addComponent(getBtnNewButton_2(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(244).addComponent(getLblNewLabel_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(115).addComponent(getLblNewLabel_4(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(388).addComponent(getLblNewLabel_2_1(),
						GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(306).addComponent(getLblNewLabel_1_2_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(306).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addComponent(getLblNewLabel_3(), GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Available Patient.jpg"));
		}
		return lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("FeedBack Section");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblNewLabel;
	}

	public JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JTextField getTextField_3() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Mobile");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
	}

	public JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Email");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_2;
	}

	public JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Write US  (Min 10 Words)");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2;
	}

	public JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	public JButton getBtnNewButton_2() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Thank you Your Feedback are Valuable");

					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\save-icon--1.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JButton getBtnNewButton_1_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Exit");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\exit.png"));
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnNewButton_1;
	}
}
