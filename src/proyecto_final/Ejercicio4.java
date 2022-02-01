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
public class Ejercicio4 {
     public static void main(String[] args) {
         /*
        Una matriz tiene un punto de silla en una de sus componentes si 
        este es el mayor valor de su columna y el menor de su fila. Dise˜ne un algoritmo que
        recibiendo una matriz n×n muestre las coordenadas de todos sus puntos silla
         */
        int mayor, menor,i,j,n,k,l,mayor1,contador;
        mayor=0; menor=0; i=0; j=0;n=0;k=0;l=0;mayor1=0;contador=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz cuadrada:");
        n = leer.nextInt();
        int [][] A = new int [n][n];
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                System.out.println("Ingrese los datos de A["+i+"]["+j+"]: ");
                A[i][j] = leer.nextInt();
            }  
        }
        
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                System.out.print( A[i][j] + "     ");
            }
            System.out.println("  ");
        }
        for (j = 0; j < n; j++ ) {
            
            mayor = 0;
            mayor1=0;
            for (i = 0; i < n; i++) {
                if(mayor<A[i][j]) {
                    mayor = A[i][j];
                    k=i;
                }
                menor = mayor+1;
            }
            for (int m = 0; m < n; m++) {
                if(mayor <= A[k][m]){
                    mayor1 = A[k][m];
                }
            }
            for (int g = 0; g <n; g++) {
                if((menor>A[k][g])&&(mayor != mayor1)){
                    menor = A[k][g];
                    l=g;
                }
            }
            if((mayor == A[k][l] )&&( menor== A[k][l])){
                contador = contador +1;
                System.out.println("El punto silla número "+ contador + " se encuentra en A[ "+k+"]"
                        + "["+l+"]");
            }
        } 
    }
}
