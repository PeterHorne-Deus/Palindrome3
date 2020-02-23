/*
 * Peter Horne-Deus
 * This program determines if a phrase is a palindrome
 * Palindrome3.java
 * Febuary 22, 2020
 */

package palindrome3;

import javax.swing.*;

/**
 *
 * @author Peter
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables
        String input = "";
        String forward = "";
        String reverse = "";
        
        //Getting user input
        input = JOptionPane.showInputDialog("A Palinrome is a word that is the "
                + "same forward and backwards.\nThis program will determine if "
                + "a phrase is a palindrome \n\nPlase enter a phrase(without puncuation) ");
        
        //Set the inputed string into a string without the spaces
        for (int u = 0; u <= input.length() - 1; u++){
            if(input.charAt(u) == ' '){
                
            }
            else{
                forward = forward + input.charAt(u);
            }
        }
        
        forward = forward.toLowerCase();
        
        //Took the reverse of the inputed string without the spaces
        for (int i = forward.length()-1 ; i >= 0; i--){
            reverse = reverse + forward.charAt(i);
            
        }
        
        
        //Checking if the reverse eqauals the forward and is therefore a plaindrome
        if(forward.equals(reverse)){
            JOptionPane.showMessageDialog(null, "\"" + input + "\"" + " Is a palindrome");
        }
        else{
            JOptionPane.showMessageDialog(null, "This is not a palindrome");
        }
    }
    
}
