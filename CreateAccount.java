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


public class CreateAccount extends JFrame{
	private String root = "C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\";
	
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

    CreateAccount(){

		
        CreateAccountPanel = new JPanel();
        NirmulPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\createAccount_bg.png\\").getImage(), 0,0,getWidth(),getHeight(),null);
                
				}
            };
            ;

            ConfirmPasswordPanel = new JPanel();
			 ConfirmPasswordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
			
            confirmPasswordLabel = new JLabel();
            ConfirmPasswordField = new JPasswordField();
            dobPanel = new JPanel();
			
			dobPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
            dobLabel = new JLabel();
            dobTxtField = new JFormattedTextField();
            userVolunteerLabel = new JPanel();
            SignUpAsWhatLabel = new JLabel();
            userCbox = new JComboBox<>();
			
            phoneNumberPanel = new JPanel();
			
			phoneNumberPanel=  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
            phoneNumLabel = new JLabel();
            phoneNumTxtF = new JTextField();
            passwordPanel = new JPanel();
			
			passwordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
            passwordLabel = new JLabel();
            PasswordField = new JPasswordField();
            emailPanel = new JPanel();
			
			 emailPanel=  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
            emailLabel = new JLabel();
            emailTxtF = new JTextField();
            lastnamePanel = new JPanel();
			
			lastnamePanel=  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
			
            lastNameLabel = new JLabel();
            lastNameTxtField = new JTextField();
			
            firstnamePanel = new JPanel();
			  firstnamePanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
            firstNameLabel = new JLabel();
            firstNameTxtF = new JTextField();
            memberQLabel = new JLabel();
            signinbtn = new JButton();
            signupBtn = new JButton();
            NirmulTermsCheckbox = new JCheckBox();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            CreateAccountPanel.setBackground(new Color(234, 250, 241));
            CreateAccountPanel.setLayout(null);

            NirmulPanel.setBackground(new Color(255, 255, 255));
            NirmulPanel.setLayout(null);

            ConfirmPasswordPanel.setBackground(new Color(234, 250, 241));
            ConfirmPasswordPanel.setLayout(null);

            confirmPasswordLabel.setFont(new Font("Inter", 0, 12)); 
            confirmPasswordLabel.setText("Confirm Password");
            ConfirmPasswordPanel.add(confirmPasswordLabel);
            confirmPasswordLabel.setBounds(10, 10, 102, 15);

            ConfirmPasswordField.setBackground(new Color(234, 250, 241));
            ConfirmPasswordField.setText("");
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
			
			
			
			
			
			userCbox.setBorder(null);
			
			
			
			
			
            dobPanel.add(dobTxtField);
            dobTxtField.setBounds(10, 30, 260, 16);

            NirmulPanel.add(dobPanel);
            dobPanel.setBounds(370, 350, 280, 60);

            userVolunteerLabel.setBackground(new Color(234, 250, 241));
            userVolunteerLabel.setLayout(null);

            SignUpAsWhatLabel.setFont(new Font("Inter", 0, 12)); 
            SignUpAsWhatLabel.setText("Sign up as an user or volunteer?");
            userVolunteerLabel.add(SignUpAsWhatLabel);
            SignUpAsWhatLabel.setBounds(10, 10, 178, 15);

            userCbox.setBackground(new Color(234, 250, 241));
            userCbox.setModel(new DefaultComboBoxModel<>(new String[] { "User", "Volunteer" }));
            userCbox.setBorder(null);
            userCbox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                   // userCboxActionPerformed(evt);
                }
            });
            userVolunteerLabel.add(userCbox);
            userCbox.setBounds(10, 30, 83, 20);

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
            PasswordField.setText("");
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
            memberQLabel.setBounds(85, 240, 130, 22);

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
            signinbtn.setBounds(200, 241, 50, 20);

            signupBtn.setBackground(new Color(46, 204, 113));
            signupBtn.setFont(new Font("Inter", 1, 18));
            signupBtn.setForeground(new Color(255, 255, 255));
            signupBtn.setText("Sign up");
            signupBtn.setBorder(null);
            NirmulPanel.add(signupBtn);
            signupBtn.setBounds(75, 640, 110, 40);
			signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

            NirmulTermsCheckbox.setText("I agree with the terms and conditions of Nirmul Foundation");
            NirmulTermsCheckbox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    //NirmulTermsCheckboxActionPerformed(evt);
                }
            });
            NirmulPanel.add(NirmulTermsCheckbox);
            NirmulTermsCheckbox.setBounds(70, 600, 400, 20);
			NirmulTermsCheckbox.setBackground(new Color(255, 255, 255));
            CreateAccountPanel.add(NirmulPanel);
            NirmulPanel.setBounds(0, 0, 1200, 750);

            getContentPane().add(CreateAccountPanel);
            CreateAccountPanel.setBounds(0, 0, 1200, 750);

            pack();
        
		
		setTitle("NGO Management System");
		//setIconImage(new ImageIcon(root+"Static\\titleIcon.png").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);
		setLocationRelativeTo(null);


	}

		
		
private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // Get input values from text fields
    String email = emailTxtF.getText();
    String password = PasswordField.getText();
    String firstName = firstNameTxtF.getText();
    String lastName = lastNameTxtField.getText();
    String confirmPassword = ConfirmPasswordField.getText();
    String phoneNumber = phoneNumTxtF.getText();
	
    // Constants from database
    String emailFromDB = "abcd@gmail.com";
    String passwordFromDB = "12345678";
    String confirmPasswordFromDB = "12345678";
    
    // Check if any fields are empty
    if (email.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || 
            confirmPassword.isEmpty() || phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
    } else {
        // Check if email and password match database values
        if (email.equals(emailFromDB) && password.equals(passwordFromDB) && 
                confirmPassword.equals(confirmPasswordFromDB)) {
            // Email and password match, dispose current window and open new one
            dispose();
            new VerifyAccount();
            /*
            SendMail.sendMail(
                "robinpodder19@gmail.com",
                "This is test otp mail",
                "Your OTP is - 3547"
            );
            */
        } else {
            // Email and/or password do not match database values, display error message
            JOptionPane.showMessageDialog(this, "Invalid email or password.");
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


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new CreateAccount();

        }


    }
