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
public class punto3 {
    
    public static void main(String[] args) {
        
        int R;
        int H;
        float A;
        float pi=3.1416f;
        float V;
        R=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Radio: "));
        H=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Altura: "));
        
        A=2*pi*R*(R+H);
        
        JOptionPane.showMessageDialog(null,"El area del cilindro es: "+A);
       
        V= pi*(R*R)*H;
        
        JOptionPane.showMessageDialog(null,"El volumen del  cilindor es: "+V);
    }
}
