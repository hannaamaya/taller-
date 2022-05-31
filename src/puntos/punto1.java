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
public class punto1 {
    public static void main(String[] args) {
        // declaracion de variables
        int A=0;
        int B=0;
        int C=0;
        
        Scanner sc = new Scanner(System.in);
        // solicitar datos al usuario        
        System.out.print ("Ingrese el valor de A: ");
        A=sc.nextInt();
        System.out.print ("Ingrese el valor de B: ");
        B=sc.nextInt();
        System.out.print ("Ingrese el valor de C: ");
        C=sc.nextInt();
        
        //comprobaciòn numero mayor y menor
        if(A>B&&A>C){
            System.out.print("El nùmero mayor es: "+A);
        }if(B>A&&B>C){
            System.out.print("El nùmero mayor es: "+B);
        }if(C>A&&C>B){
            System.out.print("El nùmero mayor es: "+C);
        }if(A<B&&A<C){
            System.out.print("El nùmero menor es: "+A);
        }if(B<A&&B<C){
            System.out.print("El nùmero menor es: "+B);
        }if(C<B&&C<A){
            System.out.print("El nùmero menor es: "+C);
        }
    }
}
