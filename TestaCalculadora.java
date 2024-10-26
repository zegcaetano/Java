
package t03;

import javax.swing.JOptionPane;
import pkg0816_classes.Dimensao;


public class TestaCalculadora {

    
    public static void main(String[] args) {
    String[] Operadores = {"+","-","*","/","Sair"};
    int Escolha = 0;
    Calculadora O=new Calculadora();
       do
       {  
           Escolha = JOptionPane.showOptionDialog(null, "A operação que deseja realizar", 
                                    "Classe Calculadora", 
                                    JOptionPane.YES_NO_CANCEL_OPTION, 
                                    JOptionPane.PLAIN_MESSAGE, 
                                    null, Operadores, null);
       
            O.setOp(Operadores[Escolha]);
            
            if (Escolha == 4) {
                JOptionPane.showMessageDialog(null, "XAU!", "Despedida", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
       do
       {   
            try
            {
            O.setNum1(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do primeiro número: ")));
            break;
            }
            catch(NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Num1", JOptionPane.ERROR_MESSAGE);
            }
       }while(true); 
       
       do
       {
            try
            {
            O.setNum2(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do segundo número: ")));
            break;
            }
            catch(NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Num2", JOptionPane.ERROR_MESSAGE);
            }
       }while(true);
       
   
        JOptionPane.showMessageDialog(null,
        O.getNum1() +" "+ O.getOp()+" "+ O.getNum2() +" = " +O.Operacao(), 
        O.getOp(),
        JOptionPane.INFORMATION_MESSAGE);
   
       
      
    }while(Escolha!=4);
}
}
       
       
    
    
    
    

        

