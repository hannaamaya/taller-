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
public class ejercicio2 {
    public static void main(String[] args) {
        //solicitud de tamaño del array al usuario 
        int datos=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del tamaño: "));
        
        int[] aleatorio = new int [datos]; 
        
        rellenarNumAleatorios(aleatorio,datos);
        mostrarNumAleatorios(aleatorio);
    }
    public static void rellenarNumAleatorios (int[]aleatorio, int datos){
        for (int i =0; i < datos; i++){
            int numAleatorio=((int)Math.floor(Math.random()*(0-9)+9));
             aleatorio[i]=numAleatorio;
        }
    }
    public static void mostrarNumAleatorios (int aleatorio[]){
        for (int i =0; i < aleatorio.length;i++){
            System.out.println("En el indice"+","+i+","+"esta el valor: "+aleatorio[i]);
        }
    }
}

