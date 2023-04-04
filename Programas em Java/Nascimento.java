import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia de nascimento: ");
        int d = sc.nextInt();
        System.out.print("Digite o mes de nascimento: ");
        int m = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int a = sc.nextInt();
        int anoAtual = 2023;

        if(a > anoAtual){
            System.out.println("Ano inválido");
        }
        else if(m > 12){
            System.out.println("Mes invalido");
        }
        else if(m == 2 && d > 29 && a % 4 == 0){
            System.out.println("Ano Bissexto, fevereiro tem apenas 29 dias");
        }
        else if(m == 2 && d > 28 && a % 4 != 0){
            System.out.println("Fevereiro tem apenas 28 dias");
        }
        else if(m == 4 || m == 6 || m == 9 || m == 11 && d > 30){
            System.out.println("O mes inserido tem apenas 30 dias");
        }
        else if(d > 31){
            System.out.println("O mes inserido tem apenas 31 dias");
        }
        else{
            System.out.println("Data Valida");
        }
        sc.close();
    }
}