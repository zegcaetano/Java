/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.text.DecimalFormat;


public class Funcionarios {
    private String nome;
    private String tlm;
    private String email;
    private float salario; 
    private String classe;

    public Funcionarios (String nome,
            String tlm, String email,
            float salario, String classe)
    {
        this.nome = nome;
        this.tlm = tlm;
        this.email = email;
        this.salario = salario;
        this.classe = classe;
    }
    
    public String RegistoFuncionario() {
        DecimalFormat Ft=new DecimalFormat("0000.00 euros");
        return ("Nome: " + this.nome + " Telefone : " + this.tlm +
                " Email: " + this.email + 
                " Salário: " + Ft.format(this.salario)
                + " Classe: " + this.classe);
                
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTlm() {
        return tlm;
    }


    public void setTlm(String tlm) {
        this.tlm = tlm;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public float getSalario() {
        return salario;
    }

    
    public void setSalario(float salario) {
        this.salario = salario;
    }


    public String getClasse() {
        return classe;
    }


    public void setClasse(String tipo) {
        this.classe = tipo;
    }
}
