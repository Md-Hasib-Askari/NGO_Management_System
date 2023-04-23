import javax.swing.*;
import java.awt.event.*;

public class PasswordExample extends JFrame {
   private JPasswordField passwordField;
   private JCheckBox showPassword;

   public PasswordExample() {
      setTitle("Show/Hide Password Example");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      passwordField = new JPasswordField(20);
      showPassword = new JCheckBox("Show password");
      showPassword.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (showPassword.isSelected()) {
               passwordField.setEchoChar((char) 0);
            } else {
               passwordField.setEchoChar('*');
            }
         }
      });

      JPanel panel = new JPanel();
      panel.add(passwordField);
      panel.add(showPassword);
      getContentPane().add(panel);

      pack();
      setVisible(true);
   }

   public static void main(String[] args) {
      new PasswordExample();
   }
}
