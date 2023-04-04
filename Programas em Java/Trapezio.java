import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Digite o valor da altura: ");
        double h = sc.nextDouble();
        System.out.print ("Digite o valor da base maior: ");
        double bMaior = sc.nextDouble();
        System.out.print ("Digite o valor da base menor: ");
        double bMenor = sc.nextDouble();
        double area;

        if(h > 0 && bMaior > 0 && bMenor > 0){
            area = ((bMaior + bMenor) * h) / 2;
            System.out.print("area do trapézio = " + area);
        }
        else{
            System.out.print("Não é possível calcular a área com valores negativos");
        }
        sc.close();
    }
}
