/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;
import java.util.Scanner;


/**
 *
 * @author Administrador
 */
public class ejercicio6 {
     public static void main(String[] args) {
         
        Scanner sn=new Scanner(System.in);
         
        //solicitud frase al usuario
        System.out.println("Escriba una frase");
         
        //se uso nextLine por los espacios
        String frase=sn.nextLine(); 
         
        //arreglo caracteres
        char caracteres[]=new char[frase.length()];
         
        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }
         
    }
}

