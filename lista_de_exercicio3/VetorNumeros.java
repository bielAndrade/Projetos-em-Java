// LISTA 4 EXERCICIO 29

import java.util.Scanner;

public class VetorNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int[] par = new int[6];
        int[] impar = new int[6];
        int count = 0;
        int sum = 0;
        int k = 0;
        int q = 0;
    
        
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero para ser armazenado na posicao " + i + ": ");
            vet[i] = sc.nextInt();
        }

        for(int j = 0; j < vet.length; j++){
            if(vet[j] % 2 == 0){
                sum += vet[j];
                par[k] = vet[j];
                k++;
            } else {
                count++;
                impar[q] = vet[j];
                q++;
            }
        }

        for(int n = 0; n < par.length; n++){
            if(par[n] != 0){
                System.out.println("Numeros pares: " + par[n]);
            }
        }

        System.out.println("Soma dos numeros pares: " + sum);

        for(int m = 0; m < par.length; m++){
            if(impar[m] != 0){
                System.out.println("Numeros impares: " + impar[m]);
            } 
        }
        System.out.println("Quantidade de numeros impares: " + count);

        sc.close();
    }
}
