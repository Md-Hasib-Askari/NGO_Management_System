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
    private String root = "C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\";
    private JLabel ConfirmPasswordLabel;
    private JPanel ConfirmPasswordPanel;
    private JPasswordField ConfirmPasswordPasswordField;
    private JLabel NewPasswordLabel;
    private JPasswordField NewPasswordPasswordField;
    private JPanel ResetPasswordPanel;
    private JButton SubmitBtn;
    private JPanel newPasswordPanel;
    ResetPassword(){
        ResetPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "Static\\resetPassword_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        newPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        NewPasswordLabel = new JLabel();
        NewPasswordPasswordField = new JPasswordField();
        ConfirmPasswordPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root+ "Static\\signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
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
        NewPasswordLabel.setFont(new Font("Inter", 0, 12)); 
        NewPasswordLabel.setText("NewPassword");
        newPasswordPanel.add(NewPasswordLabel);
        NewPasswordLabel.setBounds(20, 20, 170, 15);

        NewPasswordPasswordField.setBackground(new Color(234, 250, 241));
        NewPasswordPasswordField.setFont(new Font("Inter", 0, 14)); 
        NewPasswordPasswordField.setText("jPasswordField1");
        NewPasswordPasswordField.setBorder(null);
        newPasswordPanel.add(NewPasswordPasswordField);
        NewPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(newPasswordPanel);
        newPasswordPanel.setBounds(75, 340, 480, 100);

        ConfirmPasswordPanel.setLayout(null);

        ConfirmPasswordLabel.setBackground(new Color(61, 61, 61));
        ConfirmPasswordLabel.setFont(new Font("Inter", 0, 12)); 
        ConfirmPasswordLabel.setText("ConfirmPassword");
        ConfirmPasswordPanel.add(ConfirmPasswordLabel);
        ConfirmPasswordLabel.setBounds(20, 20, 180, 15);

        ConfirmPasswordPasswordField.setBackground(new Color(234, 250, 241));
        ConfirmPasswordPasswordField.setFont(new Font("Inter", 0, 14)); 
        ConfirmPasswordPasswordField.setText("jPasswordField2");
        ConfirmPasswordPasswordField.setBorder(null);
        ConfirmPasswordPanel.add(ConfirmPasswordPasswordField);
        ConfirmPasswordPasswordField.setBounds(20, 50, 440, 40);

        ResetPasswordPanel.add(ConfirmPasswordPanel);
        ConfirmPasswordPanel.setBounds(75, 460, 480, 100);

        SubmitBtn.setBackground(new Color(46, 204, 113));
        SubmitBtn.setFont(new Font("Inter", 1, 18)); 
        SubmitBtn.setForeground(new Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        SubmitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        ResetPasswordPanel.add(SubmitBtn);
        SubmitBtn.setBounds(75, 575, 240, 60);

        getContentPane().add(ResetPasswordPanel);
        ResetPasswordPanel.setBounds(0, 0, 1200, 750);

        pack();
        
		
		setTitle("NGO Management System");
		//setIconImage(new ImageIcon(root+"Static\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);
		setLocationRelativeTo(null);

        }
		
		
		
		private void SubmitBtnActionPerformed(ActionEvent evt) {                                            
		// Get input values from text fields
			String newPassword = NewPasswordPasswordField.getText();
			String confirmNewPassword = ConfirmPasswordPasswordField.getText();

		// Constants from database
			String emailFromDB = "abcd@gmail.com";
			String oldPasswordFromDB = "12345678";
			String newPasswordFromDB = "87654321";

		// Check if any fields are empty
			if (newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please fill in all fields.");
			} else {
        // Check if new password and confirm new password match
			if (newPassword.equals(confirmNewPassword)) {
            // New password and confirm new password match, update password in database
            oldPasswordFromDB = newPasswordFromDB;
            JOptionPane.showMessageDialog(this, "Password updated successfully.");
			
			    // Close the current frame
					dispose();
    
				// Create a new instance of the signupBtn class
				//signupBtn signupBtn = new signupBtn();
				// Display the sign-in form to the user
					//signupBtn.setVisible(true);
					new Signin();
	
			
			
			} else {
            // New password and confirm new password do not match, display error message
            JOptionPane.showMessageDialog(this, "New password and confirm new password do not match.");
        }
    }
}

		


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new ResetPassword();

        }


    }
