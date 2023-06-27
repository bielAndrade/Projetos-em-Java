import java.util.Scanner;

public class Primo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para verificar se ele e primo: ");
        int n = sc.nextInt();
        int raiz = (int) Math.sqrt(n);
        boolean ePrimo = true;
        for(int i = 2; i <= raiz && ePrimo; i++){
            if(n % i == 0){
                ePrimo = false;
            }
        }
        if(ePrimo) {
            System.out.println(n + " e primo");
        }
        else{
            System.out.println(n + " nao e primo");
        }
        sc.close();
    }
}