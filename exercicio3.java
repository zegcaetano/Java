package pkg0816_p01;

import javax.swing.JOptionPane;

/* solicitar ao user o nome e apelido e mostrar na seguinte sa�da:
apelido, nome.
*/

public class exercicio3 {

    
    public static void main(String[] args) {
       String msg;
       String nome = JOptionPane.showInputDialog(null, "Digite o 1� nome");
       String apelido = JOptionPane.showInputDialog(null, "Digite o seu apelido");
       JOptionPane.showMessageDialog(   null,     apelido+", "+nome+".","Apelido, Nome",JOptionPane.INFORMATION_MESSAGE);
                                       /*primeiro      mensagem             titulo da       estilo da mensagem
                                        argumento      principal             mensagem
         */
        msg = switch (nome) {
            case "Ana" -> "O seu nome � Ana.";
            case "Maria" -> "O seu nome � Maria.";
            default -> "N�o se chama Ana nem Maria";
        };
       JOptionPane.showMessageDialog(null, msg, "Compara��o de strings", JOptionPane.ERROR_MESSAGE);
    }  
}
