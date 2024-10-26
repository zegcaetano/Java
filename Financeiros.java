/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author zegca
 */
public class Financeiros extends Funcionarios{
    private float pProd;

public Financeiros(String nome,String tlm, String email, float salario, String classe, float pProd)
    {
        super(nome,tlm,email,salario,classe);
        this.pProd=pProd;
    }
    
    public void DadosFinanceiros() 
        {
        DecimalFormat Ft=new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null,"Nome: " + super.getNome() + "\nTelefone : " + super.getTlm() +
                "\nEmail: " + super.getEmail() + 
                "\nSalário: " + Ft.format(super.getSalario()) +
                "\nClasse: " + super.getClasse() +
                "\nPrémio: " + this.pProd,
                "Classe Vendedores",JOptionPane.INFORMATION_MESSAGE);
        }
    public float getpProd() {
        return pProd;
    }


    public void setpProd(float pProd) {
        this.pProd = pProd;
    }
    
    public void calculaSalarioFinanceiros() {
        float salarioTotal = super.getSalario() + pProd;
        DecimalFormat Ft = new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null, "Salário Total (com prémio): " + Ft.format(salarioTotal), "Salário Financeiro", JOptionPane.INFORMATION_MESSAGE);
    }
}
