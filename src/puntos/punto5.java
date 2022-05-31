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
        //Declaracion de variables
        int A=0;
        int B=0;
        // se importo la libreria scanner para solicitar datos al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print ("Ingrese el valor de A: ");
        A=sc.nextInt();
        System.out.print ("Ingrese el valor de B: ");
        B=sc.nextInt();
        
        //se realizo un if para la comprobacion de numero mayor y menor
        if(A>B){
           System.out.print("El nùmero mayor es: "+A+"el numero menor es: "+B);
           }   
         if(B>A){
           System.out.print("El nùmero mayor es: "+B+"el numero menor es: "+A);
           }   
    }
    
}
