
package t03;

import javax.swing.JOptionPane;


public class TestaCalculadora_v2 {

   
    public static void main(String[] args) {
        
           
    String[] Operadores = {"+","-","*","/","Sair"};
    int Escolha = 0;
    Calculadora_v2 O=new Calculadora_v2();
       do
       {  
           Escolha = JOptionPane.showOptionDialog(null, "Escolha a opera��o que deseja realizar", 
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
            O.setNum1(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do primeiro n�mero: ")));
            break;
            }
            catch(NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Num1", JOptionPane.ERROR_MESSAGE);
            }
       }while(true); 
       
       do
       {
            try
            {
            O.setNum2(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do segundo n�mero: ")));
            break;
            }
            catch(NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Num2", JOptionPane.ERROR_MESSAGE);
            }
       }while(true);
       
       
       float resultado = 0;
       switch(O.getOp())
       {
           case "+":
           {
           resultado = O.Soma();
           break;
           }
           case "-":
           {
           resultado = O.Subtracao();
           break;
           }
           case "*":
           {
           resultado = O.Multiplicacao();
           break;
           }
           case "/":
           {
           resultado = O.Divisao();
           break;
           }
               
       }
       JOptionPane.showMessageDialog(null,
        O.getNum1() +" "+ O.getOp()+" "+ O.getNum2() +" = " +resultado, 
        O.getOp(),
        JOptionPane.INFORMATION_MESSAGE);
       }while(Escolha!=4);
    }
    
}

