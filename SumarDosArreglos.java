/*
Declarar dos arreglos y luego sumarlos en un tercero
 */
package arrays;


public class SumarDosArreglos {

    
    public static void main(String[] args) {
       
        int[] arr1 = {1,2,3,4,5};
         int[] arr2 = {6,7,8,9,10};
         int[] suma = new int[5];
         
         for(int i = 0, j = 0, k = 0; i<suma.length; i++,j++,k++){
             suma[k] = arr1[i] + arr2[j];
         }
         
         for(int i: suma){
             System.out.println(i+" ");
         }
    }
    
}
