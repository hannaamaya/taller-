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
public class ejercicio3 {
    public static void main(String[] args) {
   
        //Indicamos el tamaño
        String tamano=JOptionPane.showInputDialog("Introduce el tamaño deseado: ");
        int num[]=new int[Integer.parseInt(tamano)];
   
        //Invocamos las funciones
        rellenarPrimo(num, 1, 100);
   
        mostrarPrimo(num);
         
        //Saco el primo mayor
        int primoMayor=numMayor(num);
        System.out.println("El primo más grande es el "+primoMayor);
    }
   
    public static void rellenarPrimo(int numPrimos[], int a, int b){
   
        int i=0;
   
        //Usamos mejor un while, ya que solo aumentara cuando genere un primo
        while(i<numPrimos.length){           
            int num=((int)Math.floor(Math.random()*(a-b)+b));           
            if (esPrimo(num)){              
                numPrimos[i]=num;               
                i++;            
            }       
        }   
    }   
    private static boolean esPrimo (int num){       
          
        //Un numero negativo, el 0 y el 1, son directamente no primos.
        if (num<=1){
            return false;
        }else{
  
            //declaracion       
            int prueba;         
            int contador=0;
            //Hacemos la raiz cuadrada y lo usamos para dividir el numero original
            prueba=(int)Math.sqrt(num);
            //Bucle que cuenta los numeros divisibles, podemos hacerlo con while
            for (;prueba>1;prueba--){
                if (num%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
   
    public static void mostrarPrimo(int numPrimo[]){
        for(int i=0;i<numPrimo.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+numPrimo[i]);
        }
    }
     
    public static int numMayor(int lista[]){
        int numMayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>numMayor){
                numMayor=lista[i];
            }
        }
         
        return numMayor;
    }
         
}
 