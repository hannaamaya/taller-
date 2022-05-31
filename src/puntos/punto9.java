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
public class punto9 {
    public static void main(String[] args) {
        int n1,n2,n3,n4;
        int promedio;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de n1: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de n2: "));
        n3= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de n3: "));
        n4= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de n4: "));
        
        if (n1<n2 && n1<n3 && n1<n4){
            JOptionPane.showMessageDialog(null, "La nota màs baja es: "+n1);
            promedio=(n2+n3+n4)/3;
            JOptionPane.showMessageDialog(null, "El promedio fue: "+promedio);
        }else if  (n2<n1 && n2<n3 && n2<n4){
            JOptionPane.showMessageDialog(null, "La nota màs baja es: "+n2);
            promedio=(n1+n3+n4)/3;
            JOptionPane.showMessageDialog(null, "El promedio fue: "+promedio);
        }else if  (n3<n1 && n3<n2 && n3<n4){
            JOptionPane.showMessageDialog(null, "La nota màs baja es: "+n3);
            promedio=(n1+n2+n4)/3;
            JOptionPane.showMessageDialog(null, "El promedio fue: "+promedio);
        }else if  (n4<n1 && n4<n2 && n4<n3){
            JOptionPane.showMessageDialog(null, "La nota màs baja es: "+n4);
            promedio=(n1+n2+n3)/3;
            JOptionPane.showMessageDialog(null, "El promedio fue: "+promedio);
        }    
    }
}
