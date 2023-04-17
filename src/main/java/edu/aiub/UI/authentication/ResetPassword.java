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


public class ResetPassword extends JFrame{
    private String root = "src/main/java/edu/aiub/";
    private JLabel ConfirmPasswordLabel;
    private JPanel ConfirmPasswordPanel;
    private JPasswordField ConfirmPasswordPasswordField;
    private JLabel NewPasswordLabel;
    private JPasswordField NewPasswordPasswordField;
    private JPanel ResetPasswordPanel;
    private JButton SubmitBtn;
    private JPanel newPasswordPanel;
    public ResetPassword(){
        ResetPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "auth_static\\resetPassword_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        newPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        NewPasswordLabel = new JLabel();
        NewPasswordPasswordField = new JPasswordField();
        ConfirmPasswordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "auth_static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ConfirmPasswordLabel = new JLabel();
        ConfirmPasswordPasswordField = new JPasswordField();
        SubmitBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ResetPasswordPanel.setBackground(new Color(0, 0, 0));
        ResetPasswordPanel.setLayout(null);

        newPasswordPanel.setLayout(null);

        NewPasswordLabel.setBackground(new Color(61, 61, 61));
        NewPasswordLabel.setFont(new Font("Inter", 0, 12)); // NOI18N
        NewPasswordLabel.setText("NewPassword");
        newPasswordPanel.add(NewPasswordLabel);
        NewPasswordLabel.setBounds(20, 20, 170, 15);

        NewPasswordPasswordField.setBackground(new Color(234, 250, 241));
        NewPasswordPasswordField.setFont(new Font("Inter", 0, 14)); // NOI18N
        NewPasswordPasswordField.setText("jPasswordField1");
        NewPasswordPasswordField.setBorder(null);
        newPasswordPanel.add(NewPasswordPasswordField);
        NewPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(newPasswordPanel);
        newPasswordPanel.setBounds(75, 340, 480, 100);

        ConfirmPasswordPanel.setLayout(null);

        ConfirmPasswordLabel.setBackground(new Color(61, 61, 61));
        ConfirmPasswordLabel.setFont(new Font("Inter", 0, 12)); // NOI18N
        ConfirmPasswordLabel.setText("ConfirmPassword");
        ConfirmPasswordPanel.add(ConfirmPasswordLabel);
        ConfirmPasswordLabel.setBounds(20, 20, 180, 15);

        ConfirmPasswordPasswordField.setBackground(new Color(234, 250, 241));
        ConfirmPasswordPasswordField.setFont(new Font("Inter", 0, 14)); // NOI18N
        ConfirmPasswordPasswordField.setText("jPasswordField2");
        ConfirmPasswordPasswordField.setBorder(null);
        ConfirmPasswordPanel.add(ConfirmPasswordPasswordField);
        ConfirmPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(ConfirmPasswordPanel);
        ConfirmPasswordPanel.setBounds(75, 460, 480, 100);

        SubmitBtn.setBackground(new Color(46, 204, 113));
        SubmitBtn.setFont(new Font("Inter", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //SubmitBtnActionPerformed(evt);
            }
        });
        ResetPasswordPanel.add(SubmitBtn);
        SubmitBtn.setBounds(80, 590, 250, 60);

        getContentPane().add(ResetPasswordPanel);
        ResetPasswordPanel.setBounds(0, 0, 1200, 750);

		setTitle("NGO Management System");
        setResizable(false);
        setSize(1200,750);
        setIconImage(new ImageIcon(root+"static\\titleIcon.png").getImage());
        setLocationRelativeTo(null);
        setVisible(true);

        }

    }
