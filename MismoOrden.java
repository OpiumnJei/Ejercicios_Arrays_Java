/*
Pedir 5 numeros al usuario e imprimirlos en el mismo orden
 */
package arrays;

import java.util.Scanner;


public class MismoOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[5];
        
        //Rellenamos el array
        
        for(int i = 0; i<n.length;i++){
            System.out.print((i+1)+". Digite un numero: ");
            n[i] = sc.nextInt();
        
        }
        
        //Imprimimos el array con el bucle for each
        
        System.out.println("Numeros introducidos: ");
        for(int i: n){
            System.out.println(i);
        
        }
        
    
    }
    
}
