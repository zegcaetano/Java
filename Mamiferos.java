/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0816_heranca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Mamiferos extends Animais {
    private String Alimento;
    
    public Mamiferos(String idBicho, String nome, String cor, String ambiente, float comprimento, float velocidade, int patas, String Alimento)
    {
        super(idBicho,nome,cor,ambiente,comprimento,velocidade,patas);
        this.Alimento=Alimento;
    }

    public void DadosMamiferos()
   {
       DecimalFormat Ft=new DecimalFormat("0.00 cm");
       DecimalFormat Ft1=new DecimalFormat("0.00 ms");
       JOptionPane.showMessageDialog(null, "Id Bicho: "+super.getIdBicho()+
               "\nNome: "+super.getNome()+"\nCor: "+super.getCor()+
               "\nAmbiente: "+super.getAmbiente()+"\nComprimento: "+
               Ft.format(super.getComprimento())+"\nVelocidade: "+
               Ft1.format(super.getVelocidade())+"\nPatas: "+
               super.getPatas()+"\nAlimento: "+this.Alimento,
               "Classe Mamiferos",JOptionPane.INFORMATION_MESSAGE);
               
   }
    public String getAlimento() {
        return Alimento;
    }


    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }
}
