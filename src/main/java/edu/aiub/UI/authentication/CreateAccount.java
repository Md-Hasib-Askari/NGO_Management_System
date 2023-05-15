package edu.aiub.UI.authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import edu.aiub.UI.donation.Guest;
import edu.aiub.database.DatabaseConnectivity;
import edu.aiub.essentials.*;
import org.bson.Document;


public class CreateAccount extends JFrame{
    private final String root = "src/main/java/edu/aiub/";

    private JPasswordField ConfirmPasswordField;
    private JPanel ConfirmPasswordPanel;
    private JPanel CreateAccountPanel;
    private JPanel NirmulPanel;
    private JCheckBox NirmulTermsCheckbox;
    private JPasswordField PasswordField;
    private JLabel SignUpAsWhatLabel;
    private JLabel confirmPasswordLabel;
    private JLabel dobLabel;
    private JPanel dobPanel;
    private JFormattedTextField dobTxtField;
    private JLabel emailLabel;
    private JPanel emailPanel;
    private JTextField emailTxtF;
    private JLabel firstNameLabel;
    private JTextField firstNameTxtF;
    private JPanel firstnamePanel;
    private JLabel lastNameLabel;
    private JTextField lastNameTxtField;
    private JPanel lastnamePanel;
   private JLabel memberQLabel;
    private JLabel passwordLabel;
    private JPanel passwordPanel;
    private JLabel phoneNumLabel;
    private JTextField phoneNumTxtF;
    private JPanel phoneNumberPanel;
    private JButton signinbtn;
    private JButton signupBtn;
    private JComboBox<String> userCbox;
    private JPanel userVolunteerLabel;
	private JButton donateBtn;

    public CreateAccount(){


        CreateAccountPanel = new JPanel();
        NirmulPanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon(root + "auth_static\\createAccount_bg.png").getImage(), 0, 0, getWidth(), getHeight(), null);
			}
		};
		ConfirmPasswordPanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
			};
		};
		confirmPasswordLabel = new JLabel();
		ConfirmPasswordField = new JPasswordField();
		dobPanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            };
		};
		dobLabel = new JLabel();
		dobTxtField = new JFormattedTextField();
		userVolunteerLabel = new JPanel();
		SignUpAsWhatLabel = new JLabel();
		userCbox = new JComboBox<>();
		phoneNumberPanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            };
		};
		phoneNumLabel = new JLabel();
		phoneNumTxtF = new JTextField();
		passwordPanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
		};
		passwordLabel = new JLabel();
		PasswordField = new JPasswordField();
		emailPanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
		};
		emailLabel = new JLabel();
		emailTxtF = new JTextField();
		lastnamePanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
		};
		lastNameLabel = new JLabel();
		lastNameTxtField = new JTextField();
		
		firstnamePanel = new JPanel() {
			@Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "auth_static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
		};
		firstNameLabel = new JLabel();
		firstNameTxtF = new JTextField();
		memberQLabel = new JLabel();
	    signinbtn = new JButton();
		signupBtn = new JButton();
		NirmulTermsCheckbox = new JCheckBox();
		donateBtn = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		CreateAccountPanel.setBackground(new Color(234, 250, 241));
		CreateAccountPanel.setLayout(null);

		NirmulPanel.setBackground(new Color(255, 255, 255));
		NirmulPanel.setLayout(null);

		ConfirmPasswordPanel.setBackground(new Color(204, 255, 204));
		ConfirmPasswordPanel.setLayout(null);

		confirmPasswordLabel.setFont(new Font("Inter", 0, 12)); 
		confirmPasswordLabel.setText("Confirm Password");
		ConfirmPasswordPanel.add(confirmPasswordLabel);
		confirmPasswordLabel.setBounds(10, 10, 102, 15);

		ConfirmPasswordField.setBackground(new Color(234, 250, 241));
		ConfirmPasswordField.setBorder(null);
		ConfirmPasswordPanel.add(ConfirmPasswordField);
		ConfirmPasswordField.setBounds(10, 30, 260, 16);

		NirmulPanel.add(ConfirmPasswordPanel);
		ConfirmPasswordPanel.setBounds(370, 430, 280, 60);

		dobPanel.setBackground(new Color(234, 250, 241));
		dobPanel.setLayout(null);

		dobLabel.setFont(new Font("Inter", 0, 12)); 
		dobLabel.setText("Date of Birth");
		dobPanel.add(dobLabel);
		dobLabel.setBounds(10, 10, 70, 15);

		dobTxtField.setBackground(new Color(234, 250, 241));
		dobTxtField.setBorder(null);
		dobTxtField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//dobTxtFieldActionPerformed(evt);
			}
		});
		dobPanel.add(dobTxtField);
		dobTxtField.setBounds(10, 30, 260, 16);

		NirmulPanel.add(dobPanel);
		dobPanel.setBounds(370, 350, 280, 60);

		userVolunteerLabel.setBackground(new Color(234, 250, 241));
		userVolunteerLabel.setLayout(null);

		SignUpAsWhatLabel.setFont(new Font("Inter", 0, 12)); 
		SignUpAsWhatLabel.setText("Role");
		userVolunteerLabel.add(SignUpAsWhatLabel);
		SignUpAsWhatLabel.setBounds(10, 10, 178, 15);

		userCbox.setBackground(new Color(234, 250, 241));
		userCbox.setModel(new DefaultComboBoxModel<>(new String[] { "Volunteer", "Admin" }));
		userCbox.setBorder(null);
		userCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   // userCboxActionPerformed(evt);
			}
		});
		userVolunteerLabel.add(userCbox);
		userCbox.setBounds(10, 30, 250, 20);

		NirmulPanel.add(userVolunteerLabel);
		userVolunteerLabel.setBounds(370, 510, 280, 60);

		phoneNumberPanel.setBackground(new Color(234, 250, 241));
		phoneNumberPanel.setLayout(null);

		phoneNumLabel.setFont(new Font("Inter", 0, 12)); 
		phoneNumLabel.setText("Phone Number");
		phoneNumberPanel.add(phoneNumLabel);
		phoneNumLabel.setBounds(10, 10, 83, 15);

		phoneNumTxtF.setBackground(new Color(234, 250, 241));
		phoneNumTxtF.setBorder(null);
		phoneNumberPanel.add(phoneNumTxtF);
		phoneNumTxtF.setBounds(10, 30, 242, 16);

		NirmulPanel.add(phoneNumberPanel);
		phoneNumberPanel.setBounds(75, 510, 260, 60);

		passwordPanel.setBackground(new Color(234, 250, 241));
		passwordPanel.setLayout(null);

		passwordLabel.setFont(new Font("Inter", 0, 12));
		passwordLabel.setText("Password");
		passwordPanel.add(passwordLabel);
		passwordLabel.setBounds(10, 10, 55, 15);

		PasswordField.setBackground(new Color(234, 250, 241));
		PasswordField.setBorder(null);
		passwordPanel.add(PasswordField);
		PasswordField.setBounds(10, 30, 242, 16);

		NirmulPanel.add(passwordPanel);
		passwordPanel.setBounds(75, 430, 260, 60);

		emailPanel.setBackground(new Color(234, 250, 241));
		emailPanel.setLayout(null);

		emailLabel.setFont(new Font("Inter", 0, 12)); 
		emailLabel.setText("Email");
		emailPanel.add(emailLabel);
		emailLabel.setBounds(10, 10, 30, 15);

		emailTxtF.setBackground(new Color(234, 250, 241));
		emailTxtF.setBorder(null);
		emailPanel.add(emailTxtF);
		emailTxtF.setBounds(10, 30, 240, 16);

		NirmulPanel.add(emailPanel);
		emailPanel.setBounds(75, 350, 260, 60);

		lastnamePanel.setBackground(new Color(234, 250, 241));
		lastnamePanel.setLayout(null);

		lastNameLabel.setFont(new Font("Inter", 0, 12)); 
		lastNameLabel.setText("Last Name");
		lastnamePanel.add(lastNameLabel);
		lastNameLabel.setBounds(10, 10, 60, 15);

		lastNameTxtField.setBackground(new Color(234, 250, 241));
		lastNameTxtField.setBorder(null);
		lastNameTxtField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   // lastNameTxtFieldActionPerformed(evt);
			}
		});
		lastnamePanel.add(lastNameTxtField);
		lastNameTxtField.setBounds(10, 30, 260, 16);

		NirmulPanel.add(lastnamePanel);
		lastnamePanel.setBounds(370, 270, 280, 60);

		firstnamePanel.setBackground(new Color(234, 250, 241));
		firstnamePanel.setLayout(null);

		firstNameLabel.setFont(new Font("Inter", 0, 12)); 
		firstNameLabel.setText("First Name");
		firstnamePanel.add(firstNameLabel);
		firstNameLabel.setBounds(10, 10, 60, 15);

		firstNameTxtF.setBackground(new Color(234, 250, 241));
		firstNameTxtF.setFont(new Font("Inter", 0, 12)); 
		firstNameTxtF.setBorder(null);
		firstnamePanel.add(firstNameTxtF);
		firstNameTxtF.setBounds(10, 30, 245, 15);

		NirmulPanel.add(firstnamePanel);
		firstnamePanel.setBounds(75, 270, 260, 60);

		memberQLabel.setFont(new Font("Inter", 0, 12));
		memberQLabel.setText("Already a member?");
		NirmulPanel.add(memberQLabel);
		memberQLabel.setBounds(85, 230, 130, 22);

		signinbtn.setBackground(new Color(255, 255, 255));
		signinbtn.setFont(new Font("Inter", 1, 14)); 
		signinbtn.setForeground(new Color(46, 204, 113));
		signinbtn.setText("Sign in");
		signinbtn.setBorder(null);
		signinbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			    signinbtnActionPerformed(evt);
			}
		});
		NirmulPanel.add(signinbtn);
		signinbtn.setBounds(200, 231, 50, 20);


		donateBtn.putClientProperty("JButton.buttonType", "roundRect");
		donateBtn.setBackground(new Color(46, 204, 113));
		donateBtn.setFont(new Font("Inter", 1, 14));
		donateBtn.setForeground(new Color(255, 255, 255));
		donateBtn.setText("Donate");
//		donateBtn.setBorder(null);
		NirmulPanel.add(donateBtn);
		donateBtn.setBounds(260, 220, 90, 40);
		donateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				dispose();
				new Guest();
			}
		});


		signupBtn.setBackground(new Color(46, 204, 113));
		signupBtn.setFont(new Font("Inter", 1, 18));
		signupBtn.setForeground(new Color(255, 255, 255));
		signupBtn.setText("Sign up");
//		signupBtn.setBorder(null);
		NirmulPanel.add(signupBtn);
		signupBtn.setBounds(75, 640, 150, 50);
		signupBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				signupBtnActionPerformed(actionEvent);
			}
		});

		NirmulTermsCheckbox.setText("I agree with the terms and conditions of Nirmul Foundation");
		NirmulTermsCheckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//NirmulTermsCheckboxActionPerformed(evt);
			}
		});
		NirmulPanel.add(NirmulTermsCheckbox);
		NirmulTermsCheckbox.setBounds(70, 600, 350, 20);

		CreateAccountPanel.add(NirmulPanel);
		NirmulPanel.setBounds(0, 0, 1200, 800);

		getContentPane().add(CreateAccountPanel);
		CreateAccountPanel.setBounds(0, 0, 1200, 800);


		setTitle("NGO Management System");
		setResizable(false);
		setSize(1200,800);
		setIconImage(new ImageIcon(root+"static\\titleIcon.png").getImage());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {
		if (!NirmulTermsCheckbox.isSelected()) {
			JOptionPane.showMessageDialog(null, "Please agree to the terms and conditions");
			return;
		}
		// Get input values from text fields
		String email = emailTxtF.getText();
		String password = PasswordField.getText();
		String firstName = firstNameTxtF.getText();
		String lastName = lastNameTxtField.getText();
		String confirmPassword = ConfirmPasswordField.getText();
		String phoneNumber = phoneNumTxtF.getText();
		String role = userCbox.getSelectedItem().toString();

		// Constants from database
		String otp = String.valueOf(RandomOTP.generateOTP(4));
		System.out.println(otp);

		// Check if any fields are empty
		if (isEmailExist(email)) {
			JOptionPane.showMessageDialog(this, "Email already exists.");
		} else {

			if (email.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||
					confirmPassword.isEmpty() || phoneNumber.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all fields.");
			} else {
				// Check if email and password match database values
				if (password.equals(confirmPassword)) {
					// Email and password match, dispose current window and open new one
					dispose();
					String[] data = {otp, email, password, firstName+" "+lastName, phoneNumber, role};
					new VerifyAccount(data, "CreateAccount");
					SendMail.sendMail(
							email,
							"OTP for Account Verification",
							"Hello "+firstName+", Your OTP is " + otp
					);
				} else {
					// Email and/or password do not match database values, display error message
					JOptionPane.showMessageDialog(this, "Passwords do not match.");
				}
			}
		}
	}


	private void signinbtnActionPerformed(java.awt.event.ActionEvent evt){
		 // Close the current frame
		dispose();
		
		// Create a new instance of the Signin class
		Signin signin = new Signin();
		// Display the sign-in form to the user
		signin.setVisible(true);
		
	}

	public boolean isEmailExist(String email) {
		DatabaseConnectivity db = new DatabaseConnectivity("users") {
			@Override
			public void add(Object[] column) {

			}

			@Override
			public void update(int id, Object[] column) {

			}
		};
		Document emailDoc = db.collection.find(new Document("email", email)).first();
		if (emailDoc != null)
			return true;

		return false;
	}
	public void addUserToDB() {
	}

}
