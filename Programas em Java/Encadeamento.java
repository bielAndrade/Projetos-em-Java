import java.util.Scanner;
public class Encadeamento {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o valor do primeiro número: ");
        n1 = scanner.nextInt();
        System.out.print("Digite o valor do segundo número: ");
        n2 = scanner.nextInt();
        System.out.print("Digite o valor do terceiro número: ");
        n3 = scanner.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " é o maior valor");
        }
        else if(n2 > n3){
            System.out.println(n2 + " é o maior valor");
        }
        else{
            System.out.println(n3 + " é o maior valor");
        }
        scanner.close();
    } 
}
