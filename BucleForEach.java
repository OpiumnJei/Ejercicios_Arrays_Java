
/*
Sintaxis BucleForEach

for (tipo de dato del array: nombre | NombreDelArray ) {;
   instruccion;
}
*/
package arrays;

import java.util.Scanner;


public class BucleForEach {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int Indice;
       
       //Pedimos la cantidad de valores para el array
        System.out.println("Introduzca la cantidad de valores: ");
        Indice = sc.nextInt();
        
        int[]num = new int[Indice];
        
        //Relllenamos el arreglo
        
        for(int i = 0; i<num.length;i++){
            System.out.println((i+1)+". Digita un numero: ");
            num[i] = sc.nextInt();
        }
       
        //Imprimos los numeros introducidos con el bucle For each
        
        System.out.println("Los numeros introducidos fueron: ");
        for(int numeros: num){
            System.out.println(numeros);
        }
        
    }
    
}
