// EXERCICIO 30

import java.util.Scanner;

public class Sequencia {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        int sum = 0;
        int j = 1;
        int alter = 0;
        int k = 1;
        int imparSum = 0;
        
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        while(j <= (2*n) -1){
            if(j % 2 != 0){
                alter += (j);
            } else{
                alter -= (j);
            }
            j++;
        }

        while(k <= (2*n) - 1){
            if(k % 2 != 0){
                imparSum += k;
            }
            k++;
        }

        System.out.println(sum);
        System.out.println(alter);
        System.out.println(imparSum);

        sc.close();
    }
}
