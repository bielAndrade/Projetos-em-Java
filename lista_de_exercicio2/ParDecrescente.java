// EXERCICIO 14

import java.util.Scanner;

public class ParDecrescente {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero par: ");
        int n = sc.nextInt();

        while(n >= 0){
            if(n % 2 == 0){
                System.out.println(n);
            }
            n--;
        }

        sc.close();
    }
}
