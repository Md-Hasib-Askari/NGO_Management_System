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


public class ResetPassword extends JFrame{
    private String root = "C:\\Users\\Robin\\Desktop\\NIrmul Project\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1";
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JPanel ConfirmPasswordPanel;
    private javax.swing.JPasswordField ConfirmPasswordPasswordField;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JPasswordField NewPasswordPasswordField;
    private javax.swing.JPanel ResetPasswordPanel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JPanel newPasswordPanel;
    ResetPassword(){
        ResetPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "\\Static\\resetPassword_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        newPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "\\Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        NewPasswordLabel = new javax.swing.JLabel();
        NewPasswordPasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "\\Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ConfirmPasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordPasswordField = new javax.swing.JPasswordField();
        SubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ResetPasswordPanel.setBackground(new java.awt.Color(0, 0, 0));
        ResetPasswordPanel.setLayout(null);

        newPasswordPanel.setLayout(null);

        NewPasswordLabel.setBackground(new java.awt.Color(61, 61, 61));
        NewPasswordLabel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        NewPasswordLabel.setText("NewPassword");
        newPasswordPanel.add(NewPasswordLabel);
        NewPasswordLabel.setBounds(20, 20, 170, 15);

        NewPasswordPasswordField.setBackground(new java.awt.Color(234, 250, 241));
        NewPasswordPasswordField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        NewPasswordPasswordField.setText("jPasswordField1");
        NewPasswordPasswordField.setBorder(null);
        newPasswordPanel.add(NewPasswordPasswordField);
        NewPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(newPasswordPanel);
        newPasswordPanel.setBounds(75, 340, 480, 100);

        ConfirmPasswordPanel.setLayout(null);

        ConfirmPasswordLabel.setBackground(new java.awt.Color(61, 61, 61));
        ConfirmPasswordLabel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        ConfirmPasswordLabel.setText("ConfirmPassword");
        ConfirmPasswordPanel.add(ConfirmPasswordLabel);
        ConfirmPasswordLabel.setBounds(20, 20, 180, 15);

        ConfirmPasswordPasswordField.setBackground(new java.awt.Color(234, 250, 241));
        ConfirmPasswordPasswordField.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        ConfirmPasswordPasswordField.setText("jPasswordField2");
        ConfirmPasswordPasswordField.setBorder(null);
        ConfirmPasswordPanel.add(ConfirmPasswordPasswordField);
        ConfirmPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(ConfirmPasswordPanel);
        ConfirmPasswordPanel.setBounds(75, 460, 480, 100);

        SubmitBtn.setBackground(new java.awt.Color(46, 204, 113));
        SubmitBtn.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //SubmitBtnActionPerformed(evt);
            }
        });
        ResetPasswordPanel.add(SubmitBtn);
        SubmitBtn.setBounds(80, 590, 250, 60);

        getContentPane().add(ResetPasswordPanel);
        ResetPasswordPanel.setBounds(0, 0, 1200, 750);

        pack();
        
		setLocationRelativeTo(null);
		setTitle("NGO Management System");
		//setIconImage(new ImageIcon(root+"Static\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);


        }


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new ResetPassword();

        }


    }
