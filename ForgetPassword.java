package com.org.hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ForgetPassword extends JFrame {

	private JPanel contentPane;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblGettingPasswordbyDetails;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JSeparator separator_1;
	private JLabel lblNewLabel_2_1;
	private JTextField textField_3;
	private JButton btnLoginPage;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPassword frame = new ForgetPassword();
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
	public ForgetPassword() {
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1266, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(305).addComponent(getLblNewLabel_1_3(),
						GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(305)
						.addComponent(getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 165,
								GroupLayout.PREFERRED_SIZE)
						.addGap(45)
						.addComponent(getTextField_1_1(), GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(305).addComponent(getLblNewLabel_1_2_1(),
						GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(510).addComponent(getBtnNewButton_1(),
								GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
						.addComponent(getSeparator(), GroupLayout.PREFERRED_SIZE, 903, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(140).addComponent(getSeparator_1_1(),
						GroupLayout.PREFERRED_SIZE, 880, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(305)
						.addComponent(getLblNewLabel_2_1_1(), GroupLayout.PREFERRED_SIZE, 175,
								GroupLayout.PREFERRED_SIZE)
						.addGap(45)
						.addComponent(getTextField_3_1(), GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(402).addComponent(getBtnLoginPage_1(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(515).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(515).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(514).addComponent(getLblNewLabel_2_1(),
						GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(615).addComponent(getBtnBack_1(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(429).addComponent(
						getLblGettingPasswordbyDetails_1(), GroupLayout.PREFERRED_SIZE, 356,
						GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 1225, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(154)
				.addComponent(getLblNewLabel_1_3(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addGap(37)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(1).addComponent(getLblNewLabel_1_1_1(),
								GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(getTextField_1_1(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGap(44)
				.addComponent(getLblNewLabel_1_2_1(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addGap(73)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getBtnNewButton_1(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(9).addComponent(getSeparator(),
								GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)))
				.addGap(43)
				.addComponent(getSeparator_1_1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(15)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(getLblNewLabel_2_1_1(),
								GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addComponent(getTextField_3_1(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGap(40)
				.addComponent(getBtnLoginPage_1(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(307).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(154).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(366).addComponent(getLblNewLabel_2_1(),
						GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(592).addComponent(getBtnBack_1(),
						GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(99).addComponent(
						getLblGettingPasswordbyDetails_1(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 685, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Patient Detail.png"));
		}
		return lblNewLabel;
	}

	public JLabel getLblGettingPasswordbyDetails_1() {
		if (lblGettingPasswordbyDetails == null) {
			lblGettingPasswordbyDetails = new JLabel("Getting PasswordBy Details");
			lblGettingPasswordbyDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblGettingPasswordbyDetails;
	}

	public JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Mobile");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JTextField getTextField_4() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}

	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
	}

	public JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
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
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_2;
	}

	public JButton getBtnNewButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Get Password");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						String sql = ("SELECT Name, Mobile, Email FROM singhhospital.signup WHERE Mobile=?");
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, textField.getText());

						ResultSet rs = pst.executeQuery();
						if (rs.next() == true) {
							JOptionPane.showMessageDialog(null, "Record Found");
							textField_1.setText(rs.getString("Name"));
							textField_2.setText(rs.getString("Email"));
							textField_3.setText(rs.getString("Mobile"));
						} else {
							JOptionPane.showMessageDialog(null, "Record Not Found");
						}

					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JSeparator getSeparator_1_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
		}
		return separator_1;
	}

	public JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Hello Your Password Is");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2_1;
	}

	public JTextField getTextField_3_1() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JButton getBtnLoginPage_1() {
		if (btnLoginPage == null) {
			btnLoginPage = new JButton("Login Page");
			btnLoginPage.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\login.png"));
			btnLoginPage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Login login = new Login();
					login.setVisible(true);
				}
			});
			btnLoginPage.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnLoginPage;
	}

	public JButton getBtnBack_1() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					setVisible(false);
					Login login = new Login();
					login.setVisible(true);
				}
			});
			btnBack.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\back.png"));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnBack;
	}
}
