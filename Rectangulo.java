

package pkg0816_classes;

import javax.swing.JOptionPane;


public class Rectangulo {

    
    public static void main(String[] args) {
             Dimensao Rectangulo=new Dimensao();
    do{
        try{
            Rectangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado maior (cm)")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "ladomaior", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);   
    
    do{
        try{
            Rectangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado menor (cm)")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "base", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);  
    
    Rectangulo.setTipo("Rectângulo");
   
       
    JOptionPane.showMessageDialog(null, "O valor da área do "+Rectangulo.getTipo()+" é igual a "+Rectangulo.Area()+" cm2.", "jogador",JOptionPane.INFORMATION_MESSAGE);
       
    }

}
