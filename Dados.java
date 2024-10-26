/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Dados {
    //criar um array dinâmico do tipo MovimentoConta
   ArrayList<MovimentosConta> Movimentos=new ArrayList(); 
   
   //criar um método para inserir um movimento
   public void adicionarMovimento(MovimentosConta MC) {
       Movimentos.add(MC);
   }
   
   //criar um método para listar os movimentos
   public String listaMovimentos(){
       String Lista="";
       for(int i = 0; i<Movimentos.size();i++){
           MovimentosConta C=Movimentos.get(i);
           Lista+="\nNº Movimento:"+C.getNumeroMovimento()+
                  " | Data:"+C.getDataMovimento()+
                  " | Tipo:"+C.getTipoMovimento()+
                  " | Valor:"+C.getValorMovimento();
       }
       return(Lista);
   }
   
   public void apagarMovimento(int mov){
       Boolean existe=false;
       for(int i=0;i<Movimentos.size();i++){
           MovimentosConta C=Movimentos.get(i);
           if(C.getNumeroMovimento()==mov)
           {
               Movimentos.remove(i);
               existe=true;
               break;
           }
       }
       if (existe)
       {
           JOptionPane.showMessageDialog(null,
                   "Movimento eliminado",
                   "Movimentos de Conta",
                   JOptionPane.INFORMATION_MESSAGE);
       }
       else
       {
           JOptionPane.showMessageDialog(null,
                   "Movimento não existe",
                   "Movimentos de Conta",
                   JOptionPane.ERROR_MESSAGE);
       }
   }
   
   public void ai(){
       for(int i=0;i<Movimentos.size();i++){
           MovimentosConta C=Movimentos.get(i);
           C.setNumeroMovimento(i+1);
       }
   }
}
