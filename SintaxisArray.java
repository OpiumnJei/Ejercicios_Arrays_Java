

/*

Un arreglo es un conjunto de datos del mismo tipo ordenados por indice.

Sintaxis para definir un arreglo:

int[] arreglo1 = new int[4];

*/
package arrays;

import java.util.Scanner;


public class SintaxisArray {
    public static void main(String[] args) {
        int[] arreglo1 = new int[4];
        
        Scanner sc = new Scanner(System.in);
        
        //Rellenar un arreglo
        for(int i = 0; i<4;i++){
            System.out.println("Digite un numero: ");
            arreglo1[i] = sc.nextInt();
        }
        
        //Imprimir un arreglo
         System.out.println("Numero introducidos: ");
        for(int i = 0; i<4;i++){
            System.out.println(arreglo1[i]);
        }
        
     
    }
    
}
