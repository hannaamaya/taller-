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
public class punto2 {
    public static void main(String[] args) {
        // declaraciòn de variables
        int n, sum;
        sum =0;
        
        //se realizco for para realizar la suma de los numeros del 1 y 10
        for (n=1;n<=10;n++){
            sum=sum+n;
        }  
        //se envio un mensaje de resultado
        JOptionPane.showMessageDialog(null,"La suma de los números ente 1 y 10 es: "+sum);  
    }
    
}
