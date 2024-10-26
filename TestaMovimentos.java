package Dados;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class TestaMovimentos {

    
    public static void main(String[] args) {
      String[] opcoes ={"Inserir movimento",
                        "Listar movimentos",
                        "Eliminar movimento",
                        "Sair"}; 
      String[] operacao = {"Levantamento",
                           "Depósito"};
      int escolha=0;
      Dados D = new Dados();
      do{
          escolha = JOptionPane.showOptionDialog(null, 
                  "Selecione a sua opção", 
                  "Movimentos de Conta", 
                  JOptionPane.YES_NO_OPTION, 
                  JOptionPane.PLAIN_MESSAGE, 
                  null, opcoes, null);
         
          switch(escolha){
              case 0 ->{
                  String Data=JOptionPane.showInputDialog(null,
                          "Digite a data no formato dd/mm/yyyy");
                  String Tipo=(String)JOptionPane.showInputDialog(null,
                          "Selecione o tipo de movimento",
                          "Movimentos de Conta",
                          JOptionPane.INFORMATION_MESSAGE,
                          null, operacao, null);
                  float valor=Float.parseFloat(JOptionPane.
                          showInputDialog("Digite o valor do movimento"));
                  
                  //criar um objecto da classe movimentosConta
                  MovimentosConta M=new MovimentosConta();
                  
                  int nmov=D.Movimentos.size()+1;
                  M.setNumeroMovimento(nmov);M.setDataMovimento(Data);
                  M.setTipoMovimento(Tipo);M.setValorMovimento(valor);
                  D.adicionarMovimento(M);
                  
                  JOptionPane.showMessageDialog(null, 
                          "Movimento Registado",
                          "Movimentos de Conta",
                          JOptionPane.INFORMATION_MESSAGE);
                }
                  case 1 ->{
                  JOptionPane.showMessageDialog(null,
                  D.listaMovimentos(),
                  "Movimentos de Conta",
                  JOptionPane.INFORMATION_MESSAGE);             
                    }
                  case 2 ->{
                  int nm=Integer.parseInt(JOptionPane.showInputDialog(null,
                          "Digite o nr de movimento a eliminar"));
                  
                  D.apagarMovimento(nm);
                  D.ai();
                  
                  
                  }
          }
          
        }while(escolha!=3);
    }
}
