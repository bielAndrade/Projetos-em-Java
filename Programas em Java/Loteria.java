import java.util.Scanner;
public class Loteria {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do prêmio da Mega Sena: ");
        

        Double megaSena, primeiro, segundo, terceiro;
        megaSena = scanner.nextDouble();

        primeiro = 0.46 * megaSena;
        segundo = 0.32 * megaSena;
        terceiro = megaSena - (primeiro + segundo);

        System.out.println("valor do Prêmio do primeiro: R$" + String.format("%.2f", primeiro) + 
                            "\nvalor do Prêmio do segundo: R$" + String.format("%.2f", segundo) + 
                            "\nvalor do Prêmio do terceiro: R$" + String.format("%.2f", terceiro));

        scanner.close();
    }

}

