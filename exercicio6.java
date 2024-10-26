

package pkg0816_p01;

import javax.swing.JOptionPane;

public class exercicio6 {

    
    public static void main(String[] args) {
        int resposta, sim = 0;
        String msg;
        String[] perguntas = {"Então mas?","A sério?","Tens a certeza?","Quantos são?","Mas andamos aqui a brincar?"}; 
        
        do{
            sim=0;
        
        for (String x: perguntas)
        {
            resposta = JOptionPane.showConfirmDialog(null,x,"Inquérito", JOptionPane.YES_NO_OPTION); 
            if(resposta==0) sim++;
                 
        }
       switch(sim)
     {
         case 0 -> msg="Inocente";
         
         case 1 -> msg="Humm, tem algo a esconder";
         
         case 2 -> msg="Tem a mania que é esperto";
         
         case 3 -> msg="Este gajo é culpado";
         
         case 4 -> msg="Eish, caganda bico de obra";
         
         default -> msg="Ãn?";
     }
       JOptionPane.showMessageDialog(null, msg, "Veredicto", JOptionPane.INFORMATION_MESSAGE);
    }while(JOptionPane.showConfirmDialog(null,"Pressione YES para repetir o inquérito", "Sair", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);

}
}