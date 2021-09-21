package com.org.hospital;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AboutDoctor extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_1_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_1_3;
	private JTextField textField_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutDoctor frame = new AboutDoctor();
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
	public AboutDoctor() {
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1170, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(325).addComponent(getLblNewLabel_1(),
						GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(399)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addGap(59)
						.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(74).addComponent(getSeparator(),
						GroupLayout.PREFERRED_SIZE, 876, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(149)
						.addComponent(getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 197,
								GroupLayout.PREFERRED_SIZE)
						.addGap(50)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(396).addComponent(getTextField_2(),
						GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(152).addComponent(getLblNewLabel_1_1_2(),
						GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(399).addComponent(getBtnNewButton_1(),
						GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(399).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(149).addComponent(getLblNewLabel_1_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(396).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(149).addComponent(getLblNewLabel_1_1_3(),
						GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(152).addComponent(getLblNewLabel_1_1(),
						GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 1135, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(35)
				.addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(10)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
				.addGap(10)
				.addComponent(getSeparator(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblNewLabel_1_1_1(), GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(49).addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addGap(60)
				.addComponent(getLblNewLabel_1_1_2(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addGap(154)
				.addComponent(getBtnNewButton_1(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(374).addComponent(getTextField_3(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(274).addComponent(getLblNewLabel_1_1_1_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(466).addComponent(getTextField_4(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(466).addComponent(getLblNewLabel_1_1_3(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(95).addComponent(getLblNewLabel_1_1(),
						GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 665, GroupLayout.PREFERRED_SIZE)));
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
			lblNewLabel_1 = new JLabel("Welcome To The Singh Hospital");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblNewLabel_1;
	}

	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Enter Doctor Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1;
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
			btnNewButton = new JButton("Get Detail");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhhospital",
								"root", "password");
						String sql = ("SELECT Name, Email, Mobile, Specilist, Degination, Experiance, `Year Of Working` FROM doctor Where Name=?");
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, textField.getText());

						ResultSet rs = pst.executeQuery();
						if (rs.next() == true) {
							JOptionPane.showMessageDialog(null, "Record Found");
							textField_1.setText(rs.getString("Specilist"));
							textField_2.setText(rs.getString("Degination"));
							textField_3.setText(rs.getString("Experiance"));
							textField_4.setText(rs.getString("Year Of Working"));

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

	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Specilist");
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1;
	}

	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	public JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Deginatition");
			lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_1_1;
	}

	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			textField_2.setColumns(10);
		}
		return textField_2;
	}

	public JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Experiance");
			lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_2;
	}

	public JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_3.setColumns(10);
		}
		return textField_3;
	}

	public JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("Year Of Working");
			lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_1_1_3;
	}

	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_4.setColumns(10);
		}
		return textField_4;
	}

	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Enquiry enquiry = new Enquiry();
					enquiry.setVisible(true);
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\back.png"));
		}
		return btnNewButton_1;
	}
}
