/*
Programa para centro educativo. cada grupo o clase esta compuesto por 5 alumnos. 
Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. 
dedemos mostrar la nota media del grupo en cada trimestre y la nota media del alumno que se 
encuentra en la posicion N. (N se digitara por teclado).
 */
package arrays;

import java.util.Scanner;


public class NotasAlumnos {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int aux = 0, n;
       float notaMedia1,notaMedia2,notaMedia3, promedioAlumno;
        int[] PrimerTri = new int[5];
          int[] SegundoTri = new int[5];
            int[] TercerTri = new int[5];
            
             System.out.println("PRIMER TRIMESTRE");
             
                    for(int i = 0; i<5; i++){
                        System.out.print("Alumno "+(i+1)+". Digite una calificacion: ");
                        PrimerTri[i] = sc.nextInt();
                        
                        aux+=PrimerTri[i];
                    }
                    
                notaMedia1 = aux / 5;
               aux = 0;
                System.out.println("SEGUNDO TRIMESTRE");
             
                    for(int i = 0; i<5; i++){
                        System.out.print("Alumno "+(i+1)+". Digite una calificacion: ");
                        SegundoTri[i] = sc.nextInt();
                        
                        aux+=SegundoTri[i];
                    }
                    
                notaMedia2 = aux / 5;
                aux = 0;
                System.out.println("TERCER TRIMESTRE");
             
                    for(int i = 0; i<5; i++){
                        System.out.print("Alumno "+(i+1)+". Digite una calificacion: ");
                        TercerTri[i] = sc.nextInt();
                        
                        aux+=TercerTri[i];
                    }
                    
                notaMedia3 = aux / 5;
                
                System.out.println("Nota media del primer trimestre: "+notaMedia1);
                 System.out.println("Nota media del segundo trimestre: "+notaMedia2);
                 System.out.println("Nota media del Tercer trimestre: "+notaMedia3);
                 
                 System.out.println("Indica de que alumno quieres saber la calificacion promedio: ");
                 n = sc.nextInt();
                 
                 promedioAlumno = ((PrimerTri[n] + SegundoTri[n] + TercerTri[n]) / 3);
                 System.out.println("Nota promedio del alumno "+n+": "+promedioAlumno);
    
    }
    
}
