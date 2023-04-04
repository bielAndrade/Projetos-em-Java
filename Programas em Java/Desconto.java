import javax.swing.JOptionPane;

public class Desconto{
    public static void main(String[] args){
        String aux = JOptionPane.showInputDialog("Valor inical: ");
        double produto = Double.parseDouble(aux);
        String aux2 = JOptionPane.showInputDialog("Valor do desconto em %: ");
        double desconto = Double.parseDouble(aux2);

        double novoValor = produto - (produto * (desconto / 100));
        JOptionPane.showMessageDialog(null, "O novo valor do produto será: R$" + novoValor);
    }
}