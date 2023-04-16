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
//   private JLabel memberQLabel;
    private JLabel passwordLabel;
    private JPanel passwordPanel;
    private JLabel phoneNumLabel;
    private JTextField phoneNumTxtF;
    private JPanel phoneNumberPanel;
//    private JButton signinbtn;
    private JButton signupBtn;
    private JComboBox<String> userCbox;
    private JPanel userVolunteerLabel;

    CreateAccount(){


        CreateAccountPanel = new JPanel();
        NirmulPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\Robin\\Desktop\\Java Project\\Static\\createAccount_bg.png\\").getImage(), 0,0,getWidth(),getHeight(),null);
                }
            };
            ;
            ConfirmPasswordPanel = new JPanel();
            confirmPasswordLabel = new JLabel();
            ConfirmPasswordField = new JPasswordField();
            dobPanel = new JPanel();
            dobLabel = new JLabel();
            dobTxtField = new JFormattedTextField();
            userVolunteerLabel = new JPanel();
            SignUpAsWhatLabel = new JLabel();
            userCbox = new JComboBox<>();
            phoneNumberPanel = new JPanel();
            phoneNumLabel = new JLabel();
            phoneNumTxtF = new JTextField();
            passwordPanel = new JPanel();
            passwordLabel = new JLabel();
            PasswordField = new JPasswordField();
            emailPanel = new JPanel();
            emailLabel = new JLabel();
            emailTxtF = new JTextField();
            lastnamePanel = new JPanel();
            lastNameLabel = new JLabel();
            lastNameTxtField = new JTextField();
			
            firstnamePanel = new JPanel();
            firstNameLabel = new JLabel();
            firstNameTxtF = new JTextField();
            //memberQLabel = new JLabel();
           // signinbtn = new JButton();
            signupBtn = new JButton();
            NirmulTermsCheckbox = new JCheckBox();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            CreateAccountPanel.setBackground(new Color(255, 204, 153));
            CreateAccountPanel.setLayout(null);

            NirmulPanel.setBackground(new Color(255, 255, 255));
            NirmulPanel.setLayout(null);

            ConfirmPasswordPanel.setBackground(new Color(204, 255, 204));
            ConfirmPasswordPanel.setLayout(null);

            confirmPasswordLabel.setFont(new Font("Inter", 0, 12)); 
            confirmPasswordLabel.setText("Confirm Password");
            ConfirmPasswordPanel.add(confirmPasswordLabel);
            confirmPasswordLabel.setBounds(10, 10, 102, 15);

            ConfirmPasswordField.setBackground(new Color(204, 255, 204));
            ConfirmPasswordField.setText("jPasswordField2");
            ConfirmPasswordField.setBorder(null);
            ConfirmPasswordPanel.add(ConfirmPasswordField);
            ConfirmPasswordField.setBounds(10, 30, 260, 16);

            NirmulPanel.add(ConfirmPasswordPanel);
            ConfirmPasswordPanel.setBounds(370, 430, 280, 60);

            dobPanel.setBackground(new Color(204, 255, 204));
            dobPanel.setLayout(null);

            dobLabel.setFont(new Font("Inter", 0, 12)); 
            dobLabel.setText("Date of Birth");
            dobPanel.add(dobLabel);
            dobLabel.setBounds(10, 10, 70, 15);

            dobTxtField.setBackground(new Color(204, 255, 204));
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

            userVolunteerLabel.setBackground(new Color(204, 255, 204));
            userVolunteerLabel.setLayout(null);

            SignUpAsWhatLabel.setFont(new Font("Inter", 0, 12)); 
            SignUpAsWhatLabel.setText("Sign up as an user or volunteer?");
            userVolunteerLabel.add(SignUpAsWhatLabel);
            SignUpAsWhatLabel.setBounds(10, 10, 178, 15);

            userCbox.setBackground(new Color(204, 255, 204));
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

            phoneNumberPanel.setBackground(new Color(204, 255, 204));
            phoneNumberPanel.setLayout(null);

            phoneNumLabel.setFont(new Font("Inter", 0, 12)); 
            phoneNumLabel.setText("Phone Number");
            phoneNumberPanel.add(phoneNumLabel);
            phoneNumLabel.setBounds(10, 10, 83, 15);

            phoneNumTxtF.setBackground(new Color(204, 255, 204));
            phoneNumTxtF.setBorder(null);
            phoneNumberPanel.add(phoneNumTxtF);
            phoneNumTxtF.setBounds(10, 30, 242, 16);

            NirmulPanel.add(phoneNumberPanel);
            phoneNumberPanel.setBounds(75, 510, 260, 60);

            passwordPanel.setBackground(new Color(204, 255, 204));
            passwordPanel.setLayout(null);

            passwordLabel.setFont(new Font("Inter", 0, 12));
            passwordLabel.setText("Password");
            passwordPanel.add(passwordLabel);
            passwordLabel.setBounds(10, 10, 55, 15);

            PasswordField.setBackground(new Color(204, 255, 204));
            PasswordField.setText("jPasswordField1");
            PasswordField.setBorder(null);
            passwordPanel.add(PasswordField);
            PasswordField.setBounds(10, 30, 242, 16);

            NirmulPanel.add(passwordPanel);
            passwordPanel.setBounds(75, 430, 260, 60);

            emailPanel.setBackground(new Color(204, 255, 204));
            emailPanel.setLayout(null);

            emailLabel.setFont(new Font("Inter", 0, 12)); 
            emailLabel.setText("Email");
            emailPanel.add(emailLabel);
            emailLabel.setBounds(10, 10, 30, 15);

            emailTxtF.setBackground(new Color(204, 255, 204));
            emailTxtF.setBorder(null);
            emailPanel.add(emailTxtF);
            emailTxtF.setBounds(10, 30, 240, 16);

            NirmulPanel.add(emailPanel);
            emailPanel.setBounds(75, 350, 260, 60);

            lastnamePanel.setBackground(new Color(204, 255, 204));
            lastnamePanel.setLayout(null);

            lastNameLabel.setFont(new Font("Inter", 0, 12)); 
            lastNameLabel.setText("Last Name");
            lastnamePanel.add(lastNameLabel);
            lastNameLabel.setBounds(10, 10, 60, 15);

            lastNameTxtField.setBackground(new Color(204, 255, 204));
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

            firstnamePanel.setBackground(new Color(204, 255, 204));
            firstnamePanel.setLayout(null);

            firstNameLabel.setFont(new Font("Inter", 0, 12)); 
            firstNameLabel.setText("First Name");
            firstnamePanel.add(firstNameLabel);
            firstNameLabel.setBounds(10, 10, 60, 15);

            firstNameTxtF.setBackground(new Color(204, 255, 204));
            firstNameTxtF.setFont(new Font("Inter", 0, 12)); 
            firstNameTxtF.setBorder(null);
            firstnamePanel.add(firstNameTxtF);
            firstNameTxtF.setBounds(10, 30, 245, 15);

            NirmulPanel.add(firstnamePanel);
            firstnamePanel.setBounds(75, 270, 260, 60);
/*
            memberQLabel.setFont(new Font("Inter", 0, 14));
            memberQLabel.setText("Already a member?");
            NirmulPanel.add(memberQLabel);
            memberQLabel.setBounds(520, 600, 130, 22);
/*
            signinbtn.setBackground(new Color(153, 255, 153));
            signinbtn.setFont(new Font("Inter", 1, 18)); 
            signinbtn.setForeground(new Color(255, 255, 255));
            signinbtn.setText("Sign in");
            signinbtn.setBorder(null);
            signinbtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                  //  signinbtnActionPerformed(evt);
                }
            });
            NirmulPanel.add(signinbtn);
            signinbtn.setBounds(540, 630, 110, 40);
*/
            signupBtn.setBackground(new Color(46, 204, 113));
            signupBtn.setFont(new Font("Inter", 1, 18));
            signupBtn.setForeground(new Color(255, 255, 255));
            signupBtn.setText("Sign up");
            signupBtn.setBorder(null);
            NirmulPanel.add(signupBtn);
            signupBtn.setBounds(75, 640, 110, 40);

            NirmulTermsCheckbox.setText("I agree with the terms and conditions of Nirmul Foundation");
            NirmulTermsCheckbox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    //NirmulTermsCheckboxActionPerformed(evt);
                }
            });
            NirmulPanel.add(NirmulTermsCheckbox);
            NirmulTermsCheckbox.setBounds(70, 600, 337, 20);

            CreateAccountPanel.add(NirmulPanel);
            NirmulPanel.setBounds(0, 0, 1200, 750);

            getContentPane().add(CreateAccountPanel);
            CreateAccountPanel.setBounds(0, 0, 1200, 750);

            pack();
        
		setLocationRelativeTo(null);
		setTitle("NGO Management System");
		//setIconImage(new ImageIcon(root+"Stack\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);


        }


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new CreateAccount();

        }


    }
