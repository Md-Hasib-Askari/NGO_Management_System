package edu.aiub.UI.donation;

import edu.aiub.Static;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Nagadotp extends JFrame {

	private JLabel Amount;
    private JButton closebutton;
    private JPasswordField email;
    public static JLabel AmountNumber;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel marchant;
    private JLabel marchantname;
    private JButton probutton;
    private JLabel word;
    private JLabel box;

    
    public Nagadotp() {

    


        jCheckBox1 = new JCheckBox();
        probutton = new JButton();
        closebutton = new JButton();
        email = new JPasswordField();
        marchant = new JLabel();
        marchantname = new JLabel();
        Amount = new JLabel();
        AmountNumber = new JLabel();
        word = new JLabel();
        jLabel1 = new JLabel();
        box = new JLabel();
		
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

    

        probutton.setFont(new Font("Inter", Font.PLAIN, 14));
        probutton.setText("PROCEED");
        probutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String otp = email.getText();
                if (otp.equals("1234")){
                    dispose();
                    new Nagapin().AmountNumber.setText(Nagad.AmountNumber.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong OTP");
                }
            }
        });
        add(probutton);
        probutton.setBounds(150, 630, 100, 25);

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });
        add(closebutton);
        closebutton.setBounds(300, 630, 100, 25);

 
        add(email);
        email.setBounds(175, 520, 200, 30);

           marchant.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchant.setForeground(new Color(255, 255, 255));
        marchant.setText("Merchant          :");
        add(marchant);
        marchant.setBounds(160, 320, 120, 30);

        marchantname.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchantname.setForeground(new Color(255, 255, 255));
        marchantname.setText("NIRMUL FOUNDATION");
        add(marchantname);
        marchantname.setBounds(290, 325, 190, 18);

        Amount.setFont(new Font("Inter", Font.BOLD, 14)); 
        Amount.setForeground(new Color(255, 255, 255));
        Amount.setText("Amount             :");
         add(Amount);
        Amount.setBounds(160, 380, 120, 18);

   
		   AmountNumber.setFont(new Font("Inter", Font.BOLD, 14));
		 AmountNumber.setForeground(new Color(255, 255, 255));
        add(AmountNumber);
        AmountNumber.setBounds(300, 380, 100, 18);
        word.setFont(new Font("Inter", Font.BOLD, 14)); 
        word.setForeground(new Color(255, 255, 255));
        word.setText("Enter your OTP ");
        add(word);
        word.setBounds(210, 465, 210, 40);

        jLabel1.setIcon(new ImageIcon(Static.DONATION_ROOT+"nagad.png"));
        
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 800);

        pack();
		setSize(615, 800);
		setResizable(false);
		setVisible(true);
    }                      

   

    public static void main(String args[]) {
       
      new Nagadotp();
    }

               
}
