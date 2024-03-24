/*
 Crear un array con una dimension de 10 espacios, leer mediante el teclado 8 numeros,
despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada,
desplazando los que esten detras.
 */
package arrays;

import java.util.Scanner;

public class DesplazarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[10];
        
        //Rellenamos el arreglo, solo 8 posiciones
        
        for(int i = 0; i<8;i++)
        {
            System.out.print("Digite un numero: ");
            array[i] = sc.nextInt();
        
        }
        
        int posicion, numero;
         System.out.print("Digite el nuevo valor de la posicion: ");
        numero = sc.nextInt();
        System.out.print("Que posicion desea reemplazar: ");
        posicion = sc.nextInt();
       
        for(int i = 7; i>=posicion; i--)
        {
        array[i+1] = array[i];
        }
        array[posicion] = numero;
        
        System.out.println("Nueva distribucion del arreglo: ");
        for(int i: array){
            System.out.println(i);
        
        }
        
   
        
    }
    
}
