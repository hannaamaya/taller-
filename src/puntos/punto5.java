/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class punto5 {
    public static void main(String[] args) {
        int A=0;
        int B=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print ("Ingrese el valor de A: ");
        A=sc.nextInt();
        System.out.print ("Ingrese el valor de B: ");
        B=sc.nextInt();
        
        if(A>B){
           System.out.print("El nùmero mayor es: "+A+"el numero menor es: "+B);
           }   
         if(B>A){
           System.out.print("El nùmero mayor es: "+B+"el numero menor es: "+A);
           }   
    }
    
}
