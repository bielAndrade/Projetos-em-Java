// LISTA 4 EXERCICIO 30

import java.util.Scanner;


public class VetorInter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vetInt = new int[10];
        int i, j;
       
        for(i = 0; i < vet1.length; i++){
            System.out.print("Digite o numero da posicao " + i + " do vetor 1: ");
            vet1[i] = sc.nextInt();
            System.out.print("Digite o numero da posicao " + i + " do vetor 2: ");
            vet2[i] = sc.nextInt();
        }

        boolean naoExiste = true;

        for(i = 0; i < vet2.length; i++){
            for(j = 0; j < vet1.length; j++){
               
                if(vet2[i] == vet1[j]){
                        while(naoExiste == true){
                            for(int p = 0; p < vetInt.length; p++){
                                if(vet2[i] == vetInt[p]){
                                    naoExiste = false;
                                }
                            } 
                            if(naoExiste == true){
                                vetInt[k] = vet2[i];
                                k++;
                                naoExiste = false;
                            }
                        } 
                        naoExiste = true;         
                }
            }
        }

        System.out.print("\nNumeros do vetor que correspondem a interseccao: [ ");
        for(i = 0; i < vetInt.length; i++){
            if(vetInt[i] != 0){
                System.out.print(vetInt[i] + " ");
            }
        }
        System.out.println("]");
        
        sc.close();
    }
}
