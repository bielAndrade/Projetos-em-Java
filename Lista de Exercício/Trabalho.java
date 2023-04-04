// EXERCICO 40, LISTA 1

import java.util.Scanner;

public class Trabalho {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de dias trabalhados pelo encanador: ");
        double d, pago, ir;

        d = sc.nextDouble();
        ir = 0.08 * (30 * d);
        pago = (30 * d) - ir;

        System.out.print("O valor a ser pago sera de: " + pago);

        sc.close();
    }
}
