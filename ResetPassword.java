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


public class ResetPassword extends JFrame {
    private String root = "C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\";

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


    ResetPassword() {
        ResetPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\resetPassword_bg.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        ;

        newPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        ;

        NewPasswordLabel = new JLabel();
        NewPasswordPasswordField = new JPasswordField();

        ConfirmPasswordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        ConfirmPasswordLabel = new JLabel();
        ConfirmPasswordPasswordField = new JPasswordField();

        SubmitBtn = new JButton();
		
	
		
		toggleNewPasswordBtn = new JToggleButton();
		toggleConfirmPasswordBtn = new JToggleButton();

		ImageIcon seeIcon1 = new ImageIcon(root + "Static\\SeeEye.png");
		ImageIcon seeIcon2 = new ImageIcon(root + "Static\\SeeEye.png");

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
        NewPasswordLabel.setFont(new Font("Inter", 0, 12));
        NewPasswordLabel.setText("NewPassword");
        newPasswordPanel.add(NewPasswordLabel);
        NewPasswordLabel.setBounds(20, 15, 170, 15);

        NewPasswordPasswordField.setBackground(new Color(234, 250, 241));
        NewPasswordPasswordField.setFont(new Font("Inter", 0, 14));
        NewPasswordPasswordField.setText("");
        NewPasswordPasswordField.setBorder(null);
        newPasswordPanel.add(NewPasswordPasswordField);
        NewPasswordPasswordField.setBounds(20, 50, 370, 30);

        newPasswordPanel.add(toggleNewPasswordBtn);

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
        ConfirmPasswordPasswordField.setText("");
        ConfirmPasswordPasswordField.setBorder(null);
        ConfirmPasswordPanel.add(ConfirmPasswordPasswordField);
        ConfirmPasswordPasswordField.setBounds(20, 50, 370, 30);

        ConfirmPasswordPanel.add(toggleConfirmPasswordBtn);

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
        SubmitBtn.setBounds(75, 575, 240, 60);

        getContentPane().add(ResetPasswordPanel);
        ResetPasswordPanel.setBounds(0, 0, 1200, 750);

        pack();

        setTitle("NGO Management System");
        setVisible(true);
        setResizable(false);
        setSize(1200, 750);
        setLocationRelativeTo(null);
		
	}
	
	
		private void toggleNewPasswordBtnActionPerformed(ActionEvent evt) {
			if (NewPasswordPasswordField.getEchoChar() == '\u2022') {
					// Password is currently hidden, show it
					NewPasswordPasswordField.setEchoChar((char) 0);
	
					// Set image icon for the toggleNewPasswordBtn to hide icon
        ImageIcon hideIcon = new ImageIcon(root + "Static\\HideEye.png");
        toggleNewPasswordBtn.setIcon(hideIcon);
			} else {
        // Password is currently shown, hide it
        NewPasswordPasswordField.setEchoChar('\u2022');

        // Set image icon for the toggleNewPasswordBtn to see icon
        ImageIcon seeIcon = new ImageIcon(root + "Static\\SeeEye.png");
        toggleNewPasswordBtn.setIcon(seeIcon);
			}
		}

		private void toggleConfirmPasswordBtnActionPerformed(ActionEvent evt) {
			if (ConfirmPasswordPasswordField.getEchoChar() == '\u2022') {
        // Password is currently hidden, show it
        ConfirmPasswordPasswordField.setEchoChar((char) 0);

        // Set image icon for the toggleConfirmPasswordBtn to hide icon
        ImageIcon hideIcon = new ImageIcon(root + "Static\\HideEye.png");
        toggleConfirmPasswordBtn.setIcon(hideIcon);
			} else {
        // Password is currently shown, hide it
        ConfirmPasswordPasswordField.setEchoChar('\u2022');

        // Set image icon for the toggleConfirmPasswordBtn to see icon
        ImageIcon seeIcon = new ImageIcon(root + "Static\\SeeEye.png");
        toggleConfirmPasswordBtn.setIcon(seeIcon);
			}
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

                // Create a new instance of the Signin class
                new Signin();
            } else {
                // New password and confirm new password do not match, display error message
                JOptionPane.showMessageDialog(this, "New password and confirm new password do not match.");
				}
			}
		}



			public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
            System.setProperty("sun.java2d.uiScale", "1.0");
            new ResetPassword();
				});
			}
		}