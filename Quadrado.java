
package pkg0816_classes;

import javax.swing.JOptionPane;


public class Quadrado {

    
    public static void main(String[] args) {
    Dimensao Quadrado=new Dimensao();
    do{
        try{
            Quadrado.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado (cm)")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "ladomaior", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);   
    
    Quadrado.setTipo("Quadrado");
           
    JOptionPane.showMessageDialog(null, "O valor da área do "+ Quadrado.getTipo()+ "é "+Quadrado.Area()+ " cm2.", "jogador",JOptionPane.INFORMATION_MESSAGE);
       
       
    }

}
