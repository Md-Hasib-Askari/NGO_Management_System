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
import javax.swing.event.*;
import javax.swing.event.DocumentListener;
import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

//C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\

public class VerifyAccount extends JFrame{
	private String root = "C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\";
	
    private JTextField Code1txtF;
    private JTextField Code2txtF;
    private JTextField Code3txtF;
    private JTextField Code4txtF;
    private JPanel CodePanel1;
    private JPanel CodePanel2;
    private JPanel CodePanel3;
    private JPanel CodePanel4;
    private JButton SubmitBtn;
    private JLabel verifyAccountLabel;
    private JPanel verifyAccountPanel;
	
    VerifyAccount(){

	          verifyAccountPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\robin\\OneDrive\\Desktop\\Java Project\\Static\\verifyAccount_bg.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        CodePanel1 = new javax.swing.JPanel();
        Code1txtF = new javax.swing.JTextField();
        CodePanel2 = new javax.swing.JPanel();
        Code2txtF = new javax.swing.JTextField();
        CodePanel3 = new javax.swing.JPanel();
        Code3txtF = new javax.swing.JTextField();
        CodePanel4 = new javax.swing.JPanel();
        Code4txtF = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        verifyAccountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        verifyAccountPanel.setBackground(new java.awt.Color(204, 204, 204));
        verifyAccountPanel.setLayout(null);

        CodePanel1.setBackground(new java.awt.Color(234, 250, 241));
        CodePanel1.setFont(new java.awt.Font("Inter", 0, 12));
        CodePanel1.setLayout(null);

        Code1txtF.setBackground(new java.awt.Color(234, 250, 241));
        Code1txtF.setFont(new java.awt.Font("Inter", 0, 55)); 
        Code1txtF.setBorder(null);
        CodePanel1.add(Code1txtF);
        Code1txtF.setBounds(6, 6, 88, 88);
		Code1txtF.setHorizontalAlignment(JTextField.CENTER);
		
	
		Code1txtF.getDocument().addDocumentListener(new DocumentListener() {
		@Override
		public void insertUpdate(DocumentEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
           
            if (Code1txtF.getText().length() > 1) {
                Code1txtF.setText(Code1txtF.getText().substring(0, 1));
					}
				}
			});
		}

			@Override
		public void removeUpdate(DocumentEvent e) {}

		@Override
		public void changedUpdate(DocumentEvent e) {}
		});
  

	

        verifyAccountPanel.add(CodePanel1);
        CodePanel1.setBounds(75, 400, 100, 100);

        CodePanel2.setBackground(new java.awt.Color(234, 250, 241));
        CodePanel2.setLayout(null);

        Code2txtF.setBackground(new java.awt.Color(234, 250, 241));
        Code2txtF.setFont(new java.awt.Font("Inter", 0, 55)); 
        Code2txtF.setBorder(null);
        CodePanel2.add(Code2txtF);
        Code2txtF.setBounds(6, 6, 88, 88);
		Code2txtF.setHorizontalAlignment(JTextField.CENTER);
		Code2txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Code2txtFActionPerformed(evt);
            }
        });
		
		
		//Code2txtF
			Code2txtF.getDocument().addDocumentListener(new DocumentListener() {
		@Override
		public void insertUpdate(DocumentEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          
            if (Code2txtF.getText().length() > 1) {
                Code2txtF.setText(Code2txtF.getText().substring(0, 1));
					}
				}
			});
		}

			@Override
		public void removeUpdate(DocumentEvent e) {}

		@Override
		public void changedUpdate(DocumentEvent e) {}
		});
 
 
 
        verifyAccountPanel.add(CodePanel2);
        CodePanel2.setBounds(220, 400, 100, 100);

        CodePanel3.setBackground(new java.awt.Color(234, 250, 241));
        CodePanel3.setLayout(null);

        Code3txtF.setBackground(new java.awt.Color(234, 250, 241));
        Code3txtF.setFont(new java.awt.Font("Inter", 0, 55)); // NOI18N
        Code3txtF.setBorder(null);
		Code3txtF.setHorizontalAlignment(JTextField.CENTER);
        Code3txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Code3txtFActionPerformed(evt);
            }
        });
		
		CodePanel3.add(Code3txtF);
        Code3txtF.setBounds(6, 6, 88, 88);
		
		
		
		
		Code3txtF.getDocument().addDocumentListener(new DocumentListener() {
		@Override
		public void insertUpdate(DocumentEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            
            if (Code3txtF.getText().length() > 1) {
                Code3txtF.setText(Code3txtF.getText().substring(0, 1));
					}
				}
			});
		}

			@Override
		public void removeUpdate(DocumentEvent e) {}

		@Override
		public void changedUpdate(DocumentEvent e) {}
		});

		

        verifyAccountPanel.add(CodePanel3);
        CodePanel3.setBounds(365, 400, 100, 100);

        CodePanel4.setBackground(new java.awt.Color(234, 250, 241));
        CodePanel4.setLayout(null);

        Code4txtF.setBackground(new java.awt.Color(234, 250, 241));
        Code4txtF.setFont(new java.awt.Font("Inter", 0, 55)); // NOI18N
        Code4txtF.setBorder(null);
        CodePanel4.add(Code4txtF);
        Code4txtF.setBounds(6, 6, 88, 88);
		Code4txtF.setHorizontalAlignment(JTextField.CENTER);
		Code4txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               //Code4txtFActionPerformed(evt);
            }
        });
			
		
		Code4txtF.getDocument().addDocumentListener(new DocumentListener() {
		@Override
		public void insertUpdate(DocumentEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            
            if (Code4txtF.getText().length() > 1) {
                Code4txtF.setText(Code4txtF.getText().substring(0, 1));
					}
				}
			});
		}

			@Override
		public void removeUpdate(DocumentEvent e) {}

		@Override
		public void changedUpdate(DocumentEvent e) {}
		});


        verifyAccountPanel.add(CodePanel4);
        CodePanel4.setBounds(510, 400, 100, 100);

        SubmitBtn.setBackground(new java.awt.Color(46, 204, 113));
        SubmitBtn.setFont(new java.awt.Font("Inter", 1, 24));
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(null);
        verifyAccountPanel.add(SubmitBtn);
        SubmitBtn.setBounds(75, 590, 250, 60);

        verifyAccountLabel.setFont(new java.awt.Font("Inter", 0, 14)); 
        verifyAccountLabel.setText("We've sent an OTP to to your Email, submit the 4 digit code here to verify your account.");
        verifyAccountPanel.add(verifyAccountLabel);
        verifyAccountLabel.setBounds(75, 340, 660, 18);

        getContentPane().add(verifyAccountPanel);
        verifyAccountPanel.setBounds(0, 0, 1200, 750);

        pack();


			
		setTitle("NGO Management System");
		setIconImage(new ImageIcon(root+"Stack\\titleIcon").getImage());
        setVisible(true);
        setResizable(false);
        setSize(1200,750);
		setLocationRelativeTo(null);

        }


        public static void main (String[] args){
            System.setProperty("sun.java2d.uiScale", "1.0");
            new VerifyAccount();

        }


    }
