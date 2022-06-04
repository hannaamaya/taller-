

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
public class punto10 {
    public static void main(String[] args){
        
            //Declaraciòn de variables
            int lado1=0;
            int lado2=0;
            int lado3=0;
            
            //solicitud datos al usuario
            lado1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del lado1 "+"cm"));
            lado2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del lado2 "+"cm"));
            lado3=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del lado3 "+"cm"));
            
            //se utiliza if para realizar la comprobaciòn de tipos de triangulos
              if (lado1==lado2 && lado1==lado3){
                JOptionPane.showMessageDialog(null,"Es un triangulo Equilátero");
              }else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){ 
                JOptionPane.showMessageDialog(null,"Es un triangulo Escaleno");   
              }else if (lado1>=lado2 || lado1!=lado2 && lado1>=lado3 || lado1!=lado3 ){
                JOptionPane.showMessageDialog(null,"Es un triangulo Isóceles");
              }
    }
}
