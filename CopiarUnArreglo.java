
//Crear un arreglo de 5 posiciones, copiar este arreglo en otro
package arrays;


public class CopiarUnArreglo {

    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        int[] arr2 = new int[5];
        
        
        for(int i = 0, j = 0; i<5; i++,j++){
            
            arr2[j] = arr[i];
   
        }

        for(int i: arr2){
            System.out.println(i+" ");
 
        }
    }
    
}
