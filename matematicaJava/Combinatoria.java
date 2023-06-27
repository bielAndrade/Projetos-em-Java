
// public class Combinatoria{
//     public static void main(String[] args){
//         int  numInicial = 6;
//         int rot = 4;
//         int res;
//         int cont = 0;

//         while(numInicial <= 57){
//             int rot2 = rot;
//             while(rot2 <= 21){
//                 res = numInicial + rot2;  // 6 + 4
//             if(res % 2 == 0){
//                 cont++;
//             }
//             rot2++;
//             }
//             numInicial += 3;
//             rot++;
//         }

//         System.out.println(cont);
//     }
// }

// public class Combinatoria{
//     public static void main(String[] args){
//         int  numInicial = 3;
//         int rot = 1;
//         int res;
//         int cont = 0;

//         while(numInicial <= 63){
//             int rot2 = rot;
//             while(rot2 <= 21){
//                 res = numInicial + rot2;  // 6 + 4
//             if(res % 2 == 0){
//                 cont++;
//             }
//             rot2++;
//             }
//             numInicial++;
//             rot++;
//         }

//         System.out.println(cont);
//     }
// }

public class Combinatoria{
    public static void main(String[] args){
        int  numInicial = 1;
        
        int res;
        int cont = 0;

        while(numInicial <= 25){

        int rot = 1;
    
            for(int rot2 = rot; rot2 <= 25; rot2++){
                if(numInicial == rot2){
                    rot2++;
                }
                 res = numInicial + rot2;  // 2 + 1
                //  System.out.println(res);
                if(res % 2 == 0){
                    cont++;
                }
            }

            numInicial++;
            rot++;
        }

        System.out.println(cont);
    }
}