import java.awt.*;
import  java.awt.Image;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;



public class Bkashotp extends JFrame {
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

    
    public Bkashotp() {

    


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
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

    

        probutton.setFont(new Font("Inter", Font.PLAIN, 14));
        probutton.setText("PROCEED");
        add(probutton);
        probutton.setBounds(150, 630, 100, 25);
		probutton.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
				Thank c=new Thank();
				c.Thanku.setText(Bkashotp.AmountNumber.getText());
		//		Thank.Amt.setText(Bkashotp.AmountNumber.getText());
				
				c.setVisible(true);
				}});

        closebutton.setFont(new Font("Inter", Font.PLAIN, 14));
        closebutton.setText("CLOSE");
        add(closebutton);
        closebutton.setBounds(300, 630, 100, 25);

 
        add(email);
        email.setBounds(175, 520, 200, 30);

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

        
		   AmountNumber.setFont(new Font("Inter", Font.BOLD, 14));
		 AmountNumber.setForeground(new Color(255, 255, 255));
        add(AmountNumber);
        AmountNumber.setBounds(300, 260, 100, 18);

        word.setFont(new Font("Inter", Font.BOLD, 14)); 
        word.setForeground(new Color(255, 255, 255));
        word.setText("Enter your OTP ");
        add(word);
        word.setBounds(210, 465, 210, 40);

      jLabel1.setIcon(new ImageIcon("C:\\Users\\DP\\Desktop\\New folder (4)\\New folder (12)\\static\\bKashPayment_bg .png")); 
       
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 800);

        pack();
		setSize(615, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
    }                      

   

    public static void main(String args[]) {
       
      new Bkashotp();
    }

               
}