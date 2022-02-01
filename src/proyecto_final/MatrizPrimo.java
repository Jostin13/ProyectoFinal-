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
public class MatrizPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* Leer dos matrices 4x6 enteras y determinar si el mayor número primo de una matriz 
        está repetido en la otra matriz.*/
        
        int j,i,k,mA, mB,div;
        mA=0;mB=0;div=0;
        
        int [][] A = new int [4][6];
        int [][] B = new int [4][6];
        int tamañioFilas=6,tamañioColumnas=4;
        for (i = 0; i < tamañioFilas; i++) {
            for ( j = 0; j < tamañioColumnas; j++) {
                System.out.println("Ingrese datos de la matriz A:["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < tamañioFilas; i++) {
            for ( j = 0; j < tamañioColumnas; j++) {
                System.out.println("ingrese datos de la matriz B:["+i+"]["+j+"]= ");
                B[i][j] = leer.nextInt();
            }
        }
        //se presentan los dos vectores
        System.out.println("MATRIZ A");
        
        for(i=0; i<tamañioFilas; i++) {
            for(j=0; j<tamañioColumnas ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("MATRIZ B");
       
        for(i = 0; i < tamañioFilas; i++) {
            for(j = 0;j < tamañioColumnas ; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println(" ");
        }
        //Se comprueba el numero mayor primo de las dos matrices
        
        for (i = 0; i < tamañioFilas; i++) {
         
            for ( j = 0; j < tamañioColumnas; j++) {
              div=0;
                for (k = 1;  k<= A[i][j]; k++) {
                    if(A[i][j]% k ==0){
                        div = div + 1;
                    }
                }
                if((mA < A[i][j])&&(div == 2)){
                    mA = A[i][j];
                }
            }
        }
        System.out.println("Mayor de la matriz A = " +mA);
        
        for (i = 0; i < tamañioFilas; i++) {
          
            for ( j = 0; j < tamañioColumnas; j++) {
            	  div=0;
                for (k = 1;  k<= B[i][j]; k++) {
                    if(B[i][j]% k ==0){
                        div = div + 1;
                    }
                    
                }
                if((mB < B[i][j])&&(div == 2)){
                    mB = B[i][j];
                }
            }
        }
        System.out.println("Mayor de la matriz B = " +mB);
        
        //Comprobar mayor primo A en matriz B
        for(i=0; i<tamañioFilas; i++) {
            for(j=0; j<tamañioColumnas ; j++) {
                if(mA == B[i][j]){
                    System.out.println("El mayor número primo de la matriz A ("+ mA+") "
                            + "está repetido en la matriz B, posición B["+i+"]["+j+"]");
                }
            }
           
        }
        
        //Comprobar mayor primo B en matriz A
        for(i = 0; i < tamañioFilas; i++) {
            for(j = 0;j < tamañioColumnas ; j++) {
                if(mB == A[i][j]){
                    System.out.println("El mayor número primo de la matriz B ("+ mB+") "
                            + "está repetido en la matriz A, posición A["+i+"]["+j+"]");
                }
            }
            
        }
    }
}
