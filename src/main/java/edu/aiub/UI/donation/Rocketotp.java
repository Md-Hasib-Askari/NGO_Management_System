package edu.aiub.UI.donation;

import edu.aiub.Static;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Rocketotp extends JFrame {
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
    private String sender, method, fund;
    private int amount;

    
    public Rocketotp(String otp, String pin) {

        String OTP = otp;


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
        probutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String otp = OTP;
                if (otp.equals(email.getText())) {
                    dispose();
                    Rocketpin bkashpin = new Rocketpin(pin);
                    bkashpin.AmountNumber.setText(Rocket.AmountNumber.getText());
                    bkashpin.addTnx(sender, method, fund, amount);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong OTP");
                }
            }
        });
        add(probutton);
        probutton.setBounds(150, 630, 100, 25);

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        closebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
        add(closebutton);
        closebutton.setBounds(300, 630, 100, 25);

 
        add(email);
        email.setBounds(175, 520, 200, 30);

             marchant.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchant.setText("Merchant          :");
        add(marchant);
        marchant.setBounds(160, 210, 120, 30);

        marchantname.setFont(new Font("Inter", Font.BOLD, 14)); 
        marchantname.setText("NIRMUL FOUNDATION");
        add(marchantname);
        marchantname.setBounds(290, 220, 190, 18);

        Amount.setFont(new Font("Inter", Font.BOLD, 14)); 
        Amount.setText("Amount             :");
         add(Amount);
        Amount.setBounds(160, 260, 120, 18);

        
		   AmountNumber.setFont(new Font("Inter", Font.BOLD, 14));
        add(AmountNumber);
        AmountNumber.setBounds(300, 260, 100, 18);

        word.setFont(new Font("Inter", Font.BOLD, 14));
        word.setText("Enter your OTP ");
        add(word);
        word.setBounds(210, 465, 210, 40);

      jLabel1.setIcon(new ImageIcon(Static.DONATION_ROOT+"rocket.png"));
       
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
       
//      new Rocketotp();
    }

               
}