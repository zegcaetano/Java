
package Empresa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Administrativos extends Funcionarios{
    private int hExtra;

public Administrativos(String nome,String tlm, String email, float salario, String classe, int hExtra)
    {
        super(nome,tlm,email,salario,classe);
        this.hExtra=hExtra;
    }
    
    public void DadosAdministrativos() 
        {
        DecimalFormat Ft=new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null,"Nome: " + super.getNome() + "\nTelefone : " + super.getTlm() +
                "\nEmail: " + super.getEmail() + 
                "\nSalário: " + Ft.format(super.getSalario()) +
                "\nClasse: " + super.getClasse() +
                "\nHoras extra: " + this.hExtra,
                "Classe Vendedores",JOptionPane.INFORMATION_MESSAGE);
        }
    public int getHExtra() {
        return hExtra;
    }


    public void setHExtra(int hExtra) {
        this.hExtra = hExtra;
    }
    
    public void calculaSalarioAdministrativos() {
        float salarioTotal = super.getSalario() + (hExtra * 3.0f);
        DecimalFormat Ft = new DecimalFormat("0000.00 euros");
        JOptionPane.showMessageDialog(null, "Salário Total (com horas extras): " + Ft.format(salarioTotal), "Salário Administrativo", JOptionPane.INFORMATION_MESSAGE);
    }
}
