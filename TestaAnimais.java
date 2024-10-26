package pkg0816_heranca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class TestaAnimais 
{

    
    public static void main(String[] args) 
    {
       String[] menu = {"Inserir", "Listar", "Eliminar", "Exportar", "Importar", "Sair"};
       
       int escolha = 0;
       String IdBicho = "";
       DadosAnimais DA = new DadosAnimais();
       
       do
       {
          escolha = JOptionPane.showOptionDialog(null, "Selecione a opção",
                                                 "Animais", JOptionPane.YES_NO_OPTION, 
                                                 JOptionPane.PLAIN_MESSAGE, null, menu, null); 
          if(escolha==5)break;
          switch(escolha)
          {
          case 0 -> 
          {
              Pattern msk=Pattern.compile("^[A-Z]{2}-[0-9]{2}$");
              
              do{
              IdBicho=JOptionPane.showInputDialog(null, "Digita o id do bicho no formato: AA-99");
              Matcher Mat=msk.matcher(IdBicho);
              if(Mat.matches())
              {
                  System.out.println("Id Válido");
                  break;
              }
              else{
                  System.out.println("Id Inválido.");
                  }
                }while(true);
              String Nome=JOptionPane.showInputDialog(null, "Digite o nome do animal");
              String Cor=JOptionPane.showInputDialog(null, "Digite a cor do animal");
              String Ambiente=JOptionPane.showInputDialog(null, "Digite o ambiente do animal");
              float Comprimento=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o comprimento do animal em cm"));
              float Velocidade=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a velocidade do animal em m/s"));
              int Patas=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nr de patas do animal"));
              
              Animais A = new Animais(IdBicho, Nome, Cor, Ambiente, Comprimento, Velocidade, Patas);
              DA.AdicionarBicho(A);
            }
          case 1 -> DA.MostraBichos();
          case 2 -> 
          {
              IdBicho = JOptionPane.showInputDialog(null, "Digite o animal a aniquilar");
              DA.MataBicho(IdBicho);
          }
          case 3 ->{
              //guardar os dados num ficheiro csv
              try{
              FileOutputStream Fic = new FileOutputStream("bichos.csv");
              
              OutputStreamWriter Saida = new OutputStreamWriter(Fic);
              Saida.write(DA.DevolveBichos());
              Saida.close();
              JOptionPane.showMessageDialog(null, "Ficheiro csv criado com sucesso", "Exportar", JOptionPane.INFORMATION_MESSAGE);
                  }
              catch(Exception e){
                  JOptionPane.showMessageDialog(null, "Erro na criação do ficheiro csv", "Exportar", JOptionPane.ERROR_MESSAGE);
              }
          }
          case 4 ->{
              
                  //limpar o array ListaBichos
                  DA.ListaBichos.clear();
                  BufferedReader Ler;
             try{
                    Ler = new BufferedReader (new FileReader("bichos.csv"));
                    String Linha=Ler.readLine();
                  while(Linha!=null){
                    String[] V = Linha.split(";");
                    Animais A = new Animais(V[0],V[1],V[2],V[3],Float.parseFloat(V[4]),Float.parseFloat(V[5]),Integer.parseInt(V[6]));
                    
                    DA.AdicionarBicho(A);
                    Linha = Ler.readLine();
                }
                  Ler.close();
                  JOptionPane.showMessageDialog(null, "Importação efetuada", "Importar", JOptionPane.INFORMATION_MESSAGE);
             }
             catch(IOException e){
                 JOptionPane.showMessageDialog(null, "Erro ao ler o ficheiro csv", "Importar", JOptionPane.ERROR_MESSAGE);
                 
             }
          }
              
            }
       
    }while(true);
    

    }
}

