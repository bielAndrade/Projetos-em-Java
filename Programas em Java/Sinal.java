import java.util.Scanner;
public class Sinal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        

        Double n;
        n = scanner.nextDouble();

        if(n >= 0){
            System.out.println("\n" + n + " é positivo");
        }
        else{
            System.out.println("\n" + n + " é negativo");
        }

        if(n % 2 == 0){
            System.out.println(n + " é par");
        }
        else{
            System.out.println(n + " é ímpar");
        }

        scanner.close();
    }

}
