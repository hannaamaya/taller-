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
public class ejercicio9 {

    public static void main(String[] args) {

        //se declara una constante para la division
        final int dividir = 23;

        //se inserta el DNI
        String datos = JOptionPane.showInputDialog("Escribe los numeros de tu DNI");
        int dni = Integer.parseInt(datos);

        //se saca el restante
        int res = dni % dividir;

        //se llama al metodo
        char caracter = caracter(res);

        //Se  el DNI completo
        System.out.println("Tu DNI es: "+"\n"+dni+","+caracter);

    }

    public static char caracter(int res) {

        //Definimos el array de char
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Devolvemos el valor en la posicion del array
        return letras[res];
    }
}
