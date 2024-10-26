
package pkg0816_heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DadosAnimais {
    ArrayList<Animais> ListaBichos = new ArrayList();
    
    public void AdicionarBicho(Animais Bicho){
      for(Animais B:ListaBichos){
          if (B.getIdBicho().equals(Bicho.getIdBicho())){
              JOptionPane.showMessageDialog(null, "Já existe um bicho com este ID!",
                      "Adicionar Bicho", JOptionPane.ERROR_MESSAGE);
              return;
          }
      }
      ListaBichos.add(Bicho);  
      JOptionPane.showMessageDialog(null, "Bicho adicionado à lista!",
                      "Adicionar Bicho", JOptionPane.INFORMATION_MESSAGE);
    }
    public void MostraBichos(){
        if(ListaBichos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem animais registados", "Classe animais", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            StringBuilder ListaAnimais = new StringBuilder("Lista de animais\n");
            for(Animais A:ListaBichos){
                ListaAnimais.append(A.RegistoBicho()).append("\n");
            }
            JOptionPane.showMessageDialog(null, ListaAnimais, "Classe Animais", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void MataBicho(String IdBicho){
        for(Animais A : ListaBichos){
            if(A.getIdBicho().equals(IdBicho)){
                ListaBichos.remove(A);
                JOptionPane.showMessageDialog(null, "Parabéns, acabou de matar um bicho...",
                        "Classe animais", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Bicho inexistente", 
                "Classe animais", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String DevolveBichos(){
        String Lista="";
        for(Animais A: ListaBichos)
        {
            Lista+=A.getIdBicho()+";"+
                    A.getNome()+";"+A.getCor()
                    +";"+A.getAmbiente()+";"+
                    A.getComprimento()+";"+
                    A.getVelocidade()+";"+
                    A.getPatas()+"\n";
        }
        return(Lista);
    }
}


