import javax.swing.*;

public class stensaxpase{
    public static void main(String[] args) {
        String player1 = JOptionPane.showInputDialog(null, "Sten, Sax & Påse för 2 spelare \n \nSpelare 1\nVälj sten, sax eller påse");
        String player2 = JOptionPane.showInputDialog(null, "Spelare 2\nVälj sten, sax eller påse");

        if (player1.equalsIgnoreCase("sten") && player2.equalsIgnoreCase("sax")){
            JOptionPane.showMessageDialog(null, "Player 1 vann");

        } else if (player1.equalsIgnoreCase("sten") && player2.equalsIgnoreCase("påse")){
            JOptionPane.showMessageDialog(null, "Player 2 vann");
        } else if (player1.equalsIgnoreCase("sten") && player2.equalsIgnoreCase("sten")){
            JOptionPane.showMessageDialog(null, "Ingen vann");
        } else if (player1.equalsIgnoreCase("sax") && player2.equalsIgnoreCase("sax")){
            JOptionPane.showMessageDialog(null, "Ingen vann");
        } else if (player1.equalsIgnoreCase("sax") && player2.equalsIgnoreCase("påse")){
            JOptionPane.showMessageDialog(null, "Player 1 vann");
        } else if (player1.equalsIgnoreCase("sax") && player2.equalsIgnoreCase("sten")){
            JOptionPane.showMessageDialog(null, "Player 2 vann");
        } else if (player1.equalsIgnoreCase("påse") && player2.equalsIgnoreCase("sax")){
            JOptionPane.showMessageDialog(null, "Player 2 vann");
        } else if (player1.equalsIgnoreCase("påse") && player2.equalsIgnoreCase("påse")){
            JOptionPane.showMessageDialog(null, "Ingen vann");
        } else if (player1.equalsIgnoreCase("påse") && player2.equalsIgnoreCase("sten")){
            JOptionPane.showMessageDialog(null, "Player 1 vann");
        } else {
            JOptionPane.showMessageDialog(null, "Ange sten, sax eller påse.");
        }
    }
}