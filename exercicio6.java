

package pkg0816_p01;

import javax.swing.JOptionPane;

public class exercicio6 {

    
    public static void main(String[] args) {
        int resposta, sim = 0;
        String msg;
        String[] perguntas = {"Ent�o mas?","A s�rio?","Tens a certeza?","Quantos s�o?","Mas andamos aqui a brincar?"}; 
        
        do{
            sim=0;
        
        for (String x: perguntas)
        {
            resposta = JOptionPane.showConfirmDialog(null,x,"Inqu�rito", JOptionPane.YES_NO_OPTION); 
            if(resposta==0) sim++;
                 
        }
       switch(sim)
     {
         case 0 -> msg="Inocente";
         
         case 1 -> msg="Humm, tem algo a esconder";
         
         case 2 -> msg="Tem a mania que � esperto";
         
         case 3 -> msg="Este gajo � culpado";
         
         case 4 -> msg="Eish, caganda bico de obra";
         
         default -> msg="�n?";
     }
       JOptionPane.showMessageDialog(null, msg, "Veredicto", JOptionPane.INFORMATION_MESSAGE);
    }while(JOptionPane.showConfirmDialog(null,"Pressione YES para repetir o inqu�rito", "Sair", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);

}
}