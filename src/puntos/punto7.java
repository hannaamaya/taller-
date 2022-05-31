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
public class punto7 {
    public static void main(String[] args) {
        
        int A;
        int B;
        int C;
        
         A= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de A: "));
         B= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de B: "));
         C= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de C: "));
         
        if (A<=B&&B<=C){
            JOptionPane.showMessageDialog(null,"El nùmero menor es: "+A);
        }else if(B<=A&&B<=C){
             JOptionPane.showMessageDialog(null,"El nùmero menor es: "+B);
        }else if(C<=A&&C<=B){
             JOptionPane.showMessageDialog(null,"El nùmero menor es: "+C);
        }
    }
    
}
