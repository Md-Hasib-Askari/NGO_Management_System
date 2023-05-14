package edu.aiub.UI.donation;

import edu.aiub.Static;
import edu.aiub.essentials.RandomOTP;
import edu.aiub.essentials.SendMail;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Bkash extends JFrame {
    String sender, method, fund;
    int amount;

	private JLabel Amount;
    private JButton closebutton;
    private JTextField email;
    public static JLabel AmountNumber;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel marchant;
    private JLabel marchantname;
    private JButton probutton;
    private JLabel word;
    private JLabel box;

    
    public Bkash() {

        jCheckBox1 = new JCheckBox();
        probutton = new JButton();
        closebutton = new JButton();
        email = new JTextField();
        marchant = new JLabel();
        marchantname = new JLabel();
        Amount = new JLabel();
        AmountNumber = new JLabel();
        word = new JLabel();
        jLabel1 = new JLabel();
        box = new JLabel();
		
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        jCheckBox1.setFont(new Font("Inter", Font.BOLD, 14));
       
         add(jCheckBox1);
        jCheckBox1.setBounds(110, 562, 18, 14);
		
		
		box.setFont(new Font("Inter", Font.BOLD, 14)); 
        box.setForeground(new Color(255, 255, 255));
        box.setText("I agree to the terms and conditions");
        add(box);
        box.setBounds(140, 560, 310, 22);

        probutton.setFont(new Font("Inter", Font.PLAIN, 14));
        probutton.setText("PROCEED");
        add(probutton);
        probutton.setBounds(150, 630, 100, 25);
		probutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                String bkashEmail = email.getText();
                String otp = String.valueOf(RandomOTP.generateOTP(4));
                String pin = String.valueOf(RandomOTP.generateOTP(6));
                dispose();
                Bkashotp bkashotp = new Bkashotp(otp, pin);
                bkashotp.AmountNumber.setText(Bkash.AmountNumber.getText());
                bkashotp.addTnx(sender, method, fund, amount);
                SendMail.sendMail(bkashEmail, "bKash OTP", "Your bKash OTP is " + otp + "\nYour bKash pin is " + pin);
            }});

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        add(closebutton);
        closebutton.setBounds(330, 630, 100, 25);
		closebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				    dispose();
            }
        });

 
        add(email);
        email.setBounds(70, 470, 450, 40);

        marchant.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchant.setForeground(new Color(255, 255, 255));
        marchant.setText("Merchant          :");
        add(marchant);
        marchant.setBounds(160, 210, 120, 30);

        marchantname.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchantname.setForeground(new Color(255, 255, 255));
        marchantname.setText("NIRMUL FOUNDATION");
        add(marchantname);
        marchantname.setBounds(290, 220, 190, 18);

        Amount.setFont(new Font("Inter", Font.BOLD, 14)); 
        Amount.setForeground(new Color(255, 255, 255));
		Amount.setText("Amount             :");
         add(Amount);
        Amount.setBounds(160, 260, 120, 18);


	   AmountNumber.setBorder(null);
		   AmountNumber.setFont(new Font("Inter", Font.BOLD, 14));
		 AmountNumber.setForeground(new Color(255, 255, 255));
        add(AmountNumber);
        AmountNumber.setBounds(300, 260, 100, 18);

        word.setFont(new Font("Inter", Font.PLAIN, 14)); 
        word.setForeground(new Color(255, 255, 255));
        word.setText("Your bKash email");
        add(word);
        word.setBounds(190, 420, 210, 40);

        jLabel1.setIcon(new ImageIcon(Static.DONATION_ROOT+"bKashPayment_bg .png"));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 800);

        pack();
		setSize(615, 800);
        setLocationRelativeTo(null);
        setResizable(false);
		setVisible(true);
    }

    public void addTnx(String sender, String method, String fund, int amount) {
        this.sender = sender;
        this.method = method;
        this.fund = fund;
        this.amount = amount;
    }
   

    public static void main(String args[]) {
       
      new Bkash();
    }

               
}
