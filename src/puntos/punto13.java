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
public class punto13 {
    public static void main(String[] args) {
        
        int num1,num2,num3,num4;
        
        
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del número 1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del número 2: "));
        num3=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del número 3: "));
        num4=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor del número 4 : "));
    
        if(num1<=num2 && num1<=num3 && num1<=num4){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num1);
            if(num2<=num3 && num2<=num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num2);
                if (num3<=num4){
                    JOptionPane.showMessageDialog(null,"el tercer numero es: "+num3);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }else{
                    JOptionPane.showMessageDialog(null,"el tercer numero es: "+num4);
                    JOptionPane.showMessageDialog(null,"el cuarto numero es: "+num3);
                }
            }else if (num3<=num2 && num3<=num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num3);
                if (num2<=num4){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num2);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }else{
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num4);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num2);
                }
            }else if (num4<=num2 && num4<=num3){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num4);
                if (num2<=num3){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num2);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num3);
                }else{
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num3);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num2);
                }
            }    
        }else if (num2<=num1 && num2<=num3 && num2<=num4){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num2);
            if (num1<=num3 && num1<=num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num1);
                if(num3<=num4){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num3);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }else {
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num3);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }
            }else if (num3<=num1 && num3<=num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num3);
                if(num1<=num4){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num1);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }else{
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num4);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num1);
                }
            }else if(num4<=num1 && num4<=num3){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num4);
                if(num1<=num3){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num1);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num3);
                }else{
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num3);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num1);
                }
            }
        } else if (num3<=num1 && num3<=num2 && num3<=num4){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num3);
            if(num1<=num2 && num1<num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num1);
                if(num2<=num4){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num2);
                    JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
                }
            }else if (num2<=num4 && num2<num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num2);
            }else if(num4<=num1 && num4<num2){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num4);
            }
        }else if (num4<=num1 && num4<=num2 && num4<=num3){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num4);
            if (num1<=num2 && num1<=num3){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num1);
            }else if (num2<=num1 && num2<=num3){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num2);
            }else if (num3<=num1 && num3<=num2){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num3);
            }
        }
        
        
        
       
        
        
        
        
        
        /*if(num1<num2 && num1<num3 && num1<num4){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num1);
           if (num2<=num3 && num2<=num4){
                JOptionPane.showMessageDialog(null, "el segundo numero es: "+num2);
                if (num3>num1 && num3>=num2 && num3<=num4){
                    JOptionPane.showMessageDialog(null, "el tercer numero es: "+num3);
                    if (num4>num1 && num4>=num2 && num4>=num3){
                        JOptionPane.showMessageDialog(null,"el cuarto numero es: "+num4);
                    }
                }
            }
        } if (num2>=num1 && num2>=num3 && num2<num4 ){
            JOptionPane.showMessageDialog(null, "el segundo numero es: "+num3);
            JOptionPane.showMessageDialog(null, "el tercer numero es: "+num2);
            JOptionPane.showMessageDialog(null, "el cuarto numero es: "+num4);
        } if(num3>num1 && num3<num2 && num3<num4){
            JOptionPane.showMessageDialog(null, "el primer numero es: "+num1);
            if (num2>num1 && num2>=num3 && num2<=num4){
                JOptionPane.showMessageDialog(null, "el tercer numero es: "+num2);
                if (num3>num1 && num3<=num2 && num3<=num4){
                    if (num4>num1 && num4>=num2 && num4>=num3){
                        JOptionPane.showMessageDialog(null,"El primer número es: "+num1+"\n El segundo número es: "+num3+"\n El tercer número es: "+num4+"\n El número cuarto es: "+num3);
                }
            }
        }else if (num1<num2 && num1<num3 && num1<num4){
            if (num4>num1 && num4<=num2 && num4<=num3){
                if (num3>num1 && num3<=num2 && num3>=num4){
                    if (num2>num1 && num2>=num3 && num2>=num4){
                        JOptionPane.showMessageDialog(null,"El primer número es: "+num1+"\n El segundo número es: "+num3+"\n El tercer número es: "+num2+"\n El número cuarto es: "+num4);
                    }
                }
            }
        }
        //caso 2
        if(num2<num1 && num2<num3 && num2<num4){
            if (num1>num2 && num1>=num3 && num1<=num4){
                if (num3>num1 && num3>=num2 && num3<=num4){
                    if (num4>num1 && num4>=num2 && num4>=num4){
                        JOptionPane.showMessageDialog(null,"El primer número es: "+num2+"\n El segundo número es: "+num1+"\n El tercer número es: "+num3+"\n El número cuarto es: "+num4);
                    }
                }
            }
        } else if (num2<num1 && num2<num3 && num2<num4){
            if (num1>num2 && num1>=num3 && num1<=num4){
                if (num3>num1 && num3>=num2 && num3<=num4){
                    if (num4<num1 && num4>=num2 && num4>=num3){
                        JOptionPane.showConfirmDialog(null,"El primer número es: "+num2+"\n El segundo número es: "+num3+"\n El tercer número es: "+num1+"\n El número cuarto es: "+num4);
                    }
                }
            }
        }
    }*/
    }
}
