/*
Escribe un programa que busque la posición de un elemento dado en un arreglo.
 */
package arrays;

import java.util.Scanner;

public class BuscarUnElemento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Arreglo: ");
        for(int i: arr)
        {
            System.out.print(+i+" ");
        }
        
        System.out.println("\nQue posicion quiere buscar en el arreglo: ");
        posicion = sc.nextInt();
        
        System.out.println("En la posicion "+posicion+" esta almacenado el numero "+arr[posicion]);
        
    }
    
}
