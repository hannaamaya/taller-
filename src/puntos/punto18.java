/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class punto18 {
    public static void main(String[] args) {
        //declaracion de variables
        int a,b,c,d;
        int opcionElegir;
         
        
        // solicitud datos al usuario 
       JOptionPane.showMessageDialog(null, "1. Numero Mayor \n 2.Numero Menor \n 3. Numeros Iguales");
       opcionElegir=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcion a elegir: "));
    
        switch (opcionElegir) {
            case 1:
                System.out.println("Numero Mayor");
                a=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de a: "));
                b=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de b: "));
                c=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de c: "));
                d=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de d: "));
                if(a>b && a>c && a>d){
                    JOptionPane.showMessageDialog(null,"El numero mayor es: "+a);
                }else if (b>a && b>c && b>d){
                    JOptionPane.showMessageDialog(null,"El numero mayor es: "+b);
                }else if (c>a && c>b && c>d){
                    JOptionPane.showMessageDialog(null,"El numero mayor es: "+c);
                }else{
                    JOptionPane.showMessageDialog(null,"El numero mayor es: "+d);
                }
                break;    
                
            case 2:
                System.out.println("Numero Menor");
                a=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de a: "));
                b=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de b: "));
                c=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de c: "));
                d=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de d: "));
                if(a<b && a<c && a<d){
                    JOptionPane.showMessageDialog(null,"El numero menor es: "+a);
                }else if (b<a && b<c && b<d){
                    JOptionPane.showMessageDialog(null,"El numero menor es: "+b);
                }else if (c<a && c<b && c<d){
                    JOptionPane.showMessageDialog(null,"El numero menor es: "+c);
                }else{
                    JOptionPane.showMessageDialog(null,"El numero menor es: "+d);
                }
                break;   
                
            case 3:
                System.out.println("Numeros Iguales");
                a=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de a: "));
                b=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de b: "));
                c=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de c: "));
                d=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de d: "));
                if(a==b && a==c && a==d){
                    JOptionPane.showMessageDialog(null,"Todos los numeros son iguales");
                }else if (a!=b && a!=c && a!=d){
                    if (b==c && b==d){
                       JOptionPane.showMessageDialog(null,"El numero diferente es: "+"\n a: "+a+"\n Los numeros iguales son: "+"\n b: "+b+"\n c: "+c+"\n d: "+d); 
                    }else {
                        JOptionPane.showMessageDialog(null, "Dos o mas numeros son diferentes");
                    }
                }else if (b!=a && b!=c && b!=d){
                     if (c==c && c==d){
                        JOptionPane.showMessageDialog(null,"El numero diferente es: "+"\n b: "+b+"\n Los numeros iguales son: "+"\n a: "+a+"\n c: "+c+"\n d: "+d);
                }else{
                        JOptionPane.showMessageDialog(null, "Dos o mas numeros son diferentes");
                    }
                }else if (c!=a && c!=b && c!=d){
                    if (d==b && d==c){
                    JOptionPane.showMessageDialog(null,"El numero diferente es: "+"\n c: "+c+"\n Los numeros iguales son: "+"\n a: "+a+"\n b: "+b+"\n d: "+d);
                }else{
                        JOptionPane.showMessageDialog(null, "Dos o mas numeros son diferentes");
                    }
                    
                }else if (d!=a && d!=b && d!=c){
                    JOptionPane.showMessageDialog(null,"El numero diferente es: "+"\n d: "+d+"\n Los numeros iguales son: "+"\n a: "+a+"\n b: "+b+"\n c: "+c);
                }
                
                break;       
            default:
                throw new AssertionError();
                
        }
    }
}
