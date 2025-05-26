package codsoft;
import javax.swing.*;
class BankAccount {
    double balance = 1000;

    void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            JOptionPane.showMessageDialog(null, "Deposited ₹" + amt);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }
    void withdraw(double amt) {
        if (amt> 0 && amt<=balance) {
        balance -= amt;
        JOptionPane.showMessageDialog(null, "Withdrawn ₹" + amt);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid or Insufficient amount.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        JFrame f = new JFrame("ATM");
        JTextField t = new JTextField(); t.setBounds(100, 30, 100, 25);
        JButton b1 = new JButton("Deposit"), b2 = new JButton("Withdraw"), b3 = new JButton("Balance");
        b1.setBounds(30, 70, 100, 25); b2.setBounds(140, 70, 100, 25); b3.setBounds(85, 110, 100, 25);
        f.add(t); f.add(b1); f.add(b2); f.add(b3);
        b1.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(t.getText());
                acc.deposit(amt);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Enter valid number.");
            }
        });

        b2.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(t.getText());
                acc.withdraw(amt);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Enter valid number.");
            }
        });

        b3.addActionListener(e -> JOptionPane.showMessageDialog(f, "Current Balance: ₹" + acc.balance));
     f.setSize(280, 200); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}