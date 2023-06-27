// LISTA 4 EXERCICIO 23

import java.util.Scanner;

public class ProdutoEscalar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] vet1 = new double[5];
        double[] vet2 = new double[5];
        double produtoEscalar = 0;
        int j = 0;
        int i;
        

        for(i = 0; i < vet1.length; i++){
            System.out.print("Digite o numero da posicao " + i + " do vetor 1: ");
            vet1[i] = sc.nextInt();
            System.out.print("Digite o numero da posicao " + i + " do vetor 2: ");
            vet2[i] = sc.nextInt();
        }

        System.out.println("\nVetor 1: ");
        for(i = 0; i < vet1.length; i++){
            System.out.println(vet1[i]);
        }

        System.out.println("\nVetor 2: ");
        for(i = 0; i < vet2.length; i++){
            System.out.println(vet2[i]);
        }

        while(j < vet1.length){
            produtoEscalar += vet1[j] * vet2[j];
            System.out.println("\n" + vet1[j] + " * " + vet2[j] + " = "  + produtoEscalar + "(produto escalar)");
            j++;
        }
        System.out.println("\nProduto Escalar: " + produtoEscalar);
        
        sc.close();
    }
}

