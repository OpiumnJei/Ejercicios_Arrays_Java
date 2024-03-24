/*
Crear un programa que calcule el promedio de un arreglo de N longitud, 
N sera introducida por el usuario, 
rellenar N mediante el teclado.
 */
package arrays;

import java.util.Scanner;

public class PromedioPorUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        double promedio = 0;
        
        //pedimos al usuario el tamano que tendra el arreglo
        
        System.out.println("Introduzca el tamano del arreglo: ");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
        //LLenamos el arreglo 
        
        for(int i = 0; i<arr.length; i++){
            System.out.print("Digite un numero: ");
            arr[i] = sc.nextInt();
        }
        
        //Suma iterativa de todos los numeros del arreglo
        
         for(int i = 0; i<arr.length; i++){
            promedio+=arr[i];
        }
         
         //Sacamos el promedio y lo imprimimos
        
         System.out.println("El promedio  es: "+promedio/arr.length);
    }
    
}
