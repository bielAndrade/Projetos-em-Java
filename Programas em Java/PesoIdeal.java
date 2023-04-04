import java.util.Scanner;
public class PesoIdeal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char sexo;
        Double altura, peso;
    
        System.out.print("Digite o valor da altura(m): ");
        altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo do indíviduo: ");
        sexo = scanner.next().charAt(0);

        
        if(sexo == 'm' || sexo == 'M'){
            peso = (72.7 * altura) - 58;
            System.out.println("O peso ideal do indivíduo com altura de " + altura + "m é de: " + String.format("%.2f", peso));
        }
        else if(sexo == 'f' || sexo == 'F'){
            peso = (altura * 62.1) - 44.7;
            System.out.println("O peso ideal do indivíduo com altura de " + altura + "m é de: " + String.format("%.2f", peso));
        }
        else{
            System.out.println("Valor do sexo inválido");
        } 

        scanner.close();
    }

}
