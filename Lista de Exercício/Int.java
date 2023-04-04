// EXERCICO 32, LISTA 1

import java.util.Scanner;

public class Int {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int num, res;
        num = sc.nextInt();

        res = ((num * 3) + 1) + ((num * 2) - 1);

        System.out.print("a soma do sucessor de seu triplo com o antecessor de seu dobro  igual a " + res);

        sc.close();
    }
}
