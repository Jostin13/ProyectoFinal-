/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Proyecto_Final {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         /*
        Leer n números enteros, almacenarlos en un vector. Luego leer un entero y 
        determinar si este último entero se 
        encuentra entre los 10 valores almacenados en el vector.*/
         
        int n, i, num;
        n=0;num=0;
        
        System.out.println("\nIngrese el tamaño del vector (Mayor a 10): ");
        n = leer.nextInt();
        
        int[] A = new int[n];
        if(n>=10){
            System.out.println("Ingrese un número entero: ");
            num = leer.nextInt();
            for (i = 0; i < n; i++) {
                System.out.print("Ingrese datos del vector A [" + i + "] = ");
                A[i] = leer.nextInt();
            }
            for (i = 0; i < n; i++) {
                System.out.print(A[i] +" ");
            }
            System.out.println(" ");
        
            for (i = 0; i < 10; i++) {
                if(A[i] == num ){
                    System.out.println("El número "+ num + " se encuentra en la posición "
                            + "A["+i+"] del vector.");
                }
            }
        }
        else{
            System.out.println("n NO PUEDE ser menor a 10, reinicie el programa.");
            
        }
    }  
}
