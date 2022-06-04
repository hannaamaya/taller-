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
public class punto11 {
    public static void main(String[] args) {
        //Se declaran las variables
         int A,B,C;
         String numeroMayor,numerodelMedio,numeroMenor;
         
        //se solicitan datos al usuario 
        A=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de A: "));
        B=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de B: "));
        C=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de C: ")); 
        
       // Se crean tres casos para Ordenar de mayor a menor
       // primer caso
       if(A>=B && A>=C){
            numeroMayor="El número mayor es: "+A;
            JOptionPane.showMessageDialog(null,numeroMayor);
            if (B>=C){
                numerodelMedio="El número del medio es: "+B;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="El número menor es: "+C;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }else{
                numerodelMedio="El número del medio es: "+C;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="Elnúmero menor es: "+B;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }
        // segundo caso    
        }if(B>=A && B>=C){
            numeroMayor="El número mayor es: "+B;
            JOptionPane.showMessageDialog(null,numeroMayor);
            if (A>=C){
                numerodelMedio="El número del medio es: "+A;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="El número menor es: "+C;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }else{
                numerodelMedio="El número del medio es: "+C;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="Elnúmero menor es: "+A;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }
        // tercer caso    
        }if(C>=A && C>=B){
            numeroMayor="El número mayor es: "+C;
            JOptionPane.showMessageDialog(null,numeroMayor);
            if (B>=A){
                numerodelMedio="El número del medio es: "+B;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="El número menor es: "+A;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }else{
                numerodelMedio="El número del medio es: "+A;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="Elnúmero menor es: "+B;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }
        }
        
        //Se crean tres casos para ordenar de menor a mayor
        
         if(A<=B && A<=C){
            numeroMenor="El número menor es: "+A;
            JOptionPane.showMessageDialog(null,numeroMenor);
            if (B<=C){
                numerodelMedio="El número del medio es: "+C;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMayor="El número mayor es: "+B;
                JOptionPane.showMessageDialog(null,numeroMayor);
            }else{
                numerodelMedio="El número del medio es: "+B;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMenor="El número mayor es: "+C;
                JOptionPane.showMessageDialog(null,numeroMenor);
            }
        //segundo caso    
        }if(B<=A && B<=C){
            numeroMenor="El número menor es: "+B;
            JOptionPane.showMessageDialog(null,numeroMenor);
            if (A<=C){
                numerodelMedio="El número del medio es: "+A;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMayor="El número mayor es: "+C;
                JOptionPane.showMessageDialog(null,numeroMayor);
            }else{
                numerodelMedio="El número del medio es: "+C;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMayor="Elnúmero mayor es: "+A;
                JOptionPane.showMessageDialog(null,numeroMayor);
            }
        // tercer caso    
        }if(C<=A && C<=B){
            numeroMenor="El número menor es: "+C;
            JOptionPane.showMessageDialog(null,numeroMenor);
            if (A<=B){
                numerodelMedio="El número del medio es: "+A;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMayor="El número mayor es: "+B;
                JOptionPane.showMessageDialog(null,numeroMayor);
            }else{
                numerodelMedio="El número del medio es: "+B;
                JOptionPane.showMessageDialog(null,numerodelMedio);
                numeroMayor="El número mayor es: "+A;
                JOptionPane.showMessageDialog(null,numeroMayor);
            }
        }
    }
} 
          