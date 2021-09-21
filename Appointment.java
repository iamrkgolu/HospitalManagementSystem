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
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Appointment extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_4;
	private JTextField textField_4;
	private JSeparator separator_1;
	private JLabel lblAppointmentInformation;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_1_3;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnDrJones;
	private JRadioButton rdbtnDrPatel;
	private JRadioButton rdbtnDrRadha;
	private JRadioButton rdbtnNoPreference;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointment frame = new Appointment();
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
	public Appointment() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1337, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(667).addComponent(getRdbtnDrPatel(),
						GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(577).addComponent(getBtnNewButton_1_1(),
						GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(987).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(335).addComponent(getLblNewLabel_1_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(335).addComponent(getRdbtnNewRadioButton(),
						GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(502).addComponent(getRdbtnDrJones(),
						GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(792).addComponent(getLblNewLabel_1_4(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getSeparator_1(),
						GroupLayout.PREFERRED_SIZE, 960, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(792).addComponent(getLblNewLabel_1_2(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(530).addComponent(getTextField_1(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(530).addComponent(getTextField(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(530).addComponent(getTextField_5(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(245).addComponent(getSeparator(),
						GroupLayout.PREFERRED_SIZE, 960, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(835).addComponent(getLblNewLabel_1_1_3(),
						GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(530).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(330).addComponent(getBtnNewButton_1(),
						GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(510).addComponent(
						getLblAppointmentInformation(), GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(335).addComponent(getLblNewLabel_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(530).addComponent(getLblNewLabel_1(),
						GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(800).addComponent(getBtnNewButton(),
						GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(930).addComponent(getComboBox(),
						GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(335).addComponent(getLblNewLabel_1_1(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(335).addComponent(getLblNewLabel_1_3(),
						GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(835).addComponent(getRdbtnDrRadha(),
						GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(1009).addComponent(getRdbtnNoPreference(),
						GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(330).addComponent(getLblNewLabel_2(),
						GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(987).addComponent(getTextField_2(),
						GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addComponent(getLblNewLabel(), GroupLayout.PREFERRED_SIZE, 1325, GroupLayout.PREFERRED_SIZE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(getRdbtnDrPatel(),
						GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(563).addComponent(getBtnNewButton_1_1(),
						GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(284).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(423).addComponent(getLblNewLabel_1_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(499).addComponent(getRdbtnNewRadioButton(),
						GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(getRdbtnDrJones(),
						GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(289).addComponent(getLblNewLabel_1_4(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(363).addComponent(getSeparator_1(),
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(228).addComponent(getLblNewLabel_1_2(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(225).addComponent(getTextField_1(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(168).addComponent(getTextField(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(418).addComponent(getTextField_5(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(213).addComponent(getSeparator(),
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(418).addComponent(getLblNewLabel_1_1_3(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(284).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(563).addComponent(getBtnNewButton_1(),
						GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(375).addComponent(
						getLblAppointmentInformation(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(230).addComponent(getLblNewLabel_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(125).addComponent(getLblNewLabel_1(),
						GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(168).addComponent(getBtnNewButton(),
						GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(418).addComponent(getComboBox(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(173).addComponent(getLblNewLabel_1_1(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(289).addComponent(getLblNewLabel_1_3(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(499).addComponent(getRdbtnDrRadha(),
						GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(499).addComponent(getRdbtnNoPreference(),
						GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(463).addComponent(getLblNewLabel_2(),
						GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(223).addComponent(getTextField_2(),
						GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 705, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Appointment.jpg"));
		}
		return lblNewLabel;
	}

	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Patient Information");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblNewLabel_1;
	}

	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Patient Mobile");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Get Detail");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						String sql = ("SELECT Name, `Father's Name`, `D.O.B`, Mobile, Email, Gender, Reason FROM patient WHERE Mobile=?");
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, textField.getText());

						ResultSet rs = pst.executeQuery();
						if (rs.next() == true) {
							JOptionPane.showMessageDialog(null, "Record Found");
							textField_1.setText(rs.getString("Name"));
							textField_2.setText(rs.getString("Father's Name"));
							textField_3.setText(rs.getString("Reason"));
							textField_4.setText(rs.getString("D.O.B"));

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

	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Name");
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1;
	}

	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Father's Name");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_2;
	}

	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Reason");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_3;
	}

	public JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Age In Yr");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_4;
	}

	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	public JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
		}
		return separator_1;
	}

	public JLabel getLblAppointmentInformation() {
		if (lblAppointmentInformation == null) {
			lblAppointmentInformation = new JLabel("Appointment Information");
			lblAppointmentInformation.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblAppointmentInformation;
	}

	public JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Date");
			lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_1;
	}

	public JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_5.setColumns(10);
		}
		return textField_5;
	}

	public JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("Slot");
			lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_3;
	}

	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "1. 10am", "2. 12pm", "3. 2pm", "4. 4pm" }));
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return comboBox;
	}

	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Preferred Physician");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2;
	}

	public JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Dr. Anderson");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnNewRadioButton;
	}

	public JRadioButton getRdbtnDrJones() {
		if (rdbtnDrJones == null) {
			rdbtnDrJones = new JRadioButton("Dr. Jones");
			buttonGroup.add(rdbtnDrJones);
			rdbtnDrJones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnDrJones;
	}

	public JRadioButton getRdbtnDrPatel() {
		if (rdbtnDrPatel == null) {
			rdbtnDrPatel = new JRadioButton("Dr. Patel");
			buttonGroup.add(rdbtnDrPatel);
			rdbtnDrPatel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnDrPatel;
	}

	public JRadioButton getRdbtnDrRadha() {
		if (rdbtnDrRadha == null) {
			rdbtnDrRadha = new JRadioButton("Dr. Radha");
			buttonGroup.add(rdbtnDrRadha);
			rdbtnDrRadha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnDrRadha;
	}

	public JRadioButton getRdbtnNoPreference() {
		if (rdbtnNoPreference == null) {
			rdbtnNoPreference = new JRadioButton("No Preference");
			buttonGroup.add(rdbtnNoPreference);
			rdbtnNoPreference.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return rdbtnNoPreference;
	}

	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Submit");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String value = "";
					if (rdbtnNewRadioButton.isSelected()) {
						value = "Dr Anderson";
					} else if (rdbtnDrJones.isSelected()) {
						value = "Dr Jones";
					} else if (rdbtnDrPatel.isSelected()) {
						value = "Dr Patel";
					} else if (rdbtnDrRadha.isSelected()) {
						value = "Dr Radha";
					} else {
						value = "No Preferrence";
					}

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						System.out.println("connected");
						String query = "INSERT INTO appointment (Name, `Father's Name`, Reason, Age, `Date`, Slot, Physician, Mobile) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
						PreparedStatement pst = con.prepareStatement(query);
						pst.setString(1, textField_1.getText());
						pst.setString(2, textField_2.getText());
						pst.setString(3, textField_3.getText());
						pst.setString(4, textField_4.getText());
						pst.setString(5, textField_5.getText());
						pst.setString(6, "test");
						pst.setString(7, value);
						pst.setString(8, textField.getText());

						pst.executeUpdate();

					} catch (ClassNotFoundException e1) {

						e1.printStackTrace();
					} catch (SQLException e1) {

						e1.printStackTrace();
					}

					JOptionPane.showMessageDialog(null, "Appointment Booked");
					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton_1;
	}

	public JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Back");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton_1_1;
	}
}
