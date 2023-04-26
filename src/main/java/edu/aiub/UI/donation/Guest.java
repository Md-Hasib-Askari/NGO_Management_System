package edu.aiub.UI.donation;

import edu.aiub.Static;
import edu.aiub.UI.authentication.CreateAccount;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;




public class Guest extends  JFrame {
	  private JLabel newtoNirmul;
	  private JLabel fundLabel;
    private JLabel donateAmountlLabel;
    private JPanel donateAmountpanel;
    private JPanel donationMethodPanel;
    private JPanel fundPanel;
    private JButton signUp;
    private JButton donateButton;
    private JComboBox donationComboBox;
    private JComboBox fundComboBox;
    public static JTextField donateAmountTextField;
    private JLabel donationMethodLabel;
    private JLabel background;
     private String []method={"Bkash","Nagad","Rocket"};
     private String []item={"Food","Clothing","Health Care","Forestation"};              

    
    public Guest() {
    

   
                           

        donateAmountpanel =new JPanel();
        donationMethodPanel =new JPanel();
        fundPanel =new JPanel();
        newtoNirmul = new JLabel();
        donateAmountlLabel = new JLabel();
        donationMethodLabel = new JLabel();
        fundLabel = new JLabel();
		background =new JLabel();
        donateAmountTextField = new JTextField();
        donationComboBox= new JComboBox(method);
        fundComboBox = new JComboBox(item);
        signUp = new JButton();
        donateButton = new JButton();
	

        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(null);
		
		
		
		
		    newtoNirmul.setFont(new Font("Inter", 0, 14)); 
        newtoNirmul.setText("New to Nirmul ? ");
        add(newtoNirmul);
        newtoNirmul.setBounds(75, 236, 150, 20);

        signUp.setFont(new Font("Inter", 1, 14));
        signUp.setBackground(new Color(255, 255, 255));
        signUp.setForeground(new Color(46, 204, 113));
        signUp.setText("Sign Up");
        signUp.setBorder(null);
        signUp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                dispose();
                new CreateAccount().setVisible(true);
            }
        });
        add(signUp);
        signUp.setBounds(180, 236, 80, 23);

        donateAmountpanel.setBackground(new Color(234, 250, 241));
        donateAmountpanel.setLayout(null);

        donateAmountTextField.setBackground(new Color(234, 250, 241));
        donateAmountTextField.setBorder(null);
		
	/*	donateAmountTextField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				//Bkash c=new Bkash();
				String s=donateAmountTextField.getText();
				//c.my_update(s);
				//Bkashpin b=new Bkashpin();
				new Bkash(s).setVisible(true);
				//setVisible(false);
				}});
			*/
			
			
			
        donateAmountpanel.add(donateAmountTextField);
        donateAmountTextField.setBounds(10, 40, 390, 30);

        donateAmountlLabel.setBackground(new Color(234, 250, 241));
        donateAmountlLabel.setFont(new Font("Inter", 0, 14));
        donateAmountlLabel.setText("Donate Amount");
        donateAmountpanel.add(donateAmountlLabel);
        donateAmountlLabel.setBounds(10, 10, 330, 20);

        add(donateAmountpanel);
        donateAmountpanel.setBounds(75, 313, 525, 80);

        donationMethodPanel.setBackground(new Color(234, 250, 241));
        donationMethodPanel.setLayout(null);

        donationMethodLabel.setFont(new java.awt.Font("Inter", 0, 14)); 
        donationMethodLabel.setText("Payment Method");
        donationMethodPanel.add(donationMethodLabel);
        donationMethodLabel.setBounds(10, 10, 160, 18);

        donationComboBox.setBackground(new Color(234, 250, 241));
        donationComboBox.setBorder(null);
        donationMethodPanel.add(donationComboBox);
        donationComboBox.setBounds(20, 35, 150, 30);

        add(donationMethodPanel);
        donationMethodPanel.setBounds(75, 410, 525, 80);

        fundPanel.setBackground(new Color(234, 250, 241));
        fundPanel.setLayout(null);

        fundLabel.setFont(new Font("Inter", 0, 14)); 
        fundLabel.setText("Fund");
        fundPanel.add(fundLabel);
        fundLabel.setBounds(10, 10, 160, 18);

        fundComboBox.setBackground(new Color(234, 250, 241));
        fundComboBox.setBorder(null);
        fundPanel.add(fundComboBox);
        fundComboBox.setBounds(20, 35, 150, 30);

        add(fundPanel);
        fundPanel.setBounds(75, 507, 525, 80);

        donateButton.setFont(new Font("Inter", 1, 18)); 
        donateButton.setForeground(new Color(46, 204, 113));
        donateButton.setText("Donate");
        donateButton.setBorder(null);
       
        add(donateButton);
        donateButton.setBounds(360, 603, 240, 59);
		
		donateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				String s =donationComboBox.getSelectedItem().toString(); 
				if(s.equals("Bkash"))
				{
					new Bkash().AmountNumber.setText(Guest.donateAmountTextField.getText());

				}
				else if (s.equals("Nagad"))
				{
					new Nagad().AmountNumber.setText(Guest.donateAmountTextField.getText());
				}
				else if (s.equals("Rocket"))
				{
					new Rocket().AmountNumber.setText(Guest.donateAmountTextField.getText());
		        }}
        });

		
		
		
        background.setIcon(new ImageIcon(Static.DONATION_ROOT+"Guest.png"));
        add(background);
        background.setBounds(0, 0, 1200, 750);

        pack();
		setSize(1200, 750);
		setResizable(false);
		setVisible(true);
    }                        

                                        

   
    public static void main(String args[]) {
      
            
                new Guest();
            
        }
    }

                       

                   

