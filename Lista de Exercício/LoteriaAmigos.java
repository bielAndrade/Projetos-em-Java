// EXERCICO 52, LISTA 1

import javax.swing.JOptionPane;

public class LoteriaAmigos {

    public static void main(String[]args){
        String aux1 = JOptionPane.showInputDialog("Digite o valor do premio: ");
        double premio = Double.parseDouble(aux1);
        String aux2 = JOptionPane.showInputDialog("Quanto o primeiro apostador investiu? ");
        double apostador1 = Double.parseDouble(aux2);
        String aux3 = JOptionPane.showInputDialog("Quanto o segundo apostador investiu? ");
        double apostador2 = Double.parseDouble(aux3);
        String aux4 = JOptionPane.showInputDialog("Quanto o terceior apostador investiu? ");
        double apostador3 = Double.parseDouble(aux4);

        double somatorio = apostador1 + apostador2 + apostador3;
        double premio1 = premio * (apostador1 / somatorio);
        double premio2 = premio * (apostador2 / somatorio);
        double premio3 = premio * (apostador3 / somatorio);

        JOptionPane.showMessageDialog(null, "O valor relativo do premio do apostador 1 sera de: " + String.format("%.2f", premio1) + 
                                                            "\nO valor relativo do premio do apostador 2 sera de: " + String.format("%.2f", premio2) +
                                                            "\nO valor relativo do premio do apostador 3 sera de: " + String.format("%.2f", premio3));
    }
}
