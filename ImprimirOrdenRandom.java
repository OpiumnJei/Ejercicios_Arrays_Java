/*
Leer 10 numeros enteros y guardarlos en un arreglo. 
Luego imprimir en el siguiente orden:
el primero, el ultimo, el segundo, el penunltimo, el tercero, el antepenultimo, etc...
*/


package arrays;

import java.util.Scanner;


public class ImprimirOrdenRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[]num = new int[10];
        
        System.out.println("Rellene el arreglo: ");
        
        //llenamos el arreglo
        for(int i = 0; i<num.length;i++){
            System.out.print((i+1)+". Digite un numero: ");
            num[i] = sc.nextInt();
        }
           
        //Imprimimos 
         for(int i = 0; i<5;i++){
            System.out.println(num[i]);
            System.out.println(num[9-i]);    
    }
    
}
}