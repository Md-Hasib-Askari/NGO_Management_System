import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.ImageIcon;




public class Guest extends  JFrame {
	  private JLabel newtoNirmul;
	  private JLabel nameLabel;
	  private JLabel ExistingUser;
	  private JLabel fundLabel;
    private JLabel donateAmountlLabel;
    private JPanel donateAmountpanel;
    private JPanel namePanel;
    private JPanel donationMethodPanel;
    private JPanel fundPanel;
    private JButton signUp;
    private JButton signIn;
    private JButton donateButton;
    private JComboBox donationComboBox;
    private JComboBox fundComboBox;
    public static JTextField donateAmountTextField;
    private JTextField nameTextField;
    private JLabel donationMethodLabel;
    private JLabel background;
    private JLabel image;
     private String []method={"Bkash","nagad","Rocket"};              
     private String []item={"Food","Clothing","Health Care","Forestation"};              

    
    public Guest() {
    

   
                           

        donateAmountpanel =new JPanel();
        donationMethodPanel =new JPanel();
        namePanel =new JPanel();
        fundPanel =new JPanel();
        newtoNirmul = new JLabel();
        image = new JLabel();
        nameLabel = new JLabel();
        ExistingUser = new JLabel();
        donateAmountlLabel = new JLabel();
        donationMethodLabel = new JLabel();
        fundLabel = new JLabel();
		background =new JLabel();
        donateAmountTextField = new JTextField();
        nameTextField = new JTextField();
        donationComboBox= new JComboBox(method);
        fundComboBox = new JComboBox(item);
        signUp = new JButton();
        signIn = new JButton();
        donateButton = new JButton();
	

        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(null);
		
		
		
		
		    newtoNirmul.setFont(new Font("Inter", 0, 14)); 
        newtoNirmul.setText("New to Nirmul ? ");
        add(newtoNirmul);
        newtoNirmul.setBounds(75, 236, 150, 20);	


		ExistingUser.setFont(new Font("Inter", 0, 14)); 
        ExistingUser.setText("Existing User ? ");
        add(ExistingUser);
        ExistingUser.setBounds(320, 236, 150, 20);

        signUp.setFont(new Font("Inter", 1, 14)); 
        signUp.setForeground(new Color(46, 204, 113));
        signUp.setBackground(new Color(255, 255,255));
        signUp.setText("Sign Up");
        signUp.setBorder(null);
        add(signUp);
        signUp.setBounds(180, 236, 100, 20); 
		
		
		signIn.setFont(new Font("Inter", 1, 14)); 
        signIn.setForeground(new Color(46, 204, 113));
        signIn.setBackground(new Color(255, 255,255));
        signIn.setText("Sign In");
		 signIn.setBorder(null);
        add(signIn);
        signIn.setBounds(425, 236, 100, 20);
		
		
		donateAmountpanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\fullpanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;	
        donateAmountpanel.setBackground(new Color(255, 255, 255));
        donateAmountpanel.setLayout(null);

        donateAmountTextField.setBackground(new Color(234, 250, 241));
        donateAmountTextField.setBorder(null);
			
			
			
        donateAmountpanel.add(donateAmountTextField);
        donateAmountTextField.setBounds(10, 40, 390, 30);
        donateAmountTextField.setFont(new Font("Inter", 0, 16));

        donateAmountlLabel.setBackground(new Color(234, 250, 241));
        donateAmountlLabel.setFont(new Font("Inter", 0, 14));
        donateAmountlLabel.setText("Donate Amount");
        donateAmountpanel.add(donateAmountlLabel);
        donateAmountlLabel.setBounds(10, 10, 330, 20);
		donateAmountlLabel.setBorder(null);

        add(donateAmountpanel);
        donateAmountpanel.setBounds(75, 313, 525, 80);
        donationMethodPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\namePanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        donationMethodPanel.setBackground(new Color(255, 255, 255));
        donationMethodPanel.setLayout(null);

        donationMethodLabel.setFont(new Font("Inter", 0, 14)); 
        donationMethodLabel.setText("Donation method");
        donationMethodPanel.add(donationMethodLabel);
        donationMethodLabel.setBounds(10, 10, 160, 20);
		donationMethodLabel.setBorder(null);

        donationComboBox.setBackground(new Color(234, 250, 241));
        donationComboBox.setBorder(null);
        donationMethodPanel.add(donationComboBox);
        donationComboBox.setBounds(10, 40, 72, 20);
		donationComboBox.setBorder(null);

        add(donationMethodPanel);
        donationMethodPanel.setBounds(75, 410, 250, 80);
		
			 namePanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\namePanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
		
		namePanel.setBackground(new Color(255, 255, 255));
        namePanel.setLayout(null);
        
        nameLabel.setFont(new Font("Inter", 0, 14)); 
        nameLabel.setText("Name");
        namePanel.add(nameLabel);
        nameLabel.setBounds(10, 10, 160, 20);
		nameLabel.setBorder(null);
		 

       nameTextField.setBackground(new Color(234, 250, 241));
        nameTextField.setBorder(null);
        namePanel.add(nameTextField);
        nameTextField.setBounds(10, 40, 250, 30);
		nameTextField.setFont(new Font("Inter", 0, 16));
		nameTextField.setBorder(null);

        add(namePanel);
        namePanel.setBounds(350, 410, 250, 80);
        
		
		fundPanel =  new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\fullpanel.png").getImage(), 0,0,getWidth(),getHeight(),null);
            }
        };
        ;
        fundPanel.setBackground(new Color(255, 255, 255));
        fundPanel.setLayout(null);

        fundLabel.setFont(new Font("Inter", 0, 14)); 
        fundLabel.setText("Fund Type");
        fundPanel.add(fundLabel);
        fundLabel.setBounds(10, 10, 160, 18);
		fundLabel.setBorder(null);

        fundComboBox.setBackground(new Color(234, 250, 241));
		fundComboBox.setBorder(null);
        fundPanel.add(fundComboBox);
        fundComboBox.setBounds(10, 40, 72, 20);
		fundComboBox.setBorder(null);

        add(fundPanel);
        fundPanel.setBounds(75, 507, 525, 80);

        donateButton.setFont(new Font("Inter", 1, 18)); 
        donateButton.setBackground(new Color(46, 204, 113));
        donateButton.setForeground(new Color(255, 255, 255));
        donateButton.setText("Donate");
        donateButton.setBorder(null);
       
        add(donateButton);
        donateButton.setBounds(360, 603, 240, 59);
		
		donateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				String s =donationComboBox.getSelectedItem().toString(); 
				if(s=="Bkash")
				{
					Bkash b=new Bkash();
					b.AmountNumber.setText(Guest.donateAmountTextField.getText());
					b.setVisible(true);
				}
				else if (s=="nagad")
				{
					Nagad n=new Nagad();
					n.AmountNumber.setText(Guest.donateAmountTextField.getText());
					n.setVisible(true);
				}
				else 
				{
					Rocket r=new Rocket();
					r.AmountNumber.setText(Guest.donateAmountTextField.getText());
					r.setVisible(true);
		}}});

		
		
		
		   background.setIcon(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\Guest.png")); 
        add(background);
        background.setBounds(0, 0, 1200, 750);

        pack();
		setSize(1200, 750);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
    }                        

                                        

   
    public static void main(String args[]) {
      
            
                new Guest();
            
        }
    }

                       

                   

