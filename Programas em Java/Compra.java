import java.util.Scanner;
public class Compra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Double compra, parcelas, valorFinal;

        System.out.print("Digite o valor da compra: ");
        compra = scanner.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        parcelas = scanner.nextDouble();
 

        if(parcelas == 1){
            valorFinal = compra - (compra * 0.1);
            System.out.println("O valor da compra vai ser de " + valorFinal);
        }
        else if(parcelas == 2){
            valorFinal = compra;
            System.out.println("O valor da compra vai ser de " + valorFinal);
        }
        else{
            valorFinal = compra + (compra * 0.1);
            System.out.println("O valor da compra vai ser de " + valorFinal);
        }
        scanner.close();
    } 
}
