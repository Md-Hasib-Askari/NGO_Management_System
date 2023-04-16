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


public class Signin extends JFrame{
	private String root = "C:\\Users\\Robin\\Desktop\\Java Project\\";
	
    private JTextField EmailTextField;
    private JPasswordField PasswordField1;
    private JLabel emailLabel;
    private JPanel emailPanel;
    private JButton signupBtn;
    private JLabel signupLabel;
    private JButton loginBtn;
    private JPanel nirmulPanel;
    private JLabel passwordLabel;
    private JPanel passwordPanel;

    Signin(){

		nirmulPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"Static\\login_bg.png\\").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        emailPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        emailLabel = new JLabel();
        EmailTextField = new JTextField();
        passwordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+"Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        passwordLabel = new JLabel();
        PasswordField1 = new JPasswordField();
        loginBtn = new JButton();
        signupLabel = new JLabel();
        signupBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        nirmulPanel.setForeground(new Color(153, 153, 153)); //TestColor
        nirmulPanel.setLayout(null);

        emailPanel.setBackground(new Color(204, 255, 204)); //TestColor
        emailPanel.setLayout(null);

        emailLabel.setFont(new Font("Inter", Font.BOLD, 12));
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
        PasswordField1.setText("jPasswordField1");
        PasswordField1.setBorder(null);
        passwordPanel.add(PasswordField1);
        PasswordField1.setBounds(20, 40, 480, 16);

        nirmulPanel.add(passwordPanel);
        passwordPanel.setBounds(75, 457, 525, 80);

        loginBtn.setBackground(new Color(46, 204, 113));
        loginBtn.setFont(new Font("Inter", 1, 18));
        loginBtn.setForeground(new Color(255 , 255 , 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        nirmulPanel.add(loginBtn);
        loginBtn.setBounds(360, 575, 240, 60);

        signupLabel.setFont(new Font("Inter", 0, 14));
        signupLabel.setText("New to Nirmul? ");
        nirmulPanel.add(signupLabel);
        signupLabel.setBounds(80, 300, 110, 18);

        signupBtn.setBackground(new Color(46, 204, 113));
        signupBtn.setFont(new Font("Inter", 1, 14)); 
        signupBtn.setForeground(new Color(255,255,255));
        signupBtn.setText("Signup");
        signupBtn.setBorder(null);
        nirmulPanel.add(signupBtn);
        signupBtn.setBounds(190, 290, 90, 40);

        add(nirmulPanel);
        nirmulPanel.setBounds(0, 0, 1200, 750);

        pack();
		//setLocationRelativeTo(null);
		setTitle("NGO Management System");
		setIconImage(new ImageIcon(root+"Stack\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);


        }


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new Signin();

        }


    }
