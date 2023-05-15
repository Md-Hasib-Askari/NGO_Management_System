package edu.aiub.UI.donation;

import edu.aiub.Static;
import edu.aiub.UI.authentication.CreateAccount;
import edu.aiub.UI.authentication.Signin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;




public class Guest extends  JFrame {
    private JTextField nameTextField;
    private JLabel nameLabel;
    private JButton signInBtn;
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
    private JPanel namePanel;
    public static JTextField donateAmountTextField;
    private JLabel donationMethodLabel;
    private JLabel background;
     private String []method={"Bkash","Nagad","Rocket"};
     private String []item={"Food","Clothing","Health Care","Forestation"};              

    
    public Guest() {



        nameLabel = new JLabel();
        nameTextField = new JTextField();
        namePanel = new JPanel() {
             @Override
             public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon(Static.AUTH_ROOT+"signinPanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
             }
        };

        donateAmountpanel =new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon(Static.AUTH_ROOT+"signinPanel.png").getImage(), 0, 0, null);
            }
        };
        donationMethodPanel =new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon(Static.AUTH_ROOT+"signinPanel.png").getImage(), 0, 0, 260,getHeight(), null);
            }
        };
        fundPanel =new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon(Static.AUTH_ROOT+"signinPanel.png").getImage(), 0, 0, null);
            }
        };
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
        signInBtn = new JButton();
	

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

        signInBtn.setFont(new Font("Inter", 1, 14));
        signInBtn.setBackground(new Color(255, 255, 255));
        signInBtn.setForeground(new Color(46, 204, 113));
        signInBtn.setText("Sign In");
        signInBtn.setBorder(null);
        signInBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                dispose();
                new Signin().setVisible(true);
            }
        });
        add(signInBtn);
        signInBtn.setBounds(250, 236, 80, 23);

        donateAmountpanel.setBackground(new Color(255, 255, 255));
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
        donateAmountTextField.setFont(new Font("Inter", Font.PLAIN, 14));
        donateAmountTextField.setBounds(20, 30, 390, 50);

        donateAmountlLabel.setBackground(new Color(234, 250, 241));
        donateAmountlLabel.setFont(new Font("Inter", 0, 14));
        donateAmountlLabel.setText("Donate Amount");
        donateAmountpanel.add(donateAmountlLabel);
        donateAmountlLabel.setBounds(20, 10, 330, 20);

        add(donateAmountpanel);
        donateAmountpanel.setBounds(75, 313, 525, 80);

        donationMethodPanel.setBackground(new Color(255, 255, 255));
        donationMethodPanel.setLayout(null);

        donationMethodLabel.setFont(new Font("Inter", 0, 14));
        donationMethodLabel.setText("Payment Method");
        donationMethodPanel.add(donationMethodLabel);
        donationMethodLabel.setBounds(20, 10, 160, 18);

        donationComboBox.putClientProperty("JComboBox.arc", 20);
        donationComboBox.setBackground(new Color(234, 250, 241));
        donationComboBox.setBorder(null);
        donationMethodPanel.add(donationComboBox);
        donationComboBox.setBounds(20, 35, 220, 40);

        add(donationMethodPanel);
        donationMethodPanel.setBounds(75, 410, 260, 80);


        namePanel.setBackground(new Color(255, 255, 255));
        namePanel.setLayout(null);

        nameLabel.setFont(new Font("Inter", 0, 14));
        nameLabel.setText("Name");
        namePanel.add(nameLabel);
        nameLabel.setBounds(20, 10, 160, 20);
        nameLabel.setBorder(null);

        nameTextField.setBackground(new Color(234, 250, 241));
        nameTextField.setBorder(null);
        namePanel.add(nameTextField);
        nameTextField.setBounds(20, 40, 250, 30);
        nameTextField.setFont(new Font("Inter", 0, 14));
        nameTextField.setBorder(null);

        add(namePanel);
        namePanel.setBounds(350, 410, 250, 80);

        fundPanel.setBackground(new Color(255, 255, 255));
        fundPanel.setLayout(null);

        fundLabel.setFont(new Font("Inter", 0, 14)); 
        fundLabel.setText("Fund");
        fundPanel.add(fundLabel);
        fundLabel.setBounds(20, 10, 160, 18);

        fundComboBox.putClientProperty("JComboBox.arc", 20);
        fundComboBox.setBackground(new Color(234, 250, 241, 255));
        fundComboBox.setBorder(null);
        fundPanel.add(fundComboBox);
        fundComboBox.setBounds(20, 30, 485, 40);

        add(fundPanel);
        fundPanel.setBounds(75, 507, 525, 80);

        donateButton.setFont(new Font("Inter", 1, 18));
        donateButton.setBackground(new Color(46, 204, 113));
        donateButton.setForeground(new Color(255, 255, 255));
        donateButton.setText("Donate");
//        donateButton.setBorder(null);
       
        add(donateButton);
        donateButton.setBounds(400, 603, 200, 60);
		
		donateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				String s =donationComboBox.getSelectedItem().toString(); 
				if(s.equals("Bkash"))
				{
					Bkash bkash = new Bkash();
                    bkash.AmountNumber.setText(Guest.donateAmountTextField.getText());
                    bkash.addTnx(nameTextField.getText(), donationComboBox.getSelectedItem().toString(), fundComboBox.getSelectedItem().toString(), Integer.parseInt(donateAmountTextField.getText()));

				}
				else if (s.equals("Nagad"))
				{
					Nagad nagad = new Nagad();
                    nagad.AmountNumber.setText(Guest.donateAmountTextField.getText());
                    nagad.addTnx(nameTextField.getText(), donationComboBox.getSelectedItem().toString(), fundComboBox.getSelectedItem().toString(), Integer.parseInt(donateAmountTextField.getText()));
				}
				else if (s.equals("Rocket"))
				{
					Rocket rocket = new Rocket();
                    rocket.AmountNumber.setText(Guest.donateAmountTextField.getText());
                    rocket.addTnx(nameTextField.getText(), donationComboBox.getSelectedItem().toString(), fundComboBox.getSelectedItem().toString(), Integer.parseInt(donateAmountTextField.getText()));
		        }}
        });

		
		
		
        background.setIcon(new ImageIcon(Static.DONATION_ROOT+"Guest.png"));
        add(background);
        background.setBounds(0, 0, 1200, 750);

        pack();
        setIconImage(new ImageIcon(Static.TITLE_ICON).getImage());
        setTitle(Static.TITLE);
		setSize(1200, 750);
        setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
    }                        

                                        

   
    public static void main(String args[]) {
            new Guest();
        }
    }

                       

                   

