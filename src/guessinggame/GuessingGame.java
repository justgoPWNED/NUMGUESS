/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class GuessingGame {
    private static int numberOfguesses;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d = Math.random();
        int NumberOfGuesses = 1;
        int mystery = (int)(d* 100);
        mystery++;
        
        String box = JOptionPane.showInputDialog (null,"can you guess my number? its between 1 and 100");
        int boxInt = Integer.parseInt(box);
        while (boxInt != mystery) {
            numberOfguesses++;
            if (boxInt == 1337);
            
            if (boxInt > mystery){
                box = JOptionPane.showInputDialog(null, "Too high try again","you failed",JOptionPane.ERROR_MESSAGE);
                boxInt = Integer.parseInt(box);
            }
            if (boxInt < mystery){
                box = JOptionPane.showInputDialog(null, "Too low try again",JOptionPane.ERROR_MESSAGE);
                boxInt = Integer.parseInt(box);
                
            }
        }
        JOptionPane.showInputDialog(null,"you guessed my number in  " +numberOfguesses);
    }
    
}
