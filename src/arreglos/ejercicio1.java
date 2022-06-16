/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ejercicio1 {
    public static void main(String[] args) {
        // se crea array de 5 posiciones
        int[] numeros = new int [5];  
        rellenar(numeros);
        mostrar(numeros);
    }
    public static void rellenar (int[] numerosArreglo){
        for (int i = 0; i < 5; i++) {
             int  texto=Integer.parseInt(JOptionPane.showInputDialog("Digitar el numero: "));
            numerosArreglo[i]=texto;
        }
    }
    public static void mostrar (int[] numerosArreglo){
        for (int i = 0; i < 5; i++) {
            System.out.println("En el indice "+i+"esta el valor"+numerosArreglo[i]);
        }
    }
}
