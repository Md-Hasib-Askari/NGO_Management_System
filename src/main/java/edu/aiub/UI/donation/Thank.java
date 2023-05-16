package edu.aiub.UI.donation;

import java.awt.*;
import java.awt.Image;
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
import edu.aiub.Static;


public class Thank extends  JFrame {


    private JButton ShowBtn;
    private JLabel Thank;
    private JLabel The;
    private JLabel This;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel  m;
    private JLabel background;
    public static JLabel Thanku;


    public Thank(String amount) {





        Thank = new JLabel();
        Thanku = new JLabel();
        The = new JLabel();
        This = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        ShowBtn = new JButton();
        background =new JLabel();


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(null);




        Thank.setFont(new Font("Inter", 0, 14));
        Thank.setText("Thank you for your gift !");
        add(Thank);
        Thank.setBounds(75, 240, 280, 20);

        Thanku.setFont(new Font("Inter", 0, 14));
        add(Thank);
        Thank.setBounds(10, 20, 20, 18);

        The.setFont(new Font("Inter", 0, 14));
        The.setText("The amount you have given will make a difference will go to help the  ");
        add(The);
        The.setBounds(75, 260, 580, 20);

        This.setFont(new Font("Inter", 0, 14));
        This.setText("This receipt is an attestation that we have gratefully received your generous  ");
        add(This);
        This.setBounds(75, 350,580, 20);

        jLabel4.setFont(new Font("Inter", 0, 14));
        jLabel4.setText("people to make them better members of society");
        add(jLabel4);
        jLabel4.setBounds(75, 280, 480, 20);

        jLabel5.setFont(new Font("Inter", 0, 14));
        jLabel5.setText("contribution to our humble foundation");
        add(jLabel5);
        jLabel5.setBounds(75, 370, 480, 20);

        ShowBtn.setFont(new Font("Inter", 1, 18));
        ShowBtn.setForeground(new Color(46, 204, 113));
        ShowBtn.setBackground(new Color(255, 255, 255));
        ShowBtn.setText("Print");
        ShowBtn.setBorder(null);
        add(ShowBtn);
        ShowBtn.setBounds(75, 433, 100, 30);
        ShowBtn.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          SwingUtilities.invokeLater(() -> {

                                              JFrame frame = new JFrame("Donation Receipt");
                                              JLabel label = new JLabel("Hello, World!");
                                              frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                                              JLabel received = new JLabel();
                                              JLabel     sign = new JLabel();
                                              JLabel     Recipt = new JLabel();
                                              JLabel sign1 = new JLabel();
                                              JLabel sign2 = new JLabel();
                                              JLabel CharityName = new JLabel();
                                              JLabel Munna = new JLabel();
                                              JLabel Nirmul = new JLabel();
                                              JLabel   Image = new JLabel();
                                              JLabel   DntAmt = new JLabel();
                                              JLabel   Amt = new JLabel();
                                              JLabel   DntType = new JLabel();
                                              JLabel   Online = new JLabel();
                                              JLabel   CharityAdd = new JLabel();
                                              JLabel  Address = new JLabel();
                                              JLabel   Thanks = new JLabel();
                                              JLabel   Number = new JLabel();

                                              Container contentPane = frame.getContentPane();
                                              frame.setLayout(null);
                                              frame.add(label);
                                              received.setFont(new Font("Inter", 0, 14));
                                              received.setText("Received     By");
                                              frame.add(received);
                                              received.setBounds(410, 570, 110, 31);

                                              sign.setText("-------------------------------------");
                                              frame.add(sign);
                                              sign.setBounds(380, 570, 150, 10);

                                              Recipt.setFont(new Font("Inter", 1, 14));
                                              Recipt.setText("                           DONATION RECIEPT");
                                              frame.add(Recipt);
                                              Recipt.setBounds(100, 80, 370, 50);

                                              sign1.setText("      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                              frame.add(sign1);
                                              sign1.setBounds(10, 176, 600, 20);

                                              sign2.setText("      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                              frame.add(sign2);
                                              sign2.setBounds(10, 170, 600, 20);

                                              CharityName.setFont(new Font("Inter", 0, 14));
                                              CharityName.setText("Charity name            :");
                                              frame.add(CharityName);
                                              CharityName.setBounds(150, 250, 190, 18);

                                              Munna.setFont(new Font("Baskerville Old Face", 2, 14));
                                              Munna.setText("        Munna");
                                              frame.add(Munna);
                                              Munna.setBounds(410, 550, 90, 30);

                                              Nirmul.setFont(new Font("Inter", 0, 14));
                                              Nirmul.setText("Nirmul Foundation");
                                              frame.add(Nirmul);
                                              Nirmul.setBounds(300, 250, 150, 18);

                                              Image.setIcon(new ImageIcon("C:\\Users\\DP\\Downloads\\9d134a91-daff-4ade-98e3-6711dab30bec.png"));
                                              frame.add(Image);
                                              Image.setBounds(0, 0, 190, 100);
                                              // Image.getAccessibleContext().setAccessibleName("");

                                              DntAmt.setFont(new Font("Inter", 0, 14));
                                              DntAmt.setText("Donation Amount     :");
                                              frame.add(DntAmt);
                                              DntAmt.setBounds(150, 280, 150, 18);

                                              Amt.setFont(new Font("Inter", 0, 14));
                                              Amt.setText(amount);
                                              frame.add(Amt);
                                              Amt.setBounds(300, 280, 150, 20);

                                              DntType.setFont(new Font("Inter", 0, 14));
                                              DntType.setText("Donation Type          :");
                                              frame.add(DntType);
                                              DntType.setBounds(150, 310, 150, 18);

                                              Online.setFont(new Font("Inter", 0, 14));
                                              Online.setText("Online ");
                                              frame.add(Online);
                                              Online.setBounds(300, 310, 150, 18);

                                              CharityAdd.setFont(new Font("Inter", 0, 14));
                                              CharityAdd.setText("Charity Address       :");
                                              frame.add(CharityAdd);
                                              CharityAdd.setBounds(150, 340, 150, 18);

                                              Address.setText("Kuratoli,Khilkhet,Dhaka 1229 ");
                                              frame.add(Address);
                                              Address.setBounds(300, 340, 200, 16);

                                              Thanks.setFont(new Font("Inter", 0, 14));
                                              Thanks.setText("Thanks  for your support");
                                              frame.add(Thanks);
                                              Thanks.setBounds(80, 480, 280, 16);

                                              Number.setFont(new Font("Inter", 0, 14));
                                              Number.setText("For Any Query     Contact Number :+8801313643812,+880160888254");
                                              frame.add(Number);
                                              Number.setBounds(30, 790, 530, 16);
//                                              frame.pack();
                                              frame.setLocationRelativeTo(null);
                                              frame.setVisible(true);

                                              try {
                                                  FileOutputStream file = new FileOutputStream(Static.DONATION_ROOT+"pdf/abc.pdf");
                                                  Document document = new Document(PageSize.A4);
                                                  PdfWriter writer = PdfWriter.getInstance(document, file);
                                                  document.open();
                                                  PdfContentByte cb = writer.getDirectContent();
                                                  Graphics2D g2d = cb.createGraphics(PageSize.A4.getWidth(), PageSize.A4.getHeight());
                                                  Rectangle2D r2d = new Rectangle2D.Double(0, 0, PageSize.A4.getWidth(), PageSize.A4.getHeight());
                                                  frame.getContentPane().print(g2d);
                                                  g2d.dispose();
                                                  document.close();
                                                  file.close();
                                              } catch (Exception w) {
                                                  w.printStackTrace();
                                              }


                                              frame.setSize((int) (PageSize.A4.getWidth())+60, (int) (PageSize.A4.getHeight())+30);
                                              frame.setLocationRelativeTo(null);
                                          });
                                      }
                                  }
        );



        background.setIcon(new ImageIcon(Static.DONATION_ROOT+"backgroundImg.png"));
        add(background);
        background.setBounds(0, 0, 1200, 750);

        pack();
        setSize(1200, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }




    public static void main(String args[]) {


//        new Thank();

    }
}

             