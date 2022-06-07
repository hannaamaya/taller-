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
public class punto14 {
    public static void main(String[] args) {
        //solicitud de variables
         int cuadrado,perimetroCuadrado,triangulo,perimetroTrianguloEquilatero;
         int eligeOpcion;
         float circulo,perimetroCirculo;
         
         // mostrar opciones para el usuario seleccione 
        JOptionPane.showMessageDialog(null, "1.cuadrado \n 2. triangulo \n 3. circulo");
        eligeOpcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcicion : "));
       
        //se utiliza el switch para realizar las opciones de los casos a elegir
        switch (eligeOpcion){
            case 1:
                System.out.println("cuadrado");
                cuadrado=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la longitud del cuadrado: "+" cm"));
                perimetroCuadrado= cuadrado+cuadrado+cuadrado+cuadrado;
                JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+perimetroCuadrado+ "cm");
                break;
            case 2:    
               System.out.println("triangulo equilatero");
               triangulo=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la longitud del triangulo equilatero: "+"cm"));
               perimetroTrianguloEquilatero=triangulo+triangulo+triangulo;
               JOptionPane.showMessageDialog(null, "El perimetro del triangulo equilatero es: "+perimetroTrianguloEquilatero+"cm");
                break; 
            case 3:    
               System.out.println("circulo");
               circulo=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la longitud del circulo: "+"cm"));
               perimetroCirculo=(2*3.1416f)*circulo;
               JOptionPane.showMessageDialog(null, "El perimetro de la circunferencia es: "+perimetroCirculo);
               break;
            default:
                System.out.println("error");
        }
        
    }
    
}
