/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Vendedores extends Funcionarios{
    private float comissao;

public Vendedores(String nome,String tlm, String email, float salario, String classe, float comissao)
    {
        super(nome,tlm,email,salario,classe);
        this.comissao=comissao;
    }
public void DadosVendedores() 
        {
        DecimalFormat Ft=new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null,"Nome: " + super.getNome() + "\nTelefone : " + super.getTlm() +
                "\nEmail: " + super.getEmail() + 
                "\nSalário: " + Ft.format(super.getSalario()) + 
                "\nClasse: " + super.getClasse() +
                "\nComissão: " + this.comissao,
                "Classe Vendedores",JOptionPane.INFORMATION_MESSAGE);
        }
    public float getComissao() {
        return comissao;
    }


    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public void calculaSalarioVendedores() {
        float salarioTotal = super.getSalario() + (this.comissao * 0.05f);
        DecimalFormat Ft = new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null, "Salário Total (com comissão): " + Ft.format(salarioTotal), "Salário Vendedor", JOptionPane.INFORMATION_MESSAGE);
    }
}
