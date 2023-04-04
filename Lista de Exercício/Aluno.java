// EXERCICO 14, LISTA 2

import java.util.Scanner;

public class Aluno {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite o valor da nota do trabalho de laboratorio de 0 a 10: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite o valor da nota da avaliacao de 0 a 10: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite o valor da nota do exame final de 0 a 10: ");
        nota3 = sc.nextDouble();

        media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        if(media <= 2.9){
            System.out.print("O aluno esta reprovado");
        }
        else if(media <= 4.9){
            System.out.print("O aluno esta de recuperacao");
        }
        else{
            System.out.print("O aluno foi aprovado!!");
        }
        
        sc.close();
    }
}
