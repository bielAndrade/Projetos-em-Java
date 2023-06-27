// EXERCICIO 21

import java.util.Scanner;

public class Intervalo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero interio: ");
        int n1 = sc.nextInt();
        System.out.print("Digite um numero outro numero inteiro: ");
        int n2 = sc.nextInt();
        int soma = 0;
        int mult = 1;
        int i;
        
        sc.close();

        if(n1 > n2){
            for(i = n2; i <= n1; i++){
                if(i % 2 == 0){
                    soma = soma + i;
                } else{
                    mult = mult * i;
                }
            }
        } else {
            for(i = n1; i < n2; i++){
                if(i % 2 == 0){
                    soma = soma + i;
                } else{
                    mult = mult * i;
                }
            }
        }

        System.out.println(soma);
        System.out.println(mult);

        
    }
}
