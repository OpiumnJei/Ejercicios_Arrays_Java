/*
Desarrolla un programa que encuentre el valor máximo en un arreglo.
 */
package arrays;

import java.util.Scanner;


public class MayorDeUnArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int i = 0; i<arr.length; i++){
            System.out.print((i+1)+". Introd un numero: ");
            arr[i] = sc.nextInt();
        }
        
        //Declaramos una variable que almacenara el valor maximo, tenemos como premisa que el valor max esta en el indice 0
        
        int max = arr[0];
        
        //Creamos un nuevo bucle for para recorrer todo el arreglo e ir comparando los demas indices.
        
        for(int i = 1; i<arr.length;i++){//iniciamos i = 1, porque el valor del indice 0 ya lo tenemos en la variable max 
            if(arr[i] > max){
            max = arr[i];
            }

        }
           //Imprimimos el mayor valor
          System.out.println("EL mayor de los numeros es: "+ max);
    }
    
}
