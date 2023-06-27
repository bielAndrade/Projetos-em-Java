
public class Cardinalidade {
    public static void main(String[] args){

        int[] vet = new int[850];
        int count = 0;
        int conta;

        for(int i = 0; i < vet.length; i++){
            vet[i] = i + 1;
        }

        for(int j = 0; j < vet.length; j++){
            if(vet[j] % 2 == 0 || vet[j] % 3 == 0 || vet[j] % 5 == 0) {
                count++;
            }
        }

        // for(int j = 0; j < vet.length; j++){
        //     if(vet[j] % 8 == 0 || vet[j] % 12 == 0){
        //         count++;
        //     }
        // }

        // conta = 679 - count;
        System.out.println(count);
        // System.out.println(conta);
    }
}
