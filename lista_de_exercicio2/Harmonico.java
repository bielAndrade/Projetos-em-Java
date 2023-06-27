// EXERCICIO 27

import java.util.Scanner;

public class Harmonico {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int n = sc.nextInt();
            Double h = 1.0;

            for(int i = 2; i <= n; i++){
                h = h + (1.0 / i);
            }

            System.out.println(String.format("%.3f", h));

            sc.close();
        }
}
