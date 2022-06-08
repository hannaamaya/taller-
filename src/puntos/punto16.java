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
public class punto16 {
    public static void main(String[] args) {
        
         //Declaración de variables
        float montoCompra,montoCompraTotal;
        float descuento;
        
        // solicitar datos al usuario
        montoCompra=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor de su compra: "));
        
        // caso en donde determine y compruebe el porcentaje de descuentos de acuerdo a la compra
        if (montoCompra>=300){
            descuento=(montoCompra*25)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento);
        }else if (montoCompra>=150 && montoCompra<=300){
            descuento=(montoCompra*20)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento);
        }else{
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+" "+"No tiene descuento");
        }
        
        
    }
    
}
