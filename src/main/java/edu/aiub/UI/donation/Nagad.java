package edu.aiub.UI.donation;

import edu.aiub.Static;
import edu.aiub.essentials.RandomOTP;
import edu.aiub.essentials.SendMail;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Nagad extends JFrame {
    final String root = Static.DONATION_ROOT;
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
    private String sender, method, fund;
    private int amount;


    public Nagad() {

    


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
		
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        jCheckBox1.setFont(new Font("Inter", Font.PLAIN, 14));
         add(jCheckBox1);
        jCheckBox1.setBounds(110, 562, 18, 14);
		
		
		box.setFont(new Font("Inter", Font.PLAIN, 14)); 
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
                if (jCheckBox1.isSelected() == false) {
                    JOptionPane.showMessageDialog(null, "Please agree to the terms and conditions");
                    return;
                }

                String nagadEmail = email.getText();
                String otp = String.valueOf(RandomOTP.generateOTP(4));
                String pin = String.valueOf(RandomOTP.generateOTP(6));
                dispose();
                Nagadotp nagadotp = new Nagadotp(otp, pin);
                nagadotp.AmountNumber.setText(Nagad.AmountNumber.getText());
                nagadotp.addTnx(sender, method, fund, amount);
                SendMail.sendMail(nagadEmail, "Nagad OTP", "Your Nagad OTP is " + otp + "\nYour Nagad pin is " + pin);
				}});

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        add(closebutton);
        closebutton.setBounds(330, 630, 100, 25);
		closebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				dispose();
				}});

 
        add(email);
        email.setBounds(70, 470, 450, 40);

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

        word.setFont(new Font("Inter", Font.PLAIN, 14)); 
        word.setForeground(new Color(255, 255, 255));
        word.setText("Your nagad account number");
        add(word);
        word.setBounds(190, 420, 210, 40);

        jLabel1.setIcon(new ImageIcon(Static.DONATION_ROOT+"nagad.png"));
        jLabel1.setText("jLabel1");
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
       
      new Nagad();
    }

               
}
