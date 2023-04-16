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


public class ForgetPassword extends JFrame{
	
    private JPanel EmailPanel;
    private JTextField EmailTextField;
    private JLabel ForgetPassVerifyMsgLabel;
    private JPanel ForgotPasswordPanel;
    private JButton cancelBtn;
    private JLabel emailLabel;
    private JLabel emailLabel1;
    private JButton sendBtn;
	


    ForgetPassword(){
		
		        emailLabel = new JLabel();
        EmailPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\robin\\OneDrive\\Desktop\\Final Project\\Static\\signinPanel.png\\").getImage(), 0,0,getWidth(),getHeight(),null);
                }
            }
            ;
            EmailTextField = new JTextField();
            emailLabel1 = new JLabel();
            ForgotPasswordPanel =   new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(new ImageIcon("C:\\Users\\robin\\OneDrive\\Desktop\\Final Project\\Static\\forgetPassword_bg.png\\").getImage(), 0,0,getWidth(),getHeight(),null);
                    }
                }
                ;
                ForgetPassVerifyMsgLabel = new JLabel();
                cancelBtn = new JButton();
                sendBtn = new JButton();

                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setBackground(new Color(204, 255, 204));
                getContentPane().setLayout(null);

                emailLabel.setFont(new Font("Inter", 0, 12)); 
                emailLabel.setText("2023©NirmulFoundation");
                getContentPane().add(emailLabel);
                emailLabel.setBounds(534, 717, 140, 15);

                EmailPanel.setBackground(new Color(255, 255, 255));
                EmailPanel.setLayout(null);

                EmailTextField.setBackground(new Color(234,250,241));
                EmailTextField.setBorder(null);
                EmailPanel.add(EmailTextField);
                EmailTextField.setBounds(20, 40, 440, 40);

                emailLabel1.setFont(new Font("Inter", 0, 12)); 
                emailLabel1.setText("Email");
                EmailPanel.add(emailLabel1);
                emailLabel1.setBounds(20, 20, 30, 15);

                getContentPane().add(EmailPanel);
                EmailPanel.setBounds(75, 330, 480, 100);

                ForgotPasswordPanel.setBackground(new Color(255, 255, 255));
                ForgotPasswordPanel.setForeground(new Color(255, 255, 255));
                ForgotPasswordPanel.setFont(new Font("Inter", 0, 14));
                ForgotPasswordPanel.setRequestFocusEnabled(false);
                ForgotPasswordPanel.setLayout(null);

                ForgetPassVerifyMsgLabel.setFont(new Font("Inter", 0, 14));
                ForgetPassVerifyMsgLabel.setText("We will send a verification code in your email account, enter the code and create a new password");
                ForgotPasswordPanel.add(ForgetPassVerifyMsgLabel);
                ForgetPassVerifyMsgLabel.setBounds(80, 270, 640, 18);

                cancelBtn.setBackground(new Color(153, 255, 153));
                cancelBtn.setFont(new Font("Inter", 0, 18)); 
                cancelBtn.setForeground(new Color(255, 255, 255));
                cancelBtn.setText("Cancel");
                ForgotPasswordPanel.add(cancelBtn);
                cancelBtn.setBounds(450, 460, 100, 40);

                sendBtn.setBackground(new Color(153, 255, 153));
                sendBtn.setFont(new Font("Inter", 0, 18)); 
                sendBtn.setForeground(new Color(255, 255, 255));
                sendBtn.setText("Send");
                ForgotPasswordPanel.add(sendBtn);
                sendBtn.setBounds(75, 460, 100, 40);

                getContentPane().add(ForgotPasswordPanel);
                ForgotPasswordPanel.setBounds(0, 0, 1130, 700);

                
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
            new ForgetPassword();

        }


    }
