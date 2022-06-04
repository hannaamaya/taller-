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
public class punto12 {
    public static void main(String[] args) {
        
        int montoCompra,montoCompraTotal;
        int descuento;
       
        montoCompra=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de su compra: "));
        
        if (montoCompra>100){
            descuento=(montoCompra*10)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento+"%");
        }else if (montoCompra>50 && montoCompra<=100){
            descuento=(montoCompra*2)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento+"%");
        }else{
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+" "+"No tiene descuento");
        }
         
    }
   
}
