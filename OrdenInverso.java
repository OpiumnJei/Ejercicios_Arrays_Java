/*
Pedir 5 numeros al usuario e imprimirlos en el orden inverso
 */
package arrays;

import java.util.Scanner;


public class OrdenInverso {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
        int[] n = new int[5];
        
        //Rellenamos el array
        
        for(int i = 0; i<n.length;i++){
            System.out.print((i+1)+". Digite un numero: ");
            n[i] = sc.nextInt();
        
        }
        
        //Imprimimos el arreglo en orden inverso
         for(int i = n.length; i!=0;i--){
            System.out.print(i);
            
        }
        
    
    }
    
    }
    

