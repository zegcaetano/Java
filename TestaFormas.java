package pkg0816_classes;

import javax.swing.JOptionPane;


public class TestaFormas {

    
    public static void main(String[] args) {
       String[] Formas = {"Tri�ngulo", "Rect�ngulo", "Quadrado", "Terminar"};
       int Escolha = 0;
       do{
       Escolha = JOptionPane.showOptionDialog(null, "Escolha a forma geom�trica para calcular a sua �rea", 
                                    "Classe Dimens�o", 
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
                     JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Altura", JOptionPane.ERROR_MESSAGE);
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
                     JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Altura", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "ladomaior", JOptionPane.ERROR_MESSAGE);
                }
                }while(true);   
    
            do{
                try{
                    F.setBase(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do lado menor (cm)")));
                    break;
                   }
                catch(NumberFormatException e)
                {
                 JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "base", JOptionPane.ERROR_MESSAGE);
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
                 JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "ladomaior", JOptionPane.ERROR_MESSAGE);
                 }
                 }while(true);      
            }
           
                
               
               
        }
        if (Escolha!=3)
        JOptionPane.showMessageDialog(null,
        "A �rea do "+F.getTipo()+" � "+(F.Area()), 
        "�rea do "+F.getTipo(),
        JOptionPane.INFORMATION_MESSAGE);
        else
        JOptionPane.showMessageDialog(null,
        "XAU!", "Despedida", JOptionPane.INFORMATION_MESSAGE);     
            
       }while(Escolha!=3);
       
    }

}
