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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PatientDetail extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblName;
	private JTextField textField_1;
	private JLabel lblFathersName;
	private JTextField textField_2;
	private JLabel lblAddress;
	private JTextField textField_3;
	private JLabel lblReason;
	private JTextField textField_4;
	private JLabel lblNewLabel_1_1;
	private JButton btnUpdate;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetail frame = new PatientDetail();
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
	public PatientDetail() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1304, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(461)
										.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 214,
												GroupLayout.PREFERRED_SIZE)
										.addGap(81).addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(134).addComponent(
										getSeparator(), GroupLayout.PREFERRED_SIZE, 986, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(175)
										.addComponent(getLblFathersName(), GroupLayout.PREFERRED_SIZE, 200,
												GroupLayout.PREFERRED_SIZE)
										.addGap(86).addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 214,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(461).addComponent(
										getTextField_3(), GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(175)
										.addComponent(getLblReason(), GroupLayout.PREFERRED_SIZE, 200,
												GroupLayout.PREFERRED_SIZE)
										.addGap(86).addComponent(getTextField_4(), GroupLayout.PREFERRED_SIZE, 214,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(460).addComponent(
										getLblNewLabel_1_1(), GroupLayout.PREFERRED_SIZE, 215,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(175).addComponent(
										getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 200,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(516).addComponent(getBtnBack(),
										GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(175).addComponent(getLblName(),
										GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(260).addComponent(
										getBtnUpdate(), GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(461).addComponent(
										getTextField_1(), GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(175).addComponent(
										getLblAddress(), GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(
										gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
												GroupLayout.PREFERRED_SIZE, 1270, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(15, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(128)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE))
								.addGap(24)
								.addComponent(getSeparator(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(105)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getLblFathersName(), GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane
												.createSequentialGroup().addGap(3).addComponent(getTextField_2(),
														GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
								.addGap(57)
								.addComponent(
										getTextField_3(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(50)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getLblReason(), GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
												.addComponent(getTextField_4(), GroupLayout.PREFERRED_SIZE, 41,
														GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(508).addComponent(getLblNewLabel_1_1(),
								GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(125).addComponent(getLblNewLabel_1(),
								GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(558).addComponent(getBtnBack(),
								GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(221).addComponent(getLblName(),
								GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(558).addComponent(getBtnUpdate(),
								GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(224).addComponent(getTextField_1(),
								GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(376).addComponent(getLblAddress(),
								GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
								GroupLayout.PREFERRED_SIZE, 703, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(22, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Available Patient.jpg"));
		}
		return lblNewLabel;
	}

	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Paitent Mobile Number");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1;
	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField.setColumns(10);
		}
		return textField;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Get Details");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						String sql = ("SELECT Name, `Father's Name`, `D.O.B`, Mobile, Email, Gender, Reason FROM patient Where Mobile=?");
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, textField.getText());

						ResultSet rs = pst.executeQuery();
						if (rs.next() == true) {
							JOptionPane.showMessageDialog(null, "Record Found");
							textField_1.setText(rs.getString("Name"));
							textField_2.setText(rs.getString("Father's Name"));
//							textField_5.setText(rs.getString("D.O.B"));
//							textField_7.setText(rs.getString("Email"));
							textField_4.setText(rs.getString("Reason"));

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

	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	public JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblName;
	}

	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblFathersName() {
		if (lblFathersName == null) {
			lblFathersName = new JLabel("Father's Name");
			lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblFathersName;
	}

	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblAddress;
	}

	public JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JLabel getLblReason() {
		if (lblReason == null) {
			lblReason = new JLabel("Reason");
			lblReason.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblReason;
	}

	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setForeground(Color.RED);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_1_1;
	}

	public JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Detail Updated successfully.");

					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnUpdate.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\rsz_update_details.png"));
			btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnUpdate;
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
}
