package com.org.hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblHospitalRegistrationPage;
	private JLabel lblPleaseSelectYour;
	private JComboBox comboBox;
	private JLabel lblName;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblMobileNumberIs;
	private JLabel lblMobile;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	private JLabel lblEmail;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblGender;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JButton btnNewButton;
	private JButton btnSignup;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1306, 764);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(635).addComponent(getBtnNewButton_1())
								.addGap(87).addComponent(getBtnSignup_1(), GroupLayout.PREFERRED_SIZE, 100,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(630).addComponent(
								getLblMobileNumberIs_1(), GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(382).addComponent(
								getRdbtnNewRadioButton_1(), GroupLayout.PREFERRED_SIZE, 103,
								GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(710).addComponent(getRdbtnOther_1(),
								GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(380).addComponent(getLblEmail_1(),
								GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(380).addComponent(getLblName_1(),
								GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(940).addComponent(
								getLblNewLabel_1_2_1(), GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(489).addComponent(
								getLblHospitalRegistrationPage_1(), GroupLayout.PREFERRED_SIZE, 330,
								GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(624).addComponent(getTextField_1_1(),
								GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(380).addComponent(getLblGender_1(),
								GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(630).addComponent(getLblNewLabel_2(),
								GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(624).addComponent(getTextField_3(),
								GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(319).addComponent(
								getLblPleaseSelectYour_1(), GroupLayout.PREFERRED_SIZE, 610,
								GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(624).addComponent(getTextField_2_1(),
								GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(380).addComponent(getLblMobile_1(),
								GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(553).addComponent(getRdbtnFemale_1(),
								GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(940).addComponent(
								getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(940).addComponent(getLblNewLabel_1_3(),
								GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
								GroupLayout.PREFERRED_SIZE, 1270, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(319).addComponent(getComboBox_1(),
								GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)))
				.addGap(7)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(474).addComponent(
								getRdbtnNewRadioButton_1(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(401).addComponent(getLblEmail_1(),
								GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(200).addComponent(getLblName_1(),
								GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(401).addComponent(
								getLblNewLabel_1_2_1(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(438).addComponent(getLblGender_1(),
								GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(316).addComponent(getLblMobile_1(),
								GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(316).addComponent(
								getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(214).addComponent(getLblNewLabel_1_3(),
								GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
								GroupLayout.PREFERRED_SIZE, 705, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(275).addComponent(
										getLblMobileNumberIs_1(), GroupLayout.PREFERRED_SIZE, 29,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(475).addComponent(
										getRdbtnOther_1(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(30).addComponent(
										getLblHospitalRegistrationPage_1(), GroupLayout.PREFERRED_SIZE, 40,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(311).addComponent(
										getTextField_1_1(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(360).addComponent(
										getLblNewLabel_2(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(209).addComponent(
										getTextField_3(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(94).addComponent(
										getLblPleaseSelectYour_1(), GroupLayout.PREFERRED_SIZE, 26,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(399).addComponent(
										getTextField_2_1(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(474).addComponent(
										getRdbtnFemale_1(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(133).addComponent(
										getComboBox_1(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
								.addGap(54).addComponent(getBtnNewButton_1(), GroupLayout.PREFERRED_SIZE, 45,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(550).addComponent(getBtnSignup_1(),
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(7, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Signup.jpg"));
		}
		return lblNewLabel;
	}

	public JLabel getLblHospitalRegistrationPage_1() {
		if (lblHospitalRegistrationPage == null) {
			lblHospitalRegistrationPage = new JLabel("Hospital Registration Page");
			lblHospitalRegistrationPage.setForeground(Color.RED);
			lblHospitalRegistrationPage.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblHospitalRegistrationPage;
	}

	public JLabel getLblPleaseSelectYour_1() {
		if (lblPleaseSelectYour == null) {
			lblPleaseSelectYour = new JLabel("Please Select Your Type That you Belongs ?");
			lblPleaseSelectYour.setForeground(Color.RED);
			lblPleaseSelectYour.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblPleaseSelectYour;
	}

	public JComboBox getComboBox_1() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setForeground(Color.RED);
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Doctor", "Patient" }));
			comboBox.setSelectedIndex(0);
			comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return comboBox;
	}

	public JLabel getLblName_1() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setForeground(Color.RED);
			lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblName;
	}

	public JTextField getTextField_3() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setForeground(Color.RED);
		}
		return lblNewLabel_1;
	}

	public JLabel getLblMobileNumberIs_1() {
		if (lblMobileNumberIs == null) {
			lblMobileNumberIs = new JLabel("Mobile Number Is Your PassWord");
			lblMobileNumberIs.setForeground(Color.ORANGE);
			lblMobileNumberIs.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblMobileNumberIs;
	}

	public JLabel getLblMobile_1() {
		if (lblMobile == null) {
			lblMobile = new JLabel("Mobile");
			lblMobile.setForeground(Color.RED);
			lblMobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblMobile;
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
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setForeground(Color.RED);
		}
		return lblNewLabel_1_1;
	}

	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Email-Id Is Your UserId...");
			lblNewLabel_2.setForeground(Color.ORANGE);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2;
	}

	public JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.RED);
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblEmail;
	}

	public JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setForeground(Color.RED);
		}
		return lblNewLabel_1_2;
	}

	public JLabel getLblGender_1() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setForeground(Color.RED);
			lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblGender;
	}

	public JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return rdbtnNewRadioButton;
	}

	public JRadioButton getRdbtnFemale_1() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return rdbtnFemale;
	}

	public JRadioButton getRdbtnOther_1() {
		if (rdbtnOther == null) {
			rdbtnOther = new JRadioButton("Other");
			buttonGroup.add(rdbtnOther);
			rdbtnOther.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return rdbtnOther;
	}

	public JButton getBtnNewButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("SignUp");
			btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\login.png"));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String value2 = "";
					if (rdbtnNewRadioButton.isSelected()) {
						value2 = "male";
					} else if (rdbtnFemale.isSelected()) {
						value2 = "female";
					} else {
						value2 = "other";
					}
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						System.out.println("connected");
						String query = "INSERT INTO singhhospital.signup (Name, Mobile, Email, Gender) VALUES(?, ?, ?, ?)";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						pst.setString(3, textField_2.getText());
						pst.setString(4, value2);
						pst.executeUpdate();

					} catch (ClassNotFoundException e1) {

						e1.printStackTrace();
					} catch (SQLException e1) {

						e1.printStackTrace();
					}

					if (textField_1.getText().trim().isEmpty() && textField_2.getText().trim().isEmpty()) {
						lblNewLabel_1.setText("Field(s) are Empty");

					} else if (textField_1.getText().trim().isEmpty()) {
						lblNewLabel_1_1.setText(" Mobile Field are Empty");
					} else if (textField_2.getText().trim().isEmpty()) {
						lblNewLabel_1_2.setText(" Email Field are Empty");
					} else {
						JOptionPane.showMessageDialog(null, "SignUp Successfull");
						setVisible(false);
						Login login = new Login();
						login.setVisible(true);
					}
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JButton getBtnSignup_1() {
		if (btnSignup == null) {
			btnSignup = new JButton("Back");
			btnSignup.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\Close.png"));
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Login login = new Login();
					login.setVisible(true);
				}
			});
			btnSignup.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnSignup;
	}
}
