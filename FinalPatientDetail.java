package com.org.hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
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

public class FinalPatientDetail extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JSeparator separator_1;
	private JLabel lblPatientName;
	private JTextField textField_1;
	private JLabel lblAdmitOn;
	private JTextField textField_2;
	private JLabel lblFathersName;
	private JTextField textField_3;
	private JLabel lblDischarge;
	private JTextField textField_4;
	private JLabel lblDateofbirth;
	private JTextField textField_5;
	private JLabel lblNewLabel_3_1;
	private JTextField textField_6;
	private JLabel lblEmail;
	private JTextField textField_7;
	private JLabel lblNewLabel_3_2;
	private JTextField textField_8;
	private JLabel lblReason;
	private JTextField textField_9;
	private JLabel lblNewLabel_3_3;
	private JTextField textField_10;
	private JLabel lblStatus;
	private JTextField textField_11;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_12;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3_4;
	private JTextField textField_13;
	private JLabel lblNewLabel_3;
	private JTextField textField_14;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalPatientDetail frame = new FinalPatientDetail();
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
	public FinalPatientDetail() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1284, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(35)
				.addComponent(getLblNewLabel_1_1(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
				.addGap(520)
				.addComponent(getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
				.addGap(30)
				.addComponent(getTextField_12_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
				.addGap(50)
				.addComponent(getBtnNewButton_1_1(), GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35)
						.addComponent(getLblPatientName_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_1_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(315)
						.addComponent(getLblAdmitOn_1(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(710)
						.addComponent(getLblDischarge_1(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_4_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35)
						.addComponent(getLblDateofbirth_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_5_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(315).addComponent(getLblNewLabel_3_1_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(220)
						.addComponent(getTextField_7_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(315)
						.addComponent(getLblNewLabel_3_2_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_8_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35)
						.addComponent(getLblReason_1(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_9_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(315)
						.addComponent(getLblNewLabel_3_3_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_10_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(220)
						.addComponent(getTextField_11_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(315)
						.addComponent(getLblNewLabel_3_4_1(), GroupLayout.PREFERRED_SIZE, 155,
								GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(getTextField_13_1(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(895).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(990).addComponent(getBtnNewButton_2_2(),
						GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(235).addComponent(getBtnNewButton_2_1(),
						GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(895).addComponent(getTextField_6_1(),
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getSeparator_1(),
						GroupLayout.PREFERRED_SIZE, 1245, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(220).addComponent(getTextField_3_1(),
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(445).addComponent(getBtnNewButton_3(),
						GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(getLblEmail_1(),
						GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(getLblStatus_1(),
						GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(220).addComponent(getTextField_15(),
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(895).addComponent(getTextField_14_1(),
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(getLblFathersName_1(),
						GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(710).addComponent(getLblNewLabel_3_5(),
						GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 1260, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(36)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_12_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getBtnNewButton_1_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE))
				.addGap(40)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblPatientName_1(),
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getTextField_1_1(),
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addComponent(getLblAdmitOn_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(32)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblDischarge_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_4_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(29)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblDateofbirth_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_5_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(getLblNewLabel_3_1_1(),
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGap(22)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextField_7_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblNewLabel_3_2_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_8_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblReason_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_9_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblNewLabel_3_3_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_10_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextField_11_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblNewLabel_3_4_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_13_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(116).addComponent(getTextField_2_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(611).addComponent(getBtnNewButton_2_2(),
						GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(625).addComponent(getBtnNewButton_2_1(),
						GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(272).addComponent(getTextField_6_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(97).addComponent(getSeparator_1(),
						GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(193).addComponent(getTextField_3_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(36).addComponent(getBtnNewButton_3(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(334).addComponent(getLblEmail_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(467).addComponent(getLblStatus_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(36).addComponent(getTextField_15(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(531).addComponent(getTextField_14_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(193).addComponent(getLblFathersName_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(531).addComponent(getLblNewLabel_3_5(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 705, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Available Patient.jpg"));
		}
		return lblNewLabel;
	}

	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Patient Mobile ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JTextField getTextField_15() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JButton getBtnNewButton_3() {
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
							textField_3.setText(rs.getString("Father's Name"));
							textField_5.setText(rs.getString("D.O.B"));
							textField_7.setText(rs.getString("Email"));
							textField_9.setText(rs.getString("Reason"));

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
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
		}
		return separator_1;
	}

	public JLabel getLblPatientName_1() {
		if (lblPatientName == null) {
			lblPatientName = new JLabel("Patient Name");
			lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblPatientName;
	}

	public JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblAdmitOn_1() {
		if (lblAdmitOn == null) {
			lblAdmitOn = new JLabel("Admit On");
			lblAdmitOn.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblAdmitOn;
	}

	public JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblFathersName_1() {
		if (lblFathersName == null) {
			lblFathersName = new JLabel("Father's Name");
			lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblFathersName;
	}

	public JTextField getTextField_3_1() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JLabel getLblDischarge_1() {
		if (lblDischarge == null) {
			lblDischarge = new JLabel("Discharge");
			lblDischarge.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblDischarge;
	}

	public JTextField getTextField_4_1() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	public JLabel getLblDateofbirth_1() {
		if (lblDateofbirth == null) {
			lblDateofbirth = new JLabel("Date-of-Birth");
			lblDateofbirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblDateofbirth;
	}

	public JTextField getTextField_5_1() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_5.setColumns(10);
		}
		return textField_5;
	}

	public JLabel getLblNewLabel_3_1_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("Bed Charge");
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_3_1;
	}

	public JTextField getTextField_6_1() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_6.setColumns(10);
		}
		return textField_6;
	}

	public JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblEmail;
	}

	public JTextField getTextField_7_1() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_7.setColumns(10);
		}
		return textField_7;
	}

	public JLabel getLblNewLabel_3_2_1() {
		if (lblNewLabel_3_2 == null) {
			lblNewLabel_3_2 = new JLabel("Medicine Charge");
			lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_3_2;
	}

	public JTextField getTextField_8_1() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_8.setColumns(10);
		}
		return textField_8;
	}

	public JLabel getLblReason_1() {
		if (lblReason == null) {
			lblReason = new JLabel("Reason");
			lblReason.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblReason;
	}

	public JTextField getTextField_9_1() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_9.setColumns(10);
		}
		return textField_9;
	}

	public JLabel getLblNewLabel_3_3_1() {
		if (lblNewLabel_3_3 == null) {
			lblNewLabel_3_3 = new JLabel("Total");
			lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_3_3;
	}

	public JTextField getTextField_10_1() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_10.setColumns(10);
		}
		return textField_10;
	}

	public JLabel getLblStatus_1() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status");
			lblStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblStatus;
	}

	public JTextField getTextField_11_1() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_11.setColumns(10);
		}
		return textField_11;
	}

	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Patient Mobile ");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
	}

	public JTextField getTextField_12_1() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_12.setColumns(10);
		}
		return textField_12;
	}

	public JButton getBtnNewButton_1_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Get Detail");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						String sql = ("SELECT Name, `Fathers Name`, Mobile, Email, `No Of Days`, `Total BIll` FROM `final` Where Mobile=?");
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, textField_12.getText());

						ResultSet rs = pst.executeQuery();
						if (rs.next() == true) {
							JOptionPane.showMessageDialog(null, "Record Found");
							textField_10.setText(rs.getString("Total Bill"));
//							textField_3.setText(rs.getString("Father's Name"));
//							textField_5.setText(rs.getString("D.O.B"));
//							textField_7.setText(rs.getString("Email"));
//							textField_9.setText(rs.getString("Reason"));

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
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton_1;
	}

	public JLabel getLblNewLabel_3_4_1() {
		if (lblNewLabel_3_4 == null) {
			lblNewLabel_3_4 = new JLabel("Paid");
			lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_3_4;
	}

	public JTextField getTextField_13_1() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_13.setColumns(10);
		}
		return textField_13;
	}

	public JLabel getLblNewLabel_3_5() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Dues");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_3;
	}

	public JTextField getTextField_14_1() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_14.setColumns(10);
		}
		return textField_14;
	}

	public JButton getBtnNewButton_2_1() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new JButton("Back");
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Enquiry enquiry = new Enquiry();
					enquiry.setVisible(true);
				}
			});
			btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\back.png"));
			btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton_2_1;
	}

	public JButton getBtnNewButton_2_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Submit");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Submit SuccessFully");
					setVisible(false);
					FinalPatientDetail finalPatientDetail = new FinalPatientDetail();
					finalPatientDetail.setVisible(true);

				}
			});
			btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\save-icon--1.png"));
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton_2;
	}
}
