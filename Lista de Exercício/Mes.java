// EXERCICO 16, LISTA 2

import java.util.Scanner;

public class Mes {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero inteiro de 1 a 12 correspondendo a um dos meses do ano: ");
        num = sc.nextInt();

        switch (num) {
            case 1:
            System.out.print("Janeriro");
            break;

            case 2:
            System.out.print("Fevereiro");
            break;

            case 3:
            System.out.print("Marco");
            break;

            case 4:
            System.out.print("Abril");
            break;

            case 5:
            System.out.print("Maio");
            break;

            case 6:
            System.out.print("Junho");
            break;

            case 7:
            System.out.print("Julho");
            break;

            case 8:
            System.out.print("Agosto");
            break;

            case 9:
            System.out.print("Setembro");
            break;

            case 10:
            System.out.print("Outubro");
            break;

            case 11:
            System.out.print("Novembro");
            break;

            case 12:
            System.out.print("Dezembro");
            break;
            
            default:
            System.out.print("Valor invalido, tente novamente");
            break;
        }
        sc.close();
    }
}