import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;


public class Signin extends JFrame {
	
	
    private String root = "C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\";
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
    private JToggleButton eyeTBtn;
	private JCheckBox rememberMeCheckBox;

	private JLabel EmailIconLabel;

    Signin() {
		
		
        nirmulPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\login_bg.png\\").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        emailPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        emailLabel = new JLabel();
        EmailTextField = new JTextField();
        passwordPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(root + "Static\\signinPanel.png").getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

		
		
		EmailIconLabel = new JLabel();
		ImageIcon emailIcon = new ImageIcon(root+"Static\\email_icon.png");
		EmailIconLabel.setIcon(emailIcon);
		EmailIconLabel.setBounds(10, 10, 20, 20);

        passwordLabel = new JLabel();
		PasswordField1 = new JPasswordField();
	

        loginBtn = new JButton();
        signupLabel = new JLabel();
        signupBtn = new JButton();
        eyeTBtn = new JToggleButton();
		ImageIcon seeIcon = new ImageIcon(root+"Static\\SeeEye.png");
		eyeTBtn.setIcon(seeIcon);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        nirmulPanel.setForeground(new Color(153, 153, 153));
        nirmulPanel.setLayout(null);

        emailPanel.setBackground(new Color(204, 255, 204));
        emailPanel.setLayout(null);

        emailLabel.setFont(new Font("Inter", 0, 12));
        emailLabel.setText("Email");
        emailPanel.add(emailLabel);
        emailLabel.setBounds(20, 10, 70, 20);
		
	
		emailPanel.setLayout(null);
		emailPanel.add(EmailIconLabel);
		EmailIconLabel.setBounds(480, 40, 30, 20);
		emailPanel.add(emailLabel);

		emailPanel.add(EmailTextField);
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

        passwordPanel.setBackground(new Color(204, 255, 204));
        passwordPanel.setLayout(null);

        passwordLabel.setFont(new Font("Inter", 0, 12));
        passwordLabel.setText("Password");
        passwordPanel.add(passwordLabel);
        passwordLabel.setBounds(20, 10, 70, 20);

        PasswordField1.setBackground(new Color(234, 250, 241));
		PasswordField1.setText("");
        PasswordField1.setText("");
        PasswordField1.setBorder(null);
        passwordPanel.add(PasswordField1);
        PasswordField1.setBounds(20, 40, 450, 16);

        nirmulPanel.add(passwordPanel);
        passwordPanel.setBounds(75, 457, 525, 80);

        loginBtn.setBackground(new Color(46, 204, 113));
        loginBtn.setFont(new Font("Inter", 1, 18));
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        nirmulPanel.add(loginBtn);
        loginBtn.setBounds(360, 575, 240, 60);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });





        signupLabel.setFont(new Font("Inter", 0, 14));
        signupLabel.setText("New to Nirmul? ");
        nirmulPanel.add(signupLabel);
        signupLabel.setBounds(80, 300, 110, 18);

        signupBtn.setBackground(new Color(255, 255, 255));
        signupBtn.setFont(new Font("Inter", 1, 14));
        signupBtn.setForeground(new Color(46, 204, 113));
        signupBtn.setText("Signup");
        signupBtn.setBorder(null);
        nirmulPanel.add(signupBtn);
        signupBtn.setBounds(185, 284, 50, 50);
        signupBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        add(nirmulPanel);
        nirmulPanel.setBounds(0, 0, 1200, 750);
		
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
		nirmulPanel.add(rememberMeCheckBox);
		rememberMeCheckBox.setBackground(new Color(255, 255, 255));
		rememberMeCheckBox.setFont(new Font("Inter", Font.PLAIN, 12));
		
		
		

        setTitle("NGO Management System");
        // setIconImage(new ImageIcon(root + "Stack\\titleIcon.png").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200, 750);
        setLocationRelativeTo(null);
    }

		private void eyeTBtnActionPerformed(ActionEvent evt) {
			if (PasswordField1.getEchoChar() == '\u2022') {
		// Password is currently hidden, show it
		PasswordField1.setEchoChar((char) 0);

        // Set image icon for the eye button to show/hide icon
        ImageIcon hideIcon = new ImageIcon(root+"Static\\hideEye.png");
        eyeTBtn.setIcon(hideIcon);
			} else {
        // Password is currently shown, hide it
        PasswordField1.setEchoChar('\u2022');

        // Set image icon for the eye button to see icon
        ImageIcon seeIcon = new ImageIcon(root+"Static\\SeeEye.png");
        eyeTBtn.setIcon(seeIcon);
			}
	
	
		}
	

		private void jButton1ActionPerformed(ActionEvent evt) {
		String email = EmailTextField.getText();
		String passWord = PasswordField1.getText();
		String EmailFromDB = "abcd@gmail.com";
		String PasswordFromDB = "12345678";
		boolean rememberMe = rememberMeCheckBox.isSelected();
	
	    if (rememberMe) {
        // Store the login credentials securely for future sessions
		}
	
		if ((email.equals(EmailFromDB)) && (passWord.equals(PasswordFromDB))) {
			dispose();
			new VerifyAccount();
		} else {
			JOptionPane.showMessageDialog(this, "Invalid email or password. Please try again.");
		}
	}

	private boolean validateEmail(String email) {
        // Regular expression for email format validation
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private boolean validatePassword(String password) {
        // Define your criteria for password validation
        int minLength = 8; // Minimum length requirement
        return password.length() >= minLength;
    }

    private void signInBtnActionPerformed(ActionEvent evt) {
        String email = EmailTextField.getText();
        String password = new String(PasswordField1.getPassword());

        if (!validateEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format");
            return;
        }

        if (!validatePassword(password)) {
            JOptionPane.showMessageDialog(this, "Password should be at least 8 characters long");
            return;
        }

      
    }


    private void signupBtnActionPerformed(ActionEvent evt) {
        dispose();
        new CreateAccount();
    }


    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        new Signin();
		}
	}
