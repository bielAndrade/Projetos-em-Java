// LISTA 4 EXERCICIO 27

import java.util.Scanner;

public class VetorPrimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int count = 0;
        int k = vet.length - 1;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero para ser armazenado na posicao " + i + ": ");
            vet[i] = sc.nextInt();
        }

        while(k > 0) {
                int j = vet[k];
                while(j > 0){
                    if(vet[k] % j == 0){
                        count ++;
                        j--; 
                    } 
                    j--;
                }
            if(count == 2){
                System.out.println("Vetor de valor " + vet[k] +  " na posicao " + k + " e primo!");
            }
    
            k--;
            count = 0;
        }
        sc.close();
    }
}


