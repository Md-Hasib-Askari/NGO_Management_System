import java.awt.*;
import  java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;



public class Rocketpin extends JFrame {
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

    
    public Rocketpin() {

    


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
		
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

    

        probutton.setFont(new Font("Inter", Font.PLAIN, 14));
        probutton.setText("PROCEED");
        add(probutton);
        probutton.setBounds(150, 630, 100,25);
		probutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Rocketotp b=new Rocketotp();
				b.AmountNumber.setText(Rocketpin.AmountNumber.getText());
				b.setVisible(true);
				}});

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        add(closebutton);
        closebutton.setBounds(330, 630, 100, 25);
		closebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
				}});

 
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
        word.setText("Enter your PIN ");
        add(word);
        word.setBounds(210, 465, 210, 40);
        jLabel1.setIcon(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\rocket.png")); 
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 800);

        pack();
		setSize(615, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
    }                      

   

    public static void main(String args[]) {
       
      new Rocketpin();
    }

               
}