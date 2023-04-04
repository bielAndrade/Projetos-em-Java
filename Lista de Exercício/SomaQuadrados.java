// EXERCICO 28, LISTA 1

import javax.swing.JOptionPane;

public class SomaQuadrados{
    public static void main(String[] args){
        String aux = JOptionPane.showInputDialog("digite o primeiro numero: ");
        double n1 = Math.pow(Double.parseDouble(aux), 2);
        String aux2 = JOptionPane.showInputDialog("digite o segundo numero: ");
        double n2 = Math.pow(Double.parseDouble(aux2), 2);
        String aux3 = JOptionPane.showInputDialog("digite o terceiro numero: ");
        double n3 = Math.pow(Double.parseDouble(aux3), 2);

        double produto = n1 + n2 + n3;
        
        JOptionPane.showMessageDialog(null, "A soma do quadrado dos tres valores e igual a " + produto);
    }
}