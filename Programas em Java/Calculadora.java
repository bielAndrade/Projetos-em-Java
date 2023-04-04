import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int result;

        System.out.println("Digite o sinal da operação que será realizada: ");
        char opcao = sc.next().charAt(0);


        switch (opcao){
            case '+':
                result = n1 + n2;
                System.out.println("Resultado da Operação = " + result);
                break;

            case '-':
                result = n1 - n2;
                System.out.println("Resultado da Operação = " + result);
                break;

            case '*':
            result = n1 * n2;
                System.out.println("Resultado da Operação = " + result);
                break;

            case 'x':
            result = n1 * n2;
                System.out.println("Resultado da Operação = " + result);
                break;

            case '/':
            result = n1 / n2;
                if(n2 != 0){
                    System.out.println("Resultado da Operação = " + result);
                }
                else{
                    System.out.println("Operação inválida, não se pode dividir por 0");
                }
                break;

            default:
            System.out.println("Válor inválido");

        }
        sc.close();
    }
}