import java.util.Scanner;

public class Segundog {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print ("Digite o coeficiente a: ");
        double a = entrada.nextDouble();
        System.out.print ("Digite o coeficiente b: ");
        double b = entrada.nextDouble();
        System.out.print ("Digite o coeficiente c: ");
        double c = entrada.nextDouble();
        double delta, x1, x2;

        if(a == 0){
            System.out.print ("Coeficiente não representa equação do 2° grau");
        }
        else{
            delta = (b * b) - (4 * a *c);
            if(delta <= 0){
                System.out.print("Não há raíz real");
            }
            else{
                x1 = (-b + Math.sqrt(delta)) / 2 * a;
                x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.print("X1 = " + x1);
                System.out.print("\nX2 = " + x2);
            }
        }
        entrada.close();
    }
}