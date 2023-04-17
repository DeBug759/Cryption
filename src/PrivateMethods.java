import javax.swing.*;

public class PrivateMethods {

    public StringBuilder encryptCaesarRAW(String word, int key){
        StringBuilder answer = new StringBuilder();

        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] + key);
        }

        for (int i = 0; i < arr1.length; i++) {
            answer.append(arr1[i]);
        }
        return answer;
    }

    public StringBuilder decryptCaesarRAW(String word, int key){
        StringBuilder answer = new StringBuilder();

        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] - key);
        }

        for(int i = 0; i < arr1.length; i++) {
            answer.append(arr1[i]);
        }
        return answer;
    }

    public StringBuilder decryptAtBashRAW(String word){
        StringBuilder answer = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char arr[] = alpha.toCharArray();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = alpha.indexOf(letter);
            answer.append(arr[25 - index]);
        }

        return answer;
    }

    public StringBuilder encryptAtBashRAW(StringBuilder word){
        StringBuilder answer = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char arr[] = alpha.toCharArray();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = alpha.indexOf(letter);
            answer.append(arr[25 - index]);
        }

        return answer;
    }
    public void decryptCaesar(String word, int key) {
        StringBuilder answer = new StringBuilder();

        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] - key);
        }

        for(int i = 0; i < arr1.length; i++) {
            answer.append(arr1[i]);
        }
        JOptionPane.showMessageDialog(null, "The decrypted message with Caesar Cipher is: " + answer);
    }

    public void encryptCaesar(String word, int key) {
        StringBuilder answer = new StringBuilder();

        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] + key);
        }

        for (int i = 0; i < arr1.length; i++) {
            answer.append(arr1[i]);
        }
        JOptionPane.showMessageDialog(null, "The encrypted message with Caesar Cipher is: " + answer);
    }

    public void decryptAtBash(String word){
        StringBuilder answer = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char arr[] = alpha.toCharArray();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = alpha.indexOf(letter);
            answer.append(arr[25 - index]);
        }

        JOptionPane.showMessageDialog(null, "The decrypted message with AtBash is: " + answer);
    }
    public void encryptAtBash(String word){
        StringBuilder answer = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char arr[] = alpha.toCharArray();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = alpha.indexOf(letter);
            answer.append(arr[25 - index]);
        }
        JOptionPane.showMessageDialog(null, "The encrypted message with AtBash is: " + answer);
    }

    public void doubleEncrypt(String word, int key){
        StringBuilder ans = new StringBuilder();
        ans.append(encryptAtBashRAW(encryptCaesarRAW(word, key)));
        JOptionPane.showMessageDialog(null, "The encrypted message with double encryption is: " + ans);
    }

    public void doubleDecrypt(String word, int key){
        StringBuilder ans = new StringBuilder();
        ans.append(decryptAtBashRAW(String.valueOf(decryptCaesarRAW(word, key))));

        JOptionPane.showMessageDialog(null, "The decrypted message with double encryption is: " + ans);
    }
}
