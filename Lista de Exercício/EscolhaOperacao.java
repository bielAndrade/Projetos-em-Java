// EXERCICO 21, LISTA 2

import javax.swing.JOptionPane;

public class EscolhaOperacao {
    public static void main(String[]args){

        String aux1 = JOptionPane.showInputDialog("Digite um numero: ");
        double n1 = Double.parseDouble(aux1);
        String aux2 = JOptionPane.showInputDialog("Digite outro numero: ");
        double n2 = Double.parseDouble(aux2);
        double res;

        String aux3 = JOptionPane.showInputDialog("Digite um numero de 1 a 4 e escolha entre uma das opcoes:" +
                                                    "\n1- Soma de dois numeros" +
                                                    "\n2- Diferenca entre dois numeros" +
                                                    "\n3- Produto entre dois numeros" +
                                                    "\n4- Divisao entre dois numeros");
        int num = Integer.parseInt(aux3);

        switch (num) {
            case 1:
                res = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado da operacao desejada = "+ res);
                break;

            case 2:
                if(n2 > n1){
                    res = n2 - n1;
                    JOptionPane.showMessageDialog(null, "Resultado da operacao desejada = "+ res);
                }
                else{
                    res = n1 - n2;
                    JOptionPane.showMessageDialog(null, "Resultado da operacao desejada = "+ res);
                }
                
                break;

            case 3:
                res = n1 * n2;
                JOptionPane.showMessageDialog(null, "Resultado da operacao desejada = "+ res);
                break;

            case 4:
                res = n1 / n2;
                if(n2 == 0){
                    JOptionPane.showMessageDialog(null, "Valor invalido, o denominador deve ser diferente de 0");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Resultado da operacao desejada = "+ res);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Valor invalido tente novamente");
                break;
        }
    }
}
