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
public class ejercicio7 {

    public static void main(String[] args) {

        //solicitar tamaño al usuario
        String dato = JOptionPane.showInputDialog("Introduce el tamaño deseado: ");
        int tamano = Integer.parseInt(dato);

        //Creamos los arrays
        int array1[] = new int[tamano];
        int array2[];

        //Asignamos el rellenamos el array1
        rellenarNum(array1, 10, 100);

        //Se escoge del array2 al array1
        array2 = array1;

        //se crea un nuevo arreglo, usando el array1. Array1 tendra una nueva direccion.
        array1 = new int[tamano];

        //Se vuelve a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
        rellenarNum(array1, 10, 100);

        //Contiene el array con el resultado de multiplicar los valores de los arrays
        int array3[] = multiplicador(array1, array2);

        //Mostramos el contenido de los arrays
        System.out.println("Array1");
        mostrarArray(array1);

        System.out.println("Array2");
        mostrarArray(array2);

        System.out.println("Array3");
        mostrarArray(array3);

        //Llamamos al recolector de basura
        System.gc();

    }

    public static void rellenarNum(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }

    public static int[] multiplicador(int array1[], int array2[]) {
        int array3[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }
        return array3;
    }
}
