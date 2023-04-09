import javax.swing.*;

public class Methods {

    String[] encrypDecryp = {"Encrypt Message", "Decrypt Message"};
    String[] encryptOptions = {"Caesar Cipher", "AtBash Cipher", "Brute Force"};
    public void welcome(){
        JOptionPane.showMessageDialog(null, "*************** CRYPTION.exe ***************");
        JOptionPane.showMessageDialog(null, "Welcome to CRYPTION.exe. Encrypt and decrypt messages.");
        int encDec = JOptionPane.showOptionDialog(null, "What would you like to do today?", "Encrypt or Decrypt", 0, 2, null, encrypDecryp, encrypDecryp[0]);

        /*if(encDec == 0){
             state = Methods.State.ENCRYPT;
        }*/
        Main.state = Main.State.ENCRYPT;
        System.out.println(Main.state);
    }

    public void encrypt(){
        System.out.println("I entered function");
        String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to encrypt today?");
        String shiftKey = JOptionPane.showInputDialog(null, "What would you like your shift key to be?");
        Main.state = Main.State.ENCRYPT;
        System.out.println(Main.state);
    }

    public boolean exit(){
        JOptionPane.showMessageDialog(null, "Thank you for using CRYPTION.");
        Main.state = Main.State.EXIT;
        return true;
    }

}
