// EXERCICIO 19

import java.util.Scanner;

public class Algorismos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero entre 100 e 999: ");
        int n = sc.nextInt();
        int algs;
        int i = 3;

        while(n > 0){
            algs = n % 10;
            System.out.println("Algorismo " + i + "= " + algs);
            n= n / 10;
            i--;
        }

        sc.close();
    }
}
