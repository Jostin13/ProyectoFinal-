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
public class Función {
    public static void main(String[] args) {
        /*
        Construir una función que reciba como parámetro un vector de 10 posiciones 
        enteras y un dígito y que retorne la cantidad de números del 
        vector que terminan en dicho dígito
        */
        int dig, i,contador;
         i=0;contador=0;dig=0;
        Scanner leer = new Scanner(System.in);
        int [] A = new int [10];
        System.out.println("Ingrese un digito:");
        dig = leer.nextInt();
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un dato en la posición A["+i+"]");
            A[i] = leer.nextInt();
        }
        contador = contardig(A,dig);
        System.out.println("Existen "+contador+" números que terminan en "+dig
                + " dentro del vector");
        
    }
    
    public static int contardig(int B[], int d){
        int n = 0;
        int i =0;
        for (i = 0; i < 10; i++) {
            if (B[i]% 10 == d){
                n = n+1;
            }
        }
        return n;
    }
}
