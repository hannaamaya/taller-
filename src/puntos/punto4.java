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
public class punto4 {
    
    public static void main(String[] args) {
        // Declaraciòn de variables 
        int N=0;
        int modulo=0;
       
        //solicitud datos al usuario
        N= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un nùmero: "));
        modulo=N%2;
        
         // se creo un if para la comprobaciòn de un numero par o impar
        if(modulo==0){JOptionPane.showMessageDialog(null,"El nùmero es par");
        }else{JOptionPane.showMessageDialog(null,"El nùmero es impar");}
    }
   
}
