package edu.aiub.UI.authentication;

import com.mongodb.client.*;
import edu.aiub.UI.admin.AdminDashboard;
import edu.aiub.UI.donation.Guest;
import edu.aiub.UI.volunteer.VolunteerDashboard;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Signin extends JFrame{
	private String root = "src/main/java/edu/aiub/";
	
    private JTextField EmailTextField;
    private JPasswordField PasswordField1;
    private JLabel emailLabel;
    private JPanel emailPanel;
    private JButton signupBtn;
    private JButton donateBtn;
    private JLabel signupLabel;
    private JButton loginBtn;
    private JButton forgotBtn;
    private JPanel nirmulPanel;
    private JLabel passwordLabel;
    private JPanel passwordPanel;
    private JToggleButton eyeTBtn;
    private JCheckBox rememberMeCheckBox;
    private JLabel EmailIconLabel;

    public Signin(){

		nirmulPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\login_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        emailPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        emailLabel = new JLabel();
        EmailTextField = new JTextField();
        passwordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        passwordLabel = new JLabel();

        // Create the EmailIconLabel
        EmailIconLabel = new JLabel();
        ImageIcon emailIcon = new ImageIcon(root+"auth_static\\email_icon.png"); // Replace with the path to your email icon image file
        EmailIconLabel.setIcon(emailIcon);
        EmailIconLabel.setBounds(10, 10, 20, 20); // Adjust the position and size as desired

        eyeTBtn = new JToggleButton();
        ImageIcon seeIcon = new ImageIcon(root+"auth_static\\SeeEye.png");
        eyeTBtn.setIcon(seeIcon);


        PasswordField1 = new JPasswordField();
        loginBtn = new JButton();
        forgotBtn = new JButton();
        signupLabel = new JLabel();
        signupBtn = new JButton();
        donateBtn = new JButton();

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


        // Add the EmailIconLabel to the email panel
        emailPanel.setLayout(null);
        emailPanel.add(EmailIconLabel);
        emailPanel.add(emailLabel);
        emailPanel.add(EmailTextField);

        EmailIconLabel.setBounds(480, 40, 30, 20);

        EmailTextField.setBounds(40, 42, 480, 20);

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
        PasswordField1.setBounds(20, 40, 450, 16);

        nirmulPanel.add(passwordPanel);
        passwordPanel.setBounds(75, 457, 525, 80);

//        loginBtn.putClientProperty("JButton.buttonType", "roundRect");
        loginBtn.setBackground(new Color(46, 204, 113));
        loginBtn.setFont(new Font("Inter", 1, 18));
        loginBtn.setForeground(new Color(255 , 255 , 255));
        loginBtn.setText("Login");
        UIManager.put("Button.arc", 15);
        nirmulPanel.add(loginBtn);
        loginBtn.setBounds(400, 575, 200, 60);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
				loginBtnActionPerformed(actionEvent);
            }
        });


        forgotBtn.setBackground(new Color(255, 238, 238));
        forgotBtn.setFont(new Font("Inter", 1, 16));
        forgotBtn.setForeground(new Color(255 , 87, 87));
        forgotBtn.setText("Forgot Password?");
//        forgotBtn.setBorder(null);
        nirmulPanel.add(forgotBtn);
        forgotBtn.setBounds(75, 575, 200, 60);
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

        eyeTBtn.setBorder(null);
        eyeTBtn.setBackground(new Color(234, 250, 241));
        eyeTBtn.setBounds(480, 40, 30, 20);
        eyeTBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                eyeTBtnActionPerformed(evt);
            }
        });
        passwordPanel.add(eyeTBtn);
        rememberMeCheckBox = new JCheckBox("Remember Me");
        rememberMeCheckBox.setBounds(75, 550, 150, 16);
//        nirmulPanel.add(rememberMeCheckBox);
        rememberMeCheckBox.setBackground(new Color(255, 255, 255));
        rememberMeCheckBox.setFont(new Font("Inter", Font.PLAIN, 12));

        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
				signupBtnActionPerformed(actionEvent);
            }
        });

        donateBtn.putClientProperty("JButton.buttonType", "roundRect");
        donateBtn.setBackground(new Color(46, 204, 113));
        donateBtn.setFont(new Font("Inter", 1, 14));
        donateBtn.setForeground(new Color(255, 255, 255));
        donateBtn.setText("Donate");
//        donateBtn.setBorder(null);
        nirmulPanel.add(donateBtn);
        donateBtn.setBounds(250, 290, 90, 40);
        donateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new Guest();
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

            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = mongoClient.getDatabase("nms_db");
            MongoCollection<Document> collection = database.getCollection("users_collection");

            //get username and password
			String email = EmailTextField.getText();
			String password = PasswordField1.getText();

            Document documents = collection.find(new Document("email", email)).first();

			//value from database
			String EmailFromDB = documents.getString("email");
			String PasswordFromDB = documents.getString("password");
			String userType = documents.getString("role");
            String userName = documents.getString("name");

			//Login validation
			//case 1  : if both username and password blanks
			if(email.equals("")&&password.equals("")){
				//if both null display messege
				JOptionPane.showMessageDialog(this,"Please Enter Email and Password");
			}
			else if (!(email.equals(""))&&password.equals("")){
				JOptionPane.showMessageDialog(this, "Please Enter Password");
			}
			else if ((email.equals(""))&&!(password.equals(""))){
				JOptionPane.showMessageDialog(this, "Please Enter Email");
			}
			else if ((email.equals(EmailFromDB))&&(password.equals(PasswordFromDB))){
				dispose();
				if (userType.equals("Admin")) {
					new AdminDashboard(0).setUserName(userName);
				} else if (userType.equals("Volunteer")) {
					new VolunteerDashboard().setUserName(userName);
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

        private void eyeTBtnActionPerformed(ActionEvent evt) {
            if (PasswordField1.getEchoChar() == '\u2022') {
                // Password is currently hidden, show it
                PasswordField1.setEchoChar((char) 0);

                // Set image icon for the eye button to show/hide icon
                ImageIcon hideIcon = new ImageIcon(root+"auth_static\\hideEye.png");
                eyeTBtn.setIcon(hideIcon);
            } else {
                // Password is currently shown, hide it
                PasswordField1.setEchoChar('\u2022');

                // Set image icon for the eye button to see icon
                ImageIcon seeIcon = new ImageIcon(root+"auth_static\\SeeEye.png");
                eyeTBtn.setIcon(seeIcon);
        }


    }

}
