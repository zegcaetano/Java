package pkg0816_p01;

import java.util.Random;
import javax.swing.JOptionPane;


public class aleatorio {

    
    public static void main(String[] args) {
       Random R = new Random();
       int contpc = 0;
       int contjog = 0;
       
       do{
       int pc = R.nextInt(0,3);//gera entra 1 e 3
       String[] opcoes = {"Pedra", "Papel", "Tesoura"};
       String resultado = "";
      
       
       int jogador = JOptionPane.showOptionDialog(null, "Select one:", "Let's play a game!",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
       
       if (jogador==pc)
            {
           resultado="O jogo ficou empatado.";
            }
       else if ((jogador==0) && (pc==2) ||
               (jogador==1) && (pc==0) ||
               (jogador==2) && (pc==1))
            {
           resultado="Parabéns, venceu ao pc! YES!!!!";
           contjog++;
            }
       else
           {
           resultado="Looooser! Esquece mãos de manteiga....";
           contpc++;
            }
       
       JOptionPane.showMessageDialog(null, "O pc jogou: "+opcoes[pc], "Jogada pc",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, resultado, "result",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, "resultado actual: \nPC: "+contpc+"\nEu: "+contjog, "resultado",JOptionPane.INFORMATION_MESSAGE);
    }while(JOptionPane.showConfirmDialog(null,"Pressione YES para jogar outra vez", "Sair", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
 }
}
