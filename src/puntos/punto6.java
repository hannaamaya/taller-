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
public class punto6 {
    public static void main(String[] args) {
        //declaracion de variables
        float velocidad;
        float velocidadTotal;
        
        //se importo la libreria JOptionPane para solicitar datos al usuario, a su vez se convirtio a un int con parse.int
         velocidad= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la velocidad del vehiculo: "+"Km/h"));

         velocidadTotal=(velocidad/3.6f);
           JOptionPane.showMessageDialog(null,"La velocidad en m/s es : "+velocidadTotal);
    }
}
