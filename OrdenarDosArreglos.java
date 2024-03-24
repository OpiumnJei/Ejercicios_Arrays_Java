/*
Leer dos series de 5 numeros enteros, que estaran ordenados crecientemente. 
Copiar las dos tablas en un tercer arreglo, de modo que sigan ordenados.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarDosArreglos {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        int[] ar3 = new int[10];
        
        System.out.println("LLENAR EL PRIMER ARREGLO: ");
        
        for(int i = 0; i<ar1.length;i++){
            System.out.print("Digite un numero: ");
            ar1[i] = sc.nextInt();
        
        }
        
         System.out.println("LLENAR EL SEGUNDO ARREGLO: ");
        
        for(int i = 0; i<ar2.length;i++){
            System.out.print("Digite un numero: ");
            ar2[i] = sc.nextInt();
        
        }
        
        //FUSIONAR LOS DOS ARREGLOS EN UNO
        
       for(int i = 0, j = 0; i<5; i++){
            ar3[j] = ar1[i];
            j++;
            ar3[j] = ar2[i];
            j++;
       }
       
       //ordenamos en ascendentemente con 
       Arrays.sort(ar3);
       //Imprimir el arreglo 3 en orden ascendente. 
       
       for(int i: ar3){
           System.out.print(i+" ");
       
       
       }
       
  
    }
    
}
