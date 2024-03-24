/*
Calcular el promedio de los numeros introducidos en arreglo de 10 posiciones.
 */
package arrays;

public class Promedio {

 
    public static void main(String[] args) { 
        
        double promedio = 0;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        
        //sumamos los elementos del arreglo
        
        for(int i = 0; i<arr1.length;i++){
            
            promedio+=arr1[i];
 
        }    
        
        System.out.println("Promedio: "+promedio/arr1.length);
        
    }
    
}
