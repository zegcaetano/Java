/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0816_heranca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Formando Tarde
 */
public class Peixes extends Animais{
    private String Caracteristicas;

    
    
    public String getCaracteristicas() {
        return Caracteristicas;
    }

   public Peixes(String idBicho, String nome, String cor, String ambiente, float comprimento, float velocidade, int patas, String Caracteristicas)
    {
        super(idBicho,nome,cor,ambiente,comprimento,velocidade,patas);
        this.Caracteristicas=Caracteristicas;
    }
   
   public void DadosPeixe()
   {
       DecimalFormat Ft=new DecimalFormat("0.00 cm");
       DecimalFormat Ft1=new DecimalFormat("0.00 ms");
       JOptionPane.showMessageDialog(null, "Id Bicho: "+super.getIdBicho()+
               "\nNome: "+super.getNome()+"\nCor: "+super.getCor()+
               "\nAmbiente: "+super.getAmbiente()+"\nComprimento: "+
               Ft.format(super.getComprimento())+"\nVelocidade: "+
               Ft1.format(super.getVelocidade())+"\nPatas: "+
               super.getPatas()+"\nCaracteristicas: "+this.Caracteristicas,
               "Classe Peixes",JOptionPane.INFORMATION_MESSAGE);
               
   }
    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }
    
}
