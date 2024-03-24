/*
Pedir 2 arreglos de 12 elementos cada uno, luego pasar los valores
a un tercer arrreglo de la siguiente forma:

tres elementos del primer arreglo, tres elementos del segundo arreglo, etc...
 */
package arrays;

import java.util.Scanner;


public class DosArraysEnUno {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array1 = new int[12];
            int[] array2 = new int[12];
                int[] array3 = new int[24];
                
                
                //Rellenamos el primer arreglo 
                
                System.out.println("1. Primer arreglo: ");
                
                for(int i = 0; i<array1.length;i++){
                    System.out.print("Digite un numero: ");
                    array1[i] = sc.nextInt();
                }
                
                //Rellenamos el segundo arreglo
                System.out.println("2. Segundo arreglo: ");
                
                for(int i = 0; i<array2.length;i++){
                    System.out.print("Digite un numero: ");
                    array2[i] = sc.nextInt();
                }
                
                //pasamos los datos  al tercer arreglo
                 for(int i = 0, j = 0; i<4;i++){
                    array3[j] = array1[i];
                    j++;
                    array3[j] = array1[i+1];
                    j++;
                    array3[j] = array1[i+2];
                    j++;
                    array3[j] = array2[i];
                    j++;
                    array3[j] = array2[i+1];
                    j++;
                    array3[j] = array2[i+2];
                    j++;
                }
                   
                for(int i = 0; i<array3.length;i++){
                    System.out.println(array3[i]);
                    
                }    
                
    }
}
    

