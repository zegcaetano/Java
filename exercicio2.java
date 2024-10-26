/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg0816_p01;

import javax.swing.JOptionPane;

/*caixas de diálogo
showInputDialog - Recer dados do utilizador
showMessageDialog - Mostrar a informação
*/

public class exercicio2 {

    
    public static void main(String[] args) {
        
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
       
        JOptionPane.showMessageDialog(null, "A soma é "+(num1+num2),"Soma",JOptionPane.INFORMATION_MESSAGE);
    }

}
