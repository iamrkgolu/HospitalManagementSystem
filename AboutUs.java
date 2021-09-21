package com.org.hospital;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AboutUs extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 969, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getBtnNewButton(),
						GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(60)
						.addComponent(getPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(72).addComponent(getPanel_1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(731).addComponent(getPanel_2(),
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addComponent(getLblNewLabel(), GroupLayout.PREFERRED_SIZE, 935, GroupLayout.PREFERRED_SIZE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(37)
				.addComponent(getBtnNewButton(), GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE).addGap(385)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getPanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getPanel_1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(465).addComponent(getPanel_2(),
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Singh Hospital\r\nPlot N0-121\r\nSec-12\r\nGurgaon Haryana\r\n122506");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Enquiry.jpg"));
		}
		return lblNewLabel;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup().addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(getLblNewLabel_9(), GroupLayout.PREFERRED_SIZE, 142,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(getLblNewLabel_2(), GroupLayout.DEFAULT_SIZE,
											GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 158,
											GroupLayout.PREFERRED_SIZE))
							.addContainerGap()));
			gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
					.createSequentialGroup().addContainerGap()
					.addComponent(getLblNewLabel_1(), GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getLblNewLabel_2(), GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getLblNewLabel_9(), GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addContainerGap()));
			panel.setLayout(gl_panel);
		}
		return panel;
	}

	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
					.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup().addGap(49).addComponent(getLblNewLabel_3()))
							.addGroup(gl_panel_1.createSequentialGroup().addGap(15)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(getLblNewLabel_8(), Alignment.LEADING,
													GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(getLblNewLabel_4(), Alignment.LEADING))))
					.addContainerGap(11, Short.MAX_VALUE)));
			gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
					.createSequentialGroup().addGap(5).addComponent(getLblNewLabel_3())
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getLblNewLabel_4(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getLblNewLabel_8(), GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addContainerGap()));
			panel_1.setLayout(gl_panel_1);
		}
		return panel_1;
	}

	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("About Us");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Singh Hospital   Muzaffarpur  Bihar");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Contact Us");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Rahul Kumar, Mobile-8210526146");
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					JOptionPane.showMessageDialog(null, "Do you want to call");

				}
			});
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		}
		return lblNewLabel_4;
	}

	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			GroupLayout gl_panel_2 = new GroupLayout(panel_2);
			gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
					gl_panel_2.createSequentialGroup().addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
									.addComponent(getLblNewLabel_7(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
											Short.MAX_VALUE)
									.addComponent(getLblNewLabel_6(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
											Short.MAX_VALUE)
									.addComponent(getLblNewLabel_5(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
											Short.MAX_VALUE))
							.addContainerGap()));
			gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
					.createSequentialGroup().addContainerGap()
					.addComponent(getLblNewLabel_5(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getLblNewLabel_6(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getLblNewLabel_7(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE)));
			panel_2.setLayout(gl_panel_2);
		}
		return panel_2;
	}

	public JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Our Achievments");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblNewLabel_5;
	}

	public JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("We Run From 10 Years");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("We cure 10M Patients");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Email-rk.golu@hotmail.com");
			lblNewLabel_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JOptionPane.showMessageDialog(null, "Thankyou we work on it");
				}
			});
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_8;
	}

	public JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Pin-842001");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_9;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\back.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}
}
