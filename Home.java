package com.org.hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Home extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private JButton btnEnquiry;
	private JButton btnAppointment;
	private JButton btnAboutUs;
	private JButton btnFeedback;
	private JButton btnSingOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		initGUI();
	}

	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1288, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnFeedback(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnSingOut(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnNewButton(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnAppointment(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnEnquiry(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnUpdate(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(getBtnAboutUs(),
						GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 1260, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(497).addComponent(getBtnFeedback(),
						GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(574).addComponent(getBtnSingOut(),
						GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(115).addComponent(getBtnNewButton(),
						GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(339).addComponent(getBtnAppointment(),
						GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(261).addComponent(getBtnEnquiry(),
						GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(190).addComponent(getBtnUpdate(),
						GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(423).addComponent(getBtnAboutUs(),
						GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(getLblNewLabel(),
						GroupLayout.PREFERRED_SIZE, 715, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\Home.jpg"));
		}
		return lblNewLabel;
	}

	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add Patient");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					AddPatient addPatient = new AddPatient();
					addPatient.setVisible(true);
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\add new patient.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnNewButton;
	}

	public JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					PatientDetail addPatient = new PatientDetail();
					addPatient.setVisible(true);
				}
			});
			btnUpdate.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\rsz_update_details.png"));
			btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnUpdate;
	}

	public JButton getBtnEnquiry() {
		if (btnEnquiry == null) {
			btnEnquiry = new JButton("Enquiry");
			btnEnquiry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Enquiry addPatient = new Enquiry();
					addPatient.setVisible(true);
				}
			});
			btnEnquiry.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\search.png"));
			btnEnquiry.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnEnquiry;
	}

	public JButton getBtnAppointment() {
		if (btnAppointment == null) {
			btnAppointment = new JButton("Appointment");
			btnAppointment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Appointment addPatient = new Appointment();
					addPatient.setVisible(true);
				}
			});
			btnAppointment.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\add diag.png"));
			btnAppointment.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnAppointment;
	}

	public JButton getBtnAboutUs() {
		if (btnAboutUs == null) {
			btnAboutUs = new JButton("About Us");
			btnAboutUs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					AboutUs addPatient = new AboutUs();
					addPatient.setVisible(true);
				}
			});
			btnAboutUs.setIcon(
					new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\rsz_hospital_information.png"));
			btnAboutUs.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnAboutUs;
	}

	public JButton getBtnFeedback() {
		if (btnFeedback == null) {
			btnFeedback = new JButton("FeedBack");
			btnFeedback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					FeedBack addPatient = new FeedBack();
					addPatient.setVisible(true);
				}
			});
			btnFeedback.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\rsz_history1.png"));
			btnFeedback.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnFeedback;
	}

	public JButton getBtnSingOut() {
		if (btnSingOut == null) {
			btnSingOut = new JButton("Log Out");
			btnSingOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Login login = new Login();
					login.setVisible(true);
				}
			});
			btnSingOut.setIcon(new ImageIcon("C:\\Users\\Hp\\Downloads\\HMS ICON\\HMS ICON\\Close.png"));
			btnSingOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return btnSingOut;
	}
}
