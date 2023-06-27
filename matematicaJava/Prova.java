import java.util.Scanner;

public class  Prova {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[50];
        int i = 2;

        System.out.println("Digite o primeiro termo: ");
        int aux = sc.nextInt();
        vet[0] = aux;
        System.out.println("Digite o segundo termo: ");
        int aux2 = sc.nextInt();
        vet[1] = aux2;

        while(i < vet.length){
            if(i % 2 == 0){
                vet[i] = vet[i - 1] - vet[i - 2];
            } else if(i % 2 !=0){
                vet[i] = vet[i - 1] + vet[i - 2];
            }
            i++;
        }

        for(int j = 0; j < vet.length; j++){
            System.out.println("o termo " + (j + 1) + " e igual a: " + vet[j]);
        }

        sc.close();
    }
}
