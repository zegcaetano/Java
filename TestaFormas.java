package pkg0816_classes;

import javax.swing.JOptionPane;


public class TestaFormas {

    
    public static void main(String[] args) {
       String[] Formas = {"Triângulo", "Rectângulo", "Quadrado", "Terminar"};
       int Escolha = 0;
       do{
       Escolha = JOptionPane.showOptionDialog(null, "Escolha a forma geométrica para calcular a sua àrea", 
                                    "Classe Dimensão", 
                                    JOptionPane.YES_NO_CANCEL_OPTION, 
                                    JOptionPane.PLAIN_MESSAGE, 
                                    null, Formas, null);
       Dimensao F=new Dimensao();
       F.setTipo(Formas[Escolha]);
       switch (Escolha)
       {
           case 0 ->
           {
                 do
                 {
                    try
                    {
                        F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da altura")));
                        break;
                    }
                    catch(NumberFormatException e)
                    {
                     JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
                    }
                  }while(true);   

                 do
                 {
                    try
                    {
                         F.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da base")));
                        break;
                    }
                    catch(NumberFormatException e)
                    {
                     JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
                    }
                  }while(true);  
            }
            case 1 ->
            {
            do{
                try{
                    F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado maior (cm)")));
                    break;
                   }
                catch(NumberFormatException e)
                {
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "ladomaior", JOptionPane.ERROR_MESSAGE);
                }
                }while(true);   
    
            do{
                try{
                    F.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado menor (cm)")));
                    break;
                   }
                catch(NumberFormatException e)
                {
                 JOptionPane.showMessageDialog(null, "Deve inserir um número", "base", JOptionPane.ERROR_MESSAGE);
                }
                }while(true);  
               }
            case 2 ->
            {
             do{
                try{
                    F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado (cm)")));
                    break;
                    }
                catch(NumberFormatException e)
                 {
                 JOptionPane.showMessageDialog(null, "Deve inserir um número", "ladomaior", JOptionPane.ERROR_MESSAGE);
                 }
                 }while(true);      
            }
           
                
               
               
        }
        if (Escolha!=3)
        JOptionPane.showMessageDialog(null,
        "A àrea do "+F.getTipo()+" é "+(F.Area()), 
        "Área do "+F.getTipo(),
        JOptionPane.INFORMATION_MESSAGE);
        else
        JOptionPane.showMessageDialog(null,
        "XAU!", "Despedida", JOptionPane.INFORMATION_MESSAGE);     
            
       }while(Escolha!=3);
       
    }

}
