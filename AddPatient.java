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
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddPatient extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnBack;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JLabel lblNewLabel_1_5;
	private JLabel lblNewLabel_1_6;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JTextField textField_5;
	private JLabel lblNewLabel_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatient frame = new AddPatient();
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
	public AddPatient() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1379, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(337).addComponent(getLblNewLabel_3(),
						GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
						.addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField_5(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(115)
						.addComponent(getLblNewLabel_1_1(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField_4(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(115)
						.addComponent(getLblNewLabel_1_2(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField_3(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
						.addComponent(getLblNewLabel_1_3(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
						.addComponent(getLblNewLabel_1_4(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
						.addComponent(getLblNewLabel_1_6(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getRdbtnNewRadioButton(), GroupLayout.PREFERRED_SIZE, 73,
								GroupLayout.PREFERRED_SIZE)
						.addGap(17)
						.addComponent(getRdbtnFemale(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addGap(19)
						.addComponent(getRdbtnOther(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
						.addComponent(getLblNewLabel_1_5(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(52)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(307).addComponent(getLblNewLabel_2(),
						GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(307)
						.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(getBtnBack(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
				.addComponent(getLblNewLabel(), GroupLayout.PREFERRED_SIZE, 1355, GroupLayout.PREFERRED_SIZE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(35)
				.addComponent(getLblNewLabel_3(), GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(25)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_5(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(29)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_1(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_4(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_2(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_3(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(41)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_3(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(36)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_4(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(35)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_6(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(
								getRdbtnNewRadioButton(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getRdbtnFemale(),
								GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(getRdbtnOther(),
								GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
				.addGap(36)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_5(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(26).addComponent(getLblNewLabel_2(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(29)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(getBtnBack(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Add Patient.jpg"));
		}
		return lblNewLabel;
	}

	public JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Are You Really Want To Go Back?");

					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnBack.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\back.png"));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnBack;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String value = "";
					if (rdbtnNewRadioButton.isSelected()) {
						value = "Male";
					} else if (rdbtnFemale.isSelected()) {
						value = "Female";
					} else {
						value = "Other";
					}

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						System.out.println("connected");
						String query = "INSERT INTO singhhospital.patient (Name, `Father's Name`, `D.O.B`, Mobile, Email, Gender, Reason) VALUES(?,? ,? , ?, ?, ?, ?)";
						;
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1, textField_5.getText());
						pst.setString(2, textField_4.getText());
						pst.setString(3, textField_3.getText());
						pst.setString(4, textField_2.getText());
						pst.setString(5, textField_1.getText());
						pst.setString(6, value);
						pst.setString(7, textField.getText());
						pst.executeUpdate();

					} catch (ClassNotFoundException e1) {

						e1.printStackTrace();
					} catch (SQLException e1) {

						e1.printStackTrace();
					}

					JOptionPane.showMessageDialog(null, "Record Added Successfully");
					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\add diag.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2;
	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JLabel getLblNewLabel_1_5() {
		if (lblNewLabel_1_5 == null) {
			lblNewLabel_1_5 = new JLabel("Reason");
			lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_5;
	}

	public JLabel getLblNewLabel_1_6() {
		if (lblNewLabel_1_6 == null) {
			lblNewLabel_1_6 = new JLabel("Gender");
			lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_6;
	}

	public JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnNewRadioButton;
	}

	public JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnFemale;
	}

	public JRadioButton getRdbtnOther() {
		if (rdbtnOther == null) {
			rdbtnOther = new JRadioButton("Other");
			buttonGroup.add(rdbtnOther);
			rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnOther;
	}

	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Email");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_4;
	}

	public JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Mobile");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_3;
	}

	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("D.O.B");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_2;
	}

	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Father's Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
	}

	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_5.setColumns(10);
		}
		return textField_5;
	}

	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Patient Detail");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblNewLabel_3;
	}
}
