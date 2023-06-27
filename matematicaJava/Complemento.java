public class Complemento {
    public static void main(String[] args){
        int[] vet = new int[37];
        int[] vetA = new int[37];
        int[] vetB = new int[37];
        int[] vetBcompl = new int[37];
        int i;
        int k = 1;
        int count = 0;

        for(i = 0; i < vet.length; i++){
            vet[i] = i + 1;
        }

        for(i = 0; i < vet.length; i++){
            vetA[i] = vet[i] * 2;
        }

        for(i = 0; i < vet.length; i++){
            vetB[i] = vet[i] * 3;
        }

        // for(i = 0; i < vetBcompl.length; i++){
        //     if(k % 3 != 0){
        //         vetBcompl[i] = k;
        //         k++;
        //         count++;
        //     }else{
        //         k++;
        //         i--;
        //     }
        // }

        // for(i = 0; i < vetA.length; i++){
        // //     // System.out.println(vetA[i]);
        // //     // System.out.println(vetB[i]);
        //     System.out.println(vetBcompl[i]);
        // }

        for(i = 1; i <= 37; i++){
            if(i % 2 != 0 && i % 3 != 0){
                count++;
            }
        }

        System.out.println(count);

    }
}

// A = [2, 4, 6, 8, 10, ...]
// Ac = [1, 3, 5, 7, 9, ...] ìmpares de 1 a 73
// Ac em Bc = [, 12] ou seja, todos ímpares com exceção dos múltiplos de 3 até 73
// B = [3, 6, 9, 12, 15, ...]
// Bc = [1, 2, 4, 5, 7, ...] exceção dos múltiplos de 3 até 111
// calcular a cardinalidade da intersecção dos complementos = numeros de A que nao estao em B