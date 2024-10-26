package pkg0816_classes;

import javax.swing.JOptionPane;


public class Triangulo 
{

    
    public static void main(String[] args) 
    {
       Dimensao Triangulo=new Dimensao();
    do{
        try{
            Triangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da altura")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);   
    
    do{
        try{
            Triangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da base")));
            break;
           }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
        }
    }while(true);  
    
    Triangulo.setTipo("Triângulo");
  
       
    JOptionPane.showMessageDialog(null, "O valor da área do "+Triangulo.getTipo()+" é: "+Triangulo.Area()+" m2.", "jogador",JOptionPane.INFORMATION_MESSAGE);
       
    

    }
}
