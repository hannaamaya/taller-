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
public class punto17 {
    public static void main(String[] args) {
        
        float sueldo,descuento;
        float porcentaje;

        sueldo=Float.parseFloat(JOptionPane.showInputDialog(null,"El sueldo es: "));

        if (sueldo<=1000){
            porcentaje=sueldo*10/1000;
            descuento=sueldo-porcentaje;
            JOptionPane.showMessageDialog(null,"Su sueldo es: "+sueldo+" \n Se le desconto: 10%"+"\n Su sueldo total es: "+descuento);
        }else if (sueldo<1000 && sueldo==2000 ){
            porcentaje=sueldo*15/2000;
            descuento=sueldo-porcentaje;
            JOptionPane.showMessageDialog(null,"Su sueldo es: "+sueldo+" \n Se le desconto: 5%"+"\n Su sueldo total es: "+descuento);
        }else if (sueldo<200){
            porcentaje=sueldo*18/2000;
            descuento=sueldo-porcentaje;
            JOptionPane.showMessageDialog(null,"Su sueldo es: "+sueldo+" \n Se le desconto: 5%"+"\n Su sueldo total es: "+descuento);
        }      
    }  
}
