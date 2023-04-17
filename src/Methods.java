import javax.swing.*;

public class Methods {
    PrivateMethods privateMethods = new PrivateMethods();
    String[] homeOptions = {"Encrypt", "Decrypt", "Exit"};
    String[] encrypDecryp = {"Encrypt Message", "Decrypt Message"};
    String[] encryptOptions = {"Caesar Cipher", "AtBash Cipher", "Double Encryption"};
    String[] decryptOptions = {"Caesar Cipher", "AtBash Cipher", "Double Decryption"};

    public void welcome(){
        JOptionPane.showMessageDialog(null, "*************** CRYPTION.exe ***************");
        JOptionPane.showMessageDialog(null, "Welcome to CRYPTION.exe. Encrypt and decrypt messages.");
        int encDec = JOptionPane.showOptionDialog(null, "What would you like to do today?", "Options", 0, 2, null, encrypDecryp, encrypDecryp[0]);

        if(encDec == 0){
             Main.state = Main.State.ENCRYPT;
        }else{
            Main.state = Main.State.DECRYPT;
        }
    }

    public void encrypt(){
        int cipher = JOptionPane.showOptionDialog(null, "What kind of cipher would you like to use today?", "Encrypt Cipher Options", 0, 3, null, encryptOptions, encryptOptions[0]);

        if(cipher == 0){
            String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to encrypt today?");
            String shiftKey = JOptionPane.showInputDialog(null, "What would you like your shift key to be?");

            privateMethods.encryptCaesar(encryptMessage, Integer.parseInt(shiftKey));
        } else if (cipher == 1){
            String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to encrypt today?");

            privateMethods.encryptAtBash(encryptMessage);
        } else{
            String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to encrypt today?");
            String shiftKey = JOptionPane.showInputDialog(null, "What would you like your shift key to be?");

            privateMethods.doubleEncrypt(encryptMessage, Integer.parseInt(shiftKey));
        }
        Main.state = Main.State.HOME_OPTIONS;
    }

    public void decrypt() {
        int cipher = JOptionPane.showOptionDialog(null, "What kind of cipher would you like to use to decrypt?", "Decrypt Cipher Options", 0, 2, null, decryptOptions, decryptOptions[0]);

        if (cipher == 0) {
            String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to decrypt today?");
            String shiftKey = JOptionPane.showInputDialog(null, "What is your shift key?");

            privateMethods.decryptCaesar(encryptMessage, Integer.parseInt(shiftKey));
        } else {
            String encryptMessage = JOptionPane.showInputDialog(null, "What would you like to decrypt today?");

            privateMethods.decryptAtBash(encryptMessage);
        }
        Main.state = Main.State.HOME_OPTIONS;

    }

    public void homeOptions(){
        int options = JOptionPane.showOptionDialog(null, "What would you like to do today?", "Options", 0, 3, null, homeOptions, homeOptions[0]);

        if(options == 0){
            Main.state = Main.State.ENCRYPT;
        } else if(options == 1){
            Main.state = Main.State.DECRYPT;
        } else{
            Main.state = Main.State.EXIT;
        }
    }

    public void exit(Main.State state) {

    }
}
