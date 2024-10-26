package pkg0816_p01;

import javax.swing.JOptionPane;


public class exercicio4 {

    
    public static void main(String[] args) 
    {
     int resposta = JOptionPane.showConfirmDialog(null, "Quer sair da aplicação? (S/N)", "Sair", JOptionPane.YES_NO_OPTION);
     
     switch(resposta)
     {
         case 0 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em Yes", "Sair da aplicação", JOptionPane.INFORMATION_MESSAGE);
         
         case 1 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em No", "Sair da aplicação", JOptionPane.INFORMATION_MESSAGE);
         
         default -> JOptionPane.showMessageDialog(null, "O utilizador não clicou em nada, burro!", "Sair da aplicação", JOptionPane.INFORMATION_MESSAGE);
     }
        
    }

}
