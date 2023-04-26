package edu.aiub.UI.authentication;

import edu.aiub.UI.AdminDashboard;

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
import javax.swing.border.EmptyBorder;


public class Signin extends JFrame{
	private String root = "src/main/java/edu/aiub/";
	
    private JTextField EmailTextField;
    private JPasswordField PasswordField1;
    private JLabel emailLabel;
    private JPanel emailPanel;
    private JButton signupBtn;
    private JLabel signupLabel;
    private JButton loginBtn;
    private JButton forgotBtn;
    private JPanel nirmulPanel;
    private JLabel passwordLabel;
    private JPanel passwordPanel;

    public Signin(){

		nirmulPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\login_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        emailPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        emailLabel = new JLabel();
        EmailTextField = new JTextField();
        passwordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        passwordLabel = new JLabel();
        PasswordField1 = new JPasswordField();
        loginBtn = new JButton();
        forgotBtn = new JButton();
        signupLabel = new JLabel();
        signupBtn = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        nirmulPanel.setForeground(new Color(153, 153, 153)); //TestColor
        nirmulPanel.setLayout(null);

        emailPanel.setBackground(new Color(204, 255, 204)); //TestColor
        emailPanel.setLayout(null);

        emailLabel.setFont(new Font("Inter", Font.PLAIN, 12));
        emailLabel.setText("Email");
        emailPanel.add(emailLabel);
        emailLabel.setBounds(20, 10, 50, 15);

        EmailTextField.setBackground(new Color(234, 250, 241));
        EmailTextField.setFont(new Font("Inter", 0, 14)); 
        EmailTextField.setBorder(null);
        EmailTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               // EmailTextFieldActionPerformed(evt);
            }
        });
        emailPanel.add(EmailTextField);
        EmailTextField.setBounds(20, 42, 480, 20);

        nirmulPanel.add(emailPanel);
        emailPanel.setBounds(75, 358, 525, 80);

        passwordPanel.setBackground(new Color(204, 255, 204));//TestColor
        passwordPanel.setLayout(null);

        passwordLabel.setFont(new Font("Inter", 0, 12)); 
        passwordLabel.setText("Password");
        passwordPanel.add(passwordLabel);
        passwordLabel.setBounds(20, 10, 70, 20);

        PasswordField1.setBackground(new Color(234, 250, 241));
        PasswordField1.setBorder(null);
        passwordPanel.add(PasswordField1);
        PasswordField1.setBounds(20, 40, 480, 16);

        nirmulPanel.add(passwordPanel);
        passwordPanel.setBounds(75, 457, 525, 80);

        UIManager.put("Button.arc", 50);
        loginBtn.setBackground(new Color(46, 204, 113));
        loginBtn.setFont(new Font("Inter", 1, 18));
        loginBtn.setForeground(new Color(255 , 255 , 255));
        loginBtn.setText("Login");
        nirmulPanel.add(loginBtn);
        loginBtn.setBounds(360, 575, 240, 60);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
				loginBtnActionPerformed(actionEvent);
            }
        });


        forgotBtn.setBackground(new Color(46, 204, 113));
        forgotBtn.setFont(new Font("Inter", 1, 18));
        forgotBtn.setForeground(new Color(255 , 255 , 255));
        forgotBtn.setText("Forgot Password?");
//        forgotBtn.setBorder(null);
        nirmulPanel.add(forgotBtn);
        forgotBtn.setBounds(75, 575, 240, 60);
        forgotBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new ForgetPassword();
            }
        });

        signupLabel.setFont(new Font("Inter", 0, 14));
        signupLabel.setText("New to Nirmul? ");
        nirmulPanel.add(signupLabel);
        signupLabel.setBounds(80, 300, 110, 18);

        signupBtn.setBackground(new Color(255, 255, 255));
        signupBtn.setFont(new Font("Inter", 1, 14)); 
        signupBtn.setForeground(new Color(46,204,113));
        signupBtn.setText("Signup");
        signupBtn.setBorder(null);
        nirmulPanel.add(signupBtn);
        signupBtn.setBounds(185, 284, 50, 50);
        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
				signupBtnActionPerformed(actionEvent);
            }
        });

        add(nirmulPanel);
        nirmulPanel.setBounds(0, 0, 1200, 750);

//        pack();
        setTitle("NGO Management System");
        setResizable(false);
        setSize(1200,800);
        setIconImage(new ImageIcon(root+"static\\titleIcon.png").getImage());
        setLocationRelativeTo(null);
        setVisible(true);

        }
		
		private void loginBtnActionPerformed(ActionEvent actionEvent) {
			
			//get username and password
			String email = EmailTextField.getText();
			String passWord = PasswordField1.getText();
			
			//value from database
			String EmailFromDB = "abcd@gmail.com";
			String PasswordFromDB = "12345678";
			String userType = "Admin";
			
			//Login validation
			//case 1  : if both username and password blanks
			if(email.equals("")&&passWord.equals("")){
				//if both null display messege
				JOptionPane.showMessageDialog(this,"Please Enter Email and Password");
			}
			else if (!(email.equals(""))&&passWord.equals("")){
				JOptionPane.showMessageDialog(this, "Please Enter Password");
			}
			else if ((email.equals(""))&&!(passWord.equals(""))){
				JOptionPane.showMessageDialog(this, "Please Enter Email");
			}
			
			
			
			else if ((email.equals(EmailFromDB))&&(passWord.equals(PasswordFromDB))){
				dispose();
				if (userType.equals("Admin")) {
					new AdminDashboard(0);	
				} else if (userType.equals("Staff")) {
					new AdminDashboard(0);	
				} else if (userType.equals("Volunteer")) {
					new AdminDashboard(0);	
				} else if (userType.equals("User")) {
					new AdminDashboard(0);	
				}
			} else { 
				JOptionPane.showMessageDialog(this, "Your Email or Password is wrong!");
			}
		}
		
		private void signupBtnActionPerformed(ActionEvent actionEvent) {
			dispose();
			signupBtn.setVisible(true);
			new CreateAccount();
		}

    }
