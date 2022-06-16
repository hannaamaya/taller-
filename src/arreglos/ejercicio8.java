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
public class ejercicio8 {

    public static void main(String[] args) {

        //Indicamos el tamaño
        String tamano = JOptionPane.showInputDialog("Introduce el tamaño deseado: ");
        int numeros[] = new int[Integer.parseInt(tamano)];

        int digitoFinal;
        do {
            tamano = JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            digitoFinal = Integer.parseInt(tamano);
        } while (!(digitoFinal >= 0 && digitoFinal <= 9));

        //Se rellena el array
        rellenarNumAleatorioArray(numeros, 1, 300);

        //Creamos un array que contenga los numeros terminados en el numero especificado
        int terminadosEn[] = numTerminadosEn(numeros, digitoFinal);

        //Mostramos el resultado, mira el metodo de mostrarArrays
        //  mostrarArrayTerminadosEn(num);
        mostrarTerminadosEn(terminadosEn);

    }

    public static void rellenarNumAleatorioArray(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarTerminadosEn(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            //No incluimos las posiciones que tengan un 0
            if (lista[i] != 0) {
                System.out.println("El numero " + lista[i] + " acaba en el numero deseado");
            }
        }
    }

    public static int[] numTerminadosEn(int num[], int ultimo_numero) {

        //Array que almacenara los numeros terminados en el numero pedido
        int terminadosEn[] = new int[num.length];

        int terminaNum = 0;

        for (int i = 0; i < terminadosEn.length; i++) {

            /*
             * Restamos el numero por el mismo numero sin unidades
             * Por ejemplo, 325-320=5
             */
            terminaNum = num[i] - (num[i] / 10 * 10);

            //Si el numero obtenido es el buscado, lo añadimos
            if (terminaNum == ultimo_numero) {
                terminadosEn[i] = num[i];
            }
        }

        return terminadosEn;
    }

}
