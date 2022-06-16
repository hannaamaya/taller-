/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Administrador
 */
public class ejercicio4 {
    public static void main(String[] args) {
         
        //Creo un array
        int[] tamano=new int[100];
         
        //Declaro las variables necesarias
        int suma=0;
        double media;
         
        //Recorro el array, asigno números y sumo
        for(int i=0;i<tamano.length;i++){
            tamano[i]=i+1;
            suma+=tamano[i];
        }
         
        //Calculo la media y muestro la suma y la meda
        System.out.println("La suma total es "+suma);
         
        media=(double)suma/tamano.length;
         
        System.out.println("La media es "+media);
         
    }
     
    
}
