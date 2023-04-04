// EXERCICO 26, LISTA 2

import javax.swing.JOptionPane;

public class Consumo {
    public static void main(String[]args){

        String aux1 = JOptionPane.showInputDialog("Qual foi a distancia em Km percorrida? ");
        double d = Double.parseDouble(aux1);
        String aux2 = JOptionPane.showInputDialog("Qual foi o consumo em L gasto? ");
        double g = Double.parseDouble(aux2);

        double consumo = d / g;

        if(consumo < 8){
            JOptionPane.showMessageDialog(null, "Venda o carro!!");
        }
        else if(consumo < 14){
            JOptionPane.showMessageDialog(null, "Economico!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Super Economico!!!!");
        }
    }
}
