

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
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "ladomaior", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);   
    
    do{
        try{
            Rectangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado menor (cm)")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "base", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);  
    
    Rectangulo.setTipo("Rect�ngulo");
   
       
    JOptionPane.showMessageDialog(null, "O valor da �rea do "+Rectangulo.getTipo()+" � igual a "+Rectangulo.Area()+" cm2.", "jogador",JOptionPane.INFORMATION_MESSAGE);
       
    }

}
