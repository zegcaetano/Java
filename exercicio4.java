package pkg0816_p01;

import javax.swing.JOptionPane;


public class exercicio4 {

    
    public static void main(String[] args) 
    {
     int resposta = JOptionPane.showConfirmDialog(null, "Quer sair da aplica��o? (S/N)", "Sair", JOptionPane.YES_NO_OPTION);
     
     switch(resposta)
     {
         case 0 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em Yes", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         case 1 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em No", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         default -> JOptionPane.showMessageDialog(null, "O utilizador n�o clicou em nada, burro!", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
     }
        
    }

}
