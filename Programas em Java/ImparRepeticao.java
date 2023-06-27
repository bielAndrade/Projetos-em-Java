import java.util.Scanner;

public class ImparRepeticao{

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i = i + 2;
        }
        sc.close();
    }
}

