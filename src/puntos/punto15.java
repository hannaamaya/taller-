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
public class punto15 {
    public static void main(String[] args) {
        // declaracion de variables, numeros decimales
        float num,numerosaSumar,suma;
        float media;
        //inicializacion variable
        suma=0; 
        //se realizo el for para realizar 10 veces la suma
        for (int i = 0; i < 10; i++) {
            num=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero negativo : "));
            if(num<0){
                numerosaSumar=num;
                suma=suma+numerosaSumar;
            }else{
                JOptionPane.showMessageDialog(null, "el numero no es negativo");
            }  
        }
        media=suma/10;
        JOptionPane.showMessageDialog(null, "la media es: "+media);
    }   
    
}
