

package pkg0816_p01;

import javax.swing.JOptionPane;


public class exercicio5 {

    
    public static void main(String[] args) {
       String[] opcoes= {"Sim","N�o","Talvez","Quase de certeza","Nunca!"};
       
       int resposta = JOptionPane.showOptionDialog(null, "Quer sair do programa?", "Sair da aplica��o", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
        switch(resposta)
     {
         case 0 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em Sim", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         case 1 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em N�o", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         case 2 -> JOptionPane.showMessageDialog(null, "O utilizador clicou em Talvez", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         case 3 -> JOptionPane.showMessageDialog(null, "O utilizador n�o tem bem a certeza...", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         case 4 -> JOptionPane.showMessageDialog(null, "O utilizador nunca ir� sair da aplica��o", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
         
         default -> JOptionPane.showMessageDialog(null, "O utilizador n�o clicou em nada, burro!", "Sair da aplica��o", JOptionPane.INFORMATION_MESSAGE);
     }
    }

}
