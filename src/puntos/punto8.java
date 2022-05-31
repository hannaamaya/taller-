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
public class punto8 {
    public static void main(String[] args) {
        //Declaracion de variables
        int A;
        int B;
        int C;
        
        //solicitud de datos al usuario 
        A= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de A: "));
        B= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de B: "));
        C= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de C: "));
        
        //se realizo la comprobacion con un if, else if para que el sistema indique cual es el numero del medio de tres variables 
        if(A>=B&&A>=C){ 
            if(B<C){
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+C);
            }else{
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+B);
            }           
        }else if(B>=A&&B>=C){ 
            if(A<C){
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+C);
            }else{
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+A);
            }           
        }else if(C>=A&&C>=B){ 
            if(B<A){
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+A);
            }else{
                JOptionPane.showMessageDialog(null,"el nùmero del medio es: "+B);
            }           
        }   
    }
}
