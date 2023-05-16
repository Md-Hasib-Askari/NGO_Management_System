package edu.aiub.UI.authentication;

import com.mongodb.client.model.Filters;
import edu.aiub.database.DatabaseConnectivity;
import org.bson.Document;

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
    private String email;
    private String root = "src/main/java/edu/aiub/";
    private JLabel ConfirmPasswordLabel;
    private JPanel ConfirmPasswordPanel;
    private JPasswordField ConfirmPasswordPasswordField;
    private JLabel NewPasswordLabel;
    private JPasswordField NewPasswordPasswordField;
    private JPanel ResetPasswordPanel;
    private JButton SubmitBtn;
    private JPanel newPasswordPanel;

    private JToggleButton toggleNewPasswordBtn;
    private JToggleButton toggleConfirmPasswordBtn;

    public ResetPassword(String email){
        this.email = email;

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

        toggleNewPasswordBtn = new JToggleButton();
        toggleConfirmPasswordBtn = new JToggleButton();

        ImageIcon seeIcon1 = new ImageIcon(root + "auth_static\\SeeEye.png");
        ImageIcon seeIcon2 = new ImageIcon(root + "auth_static\\SeeEye.png");

        toggleNewPasswordBtn.setIcon(seeIcon1); // Change from setIcon1 to setIcon
        toggleConfirmPasswordBtn.setIcon(seeIcon2); // Change from setIcon2 to setIcon



        newPasswordPanel.add(toggleNewPasswordBtn);
        ConfirmPasswordPanel.add(toggleConfirmPasswordBtn);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ResetPasswordPanel.setBackground(new Color(0, 0, 0));
        ResetPasswordPanel.setLayout(null);

        newPasswordPanel.setLayout(null);

        NewPasswordLabel.setBackground(new Color(61, 61, 61));
        NewPasswordLabel.setFont(new Font("Inter", 0, 12)); // NOI18N
        NewPasswordLabel.setText("New Password");
        newPasswordPanel.add(NewPasswordLabel);
        NewPasswordLabel.setBounds(20, 20, 170, 15);

        NewPasswordPasswordField.setBackground(new Color(234, 250, 241));
        NewPasswordPasswordField.setFont(new Font("Inter", 0, 14)); // NOI18N
        NewPasswordPasswordField.setBorder(null);
        newPasswordPanel.add(NewPasswordPasswordField);
        NewPasswordPasswordField.setBounds(20, 50, 380, 40);

        ResetPasswordPanel.add(newPasswordPanel);
        newPasswordPanel.setBounds(75, 340, 480, 100);

        ConfirmPasswordPanel.setLayout(null);

        ConfirmPasswordLabel.setBackground(new Color(61, 61, 61));
        ConfirmPasswordLabel.setFont(new Font("Inter", 0, 12)); // NOI18N
        ConfirmPasswordLabel.setText("Confirm Password");
        ConfirmPasswordPanel.add(ConfirmPasswordLabel);
        ConfirmPasswordLabel.setBounds(20, 20, 180, 15);

        ConfirmPasswordPasswordField.setBackground(new Color(234, 250, 241));
        ConfirmPasswordPasswordField.setFont(new Font("Inter", 0, 14)); // NOI18N
        ConfirmPasswordPasswordField.setBorder(null);
        ConfirmPasswordPanel.add(ConfirmPasswordPasswordField);
        ConfirmPasswordPasswordField.setBounds(20, 50, 380, 40);

        ConfirmPasswordPanel.add(toggleConfirmPasswordBtn);

        ResetPasswordPanel.add(ConfirmPasswordPanel);
        ConfirmPasswordPanel.setBounds(75, 460, 480, 100);

        SubmitBtn.setBackground(new Color(46, 204, 113));
        SubmitBtn.setFont(new Font("Inter", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        // Set properties for toggleNewPasswordBtn
        toggleNewPasswordBtn.setBorder(null);
        toggleNewPasswordBtn.setBackground(new Color(234, 250, 241));
        toggleNewPasswordBtn.setBounds(430, 50, 24, 24);
        toggleNewPasswordBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                toggleNewPasswordBtnActionPerformed(evt);
            }
        });
        newPasswordPanel.add(toggleNewPasswordBtn);

        // Set properties for toggleConfirmPasswordBtn
        toggleConfirmPasswordBtn.setBorder(null);
        toggleConfirmPasswordBtn.setBackground(new Color(234, 250, 241));
        toggleConfirmPasswordBtn.setBounds(430, 50, 24, 24);
        toggleConfirmPasswordBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                toggleConfirmPasswordBtnActionPerformed(evt);
            }
        });
        ConfirmPasswordPanel.add(toggleConfirmPasswordBtn);

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

    private void SubmitBtnActionPerformed(ActionEvent evt) {
        if (NewPasswordPasswordField.getText().equals("") || ConfirmPasswordPasswordField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill up all the fields");
        }
        else if (NewPasswordPasswordField.getText().equals(ConfirmPasswordPasswordField.getText())){
            passwordReset(email, NewPasswordPasswordField.getText());
            JOptionPane.showMessageDialog(null, "Password Reset Successful");
            new Signin();
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Password Mismatch");
    }

    private void passwordReset(String email, String password){
        DatabaseConnectivity db = new DatabaseConnectivity("users") {
            @Override
            public void add(Object[] column) {

            }

            @Override
            public void update(int id, Object[] column) {

            }
        };

        db.collection.find().forEach((Document doc) -> {
            if (doc.get("email").equals(email)){
                doc.put("password", password);
                db.collection.replaceOne(Filters.eq("email", email), doc);
            }
        });
        db.mongoClient.close();
    }

    private void toggleNewPasswordBtnActionPerformed(ActionEvent evt) {
        if (NewPasswordPasswordField.getEchoChar() == '\u2022') {
            // Password is currently hidden, show it
            NewPasswordPasswordField.setEchoChar((char) 0);

            // Set image icon for the toggleNewPasswordBtn to hide icon
            ImageIcon hideIcon = new ImageIcon(root + "auth_static\\HideEye.png");
            toggleNewPasswordBtn.setIcon(hideIcon);
        } else {
            // Password is currently shown, hide it
            NewPasswordPasswordField.setEchoChar('\u2022');

            // Set image icon for the toggleNewPasswordBtn to see icon
            ImageIcon seeIcon = new ImageIcon(root + "auth_static\\SeeEye.png");
            toggleNewPasswordBtn.setIcon(seeIcon);
        }
    }

    private void toggleConfirmPasswordBtnActionPerformed(ActionEvent evt) {
        if (ConfirmPasswordPasswordField.getEchoChar() == '\u2022') {
            // Password is currently hidden, show it
            ConfirmPasswordPasswordField.setEchoChar((char) 0);

            // Set image icon for the toggleConfirmPasswordBtn to hide icon
            ImageIcon hideIcon = new ImageIcon(root + "auth_static\\HideEye.png");
            toggleConfirmPasswordBtn.setIcon(hideIcon);
        } else {
            // Password is currently shown, hide it
            ConfirmPasswordPasswordField.setEchoChar('\u2022');

            // Set image icon for the toggleConfirmPasswordBtn to see icon
            ImageIcon seeIcon = new ImageIcon(root + "auth_static\\SeeEye.png");
            toggleConfirmPasswordBtn.setIcon(seeIcon);
        }
    }

}
