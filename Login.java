package com.org.hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3549645700043146844L;
	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblHospitalLoginPage;
	private JLabel lblPleaseSelectYour;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnSignup;
	private JButton btnForgetpassword;
	private JButton btnForgetuserid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1352, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(364).addComponent(
								getLblHospitalLoginPage(), GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(194).addComponent(
								getLblPleaseSelectYour(), GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(255).addComponent(getLblNewLabel(),
								GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(255)
								.addComponent(getLblPassword(), GroupLayout.PREFERRED_SIZE, 169,
										GroupLayout.PREFERRED_SIZE)
								.addGap(75).addComponent(getPasswordField(), GroupLayout.PREFERRED_SIZE, 305,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(500).addComponent(getLblNewLabel_1(),
								GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(190)
								.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 100,
										GroupLayout.PREFERRED_SIZE)
								.addGap(32)
								.addComponent(getBtnSignup(), GroupLayout.PREFERRED_SIZE, 111,
										GroupLayout.PREFERRED_SIZE)
								.addGap(36).addComponent(getBtnForgetpassword(), GroupLayout.PREFERRED_SIZE, 170,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(194).addComponent(getComboBox(),
								GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(655).addComponent(getBtnForgetuserid(),
								GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(499).addComponent(getTextField(),
								GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addComponent(getLabel(), GroupLayout.PREFERRED_SIZE, 1323, GroupLayout.PREFERRED_SIZE))
				.addGap(15)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(510).addComponent(getBtnForgetuserid(),
						GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
				.addComponent(getLabel(), GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(162)
										.addComponent(getLblHospitalLoginPage(), GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(24)
										.addComponent(getLblPleaseSelectYour(), GroupLayout.PREFERRED_SIZE, 26,
												GroupLayout.PREFERRED_SIZE)
										.addGap(80)
										.addComponent(getLblNewLabel(), GroupLayout.PREFERRED_SIZE, 30,
												GroupLayout.PREFERRED_SIZE)
										.addGap(45)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(6).addComponent(
														getLblPassword(), GroupLayout.PREFERRED_SIZE, 30,
														GroupLayout.PREFERRED_SIZE))
												.addComponent(getPasswordField(), GroupLayout.PREFERRED_SIZE, 36,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(265).addComponent(getComboBox(),
										GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
								.addGap(24).addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(341).addComponent(getTextField(),
								GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
						.addGap(21)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getBtnSignup(), GroupLayout.PREFERRED_SIZE, 35,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 35,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getBtnForgetpassword(), GroupLayout.PREFERRED_SIZE, 35,
										GroupLayout.PREFERRED_SIZE))
						.addGap(165)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Login.jpg"));
		}
		return label;
	}

	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setForeground(Color.RED);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JLabel getLblHospitalLoginPage() {
		if (lblHospitalLoginPage == null) {
			lblHospitalLoginPage = new JLabel("Hospital Login Page");
			lblHospitalLoginPage.setForeground(new Color(250, 250, 210));
			lblHospitalLoginPage.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblHospitalLoginPage;
	}

	public JLabel getLblPleaseSelectYour() {
		if (lblPleaseSelectYour == null) {
			lblPleaseSelectYour = new JLabel("Please Select Your Type That you Belongs ?");
			lblPleaseSelectYour.setForeground(new Color(250, 240, 230));
			lblPleaseSelectYour.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblPleaseSelectYour;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Doctor", "Patient" }));
			comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return comboBox;
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Enter UserId");
			lblNewLabel.setForeground(new Color(250, 235, 215));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblNewLabel;
	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setForeground(new Color(250, 235, 215));
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblPassword;
	}

	public JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return passwordField;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\login.png"));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhHospital",
								"root", "password");
						Statement st = con.createStatement();
						String query = "Select * from signup where Email='" + textField.getText() + "' and Mobile='"
								+ passwordField.getText().toString() + "'";
						ResultSet rt = st.executeQuery(query);
						if (rt.next()) {
							JOptionPane.showMessageDialog(null, "Login");
							setVisible(false);
							new Home().setVisible(true);
						} else {
							if (textField.getText().trim().isEmpty() && passwordField.getText().trim().isEmpty()) {
								lblNewLabel_1.setText("Field(s) are Empty");

							} else if (textField.getText().trim().isEmpty()) {
								lblNewLabel_1.setText(" UserName Field are Empty");
							} else {
								lblNewLabel_1.setText(" Password Field are Empty");
							}

							JOptionPane.showMessageDialog(null, "Login Failed");
							lblNewLabel_1.setText(" Invalid UserName & Password");
						}
					} catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
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

	public JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("SignUp");
			btnSignup.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\save-icon--1.png"));
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					SignUp signUp = new SignUp();
					signUp.setVisible(true);
				}
			});
			btnSignup.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnSignup;
	}

	public JButton getBtnForgetpassword() {
		if (btnForgetpassword == null) {
			btnForgetpassword = new JButton("ForgetPassword");
			btnForgetpassword.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnForgetpassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					ForgetPassword forgetPassword = new ForgetPassword();
					forgetPassword.setVisible(true);
				}
			});
			btnForgetpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnForgetpassword;
	}

	public JButton getBtnForgetuserid() {
		if (btnForgetuserid == null) {
			btnForgetuserid = new JButton("ForgetUserId");
			btnForgetuserid.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnForgetuserid.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					ForgetUserId forgetUserId = new ForgetUserId();
					forgetUserId.setVisible(true);
				}
			});
			btnForgetuserid.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnForgetuserid;
	}
}
