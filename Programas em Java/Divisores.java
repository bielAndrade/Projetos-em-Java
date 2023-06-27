import java.util.Scanner;

public class Divisores{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero e confira a soma de seus divisores abaixo: ");
        int n = sc.nextInt();
        int soma = 0;
        int metade = n / 2;
       
        for(int i = 1; i <= metade; i++){
            if(n % i == 0){
                soma = soma + i;
                System.out.print(i + " ");
            }  
        }

        System.out.print("\n" + soma);

        if(soma == n){
            System.out.print("\nPerfeito");
        }

        sc.close();
    }
}