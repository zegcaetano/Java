
package Empresa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestaFuncionarios {


    public static void main(String[] args) {
      String[] menu = {"Inserir", "Listar", "Sair"};
        String[] tiposFuncionarios = {"Vendedor", "Administrativo", "Financeiro"};
        int escolha = 0;

        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();

        do {
            escolha = JOptionPane.showOptionDialog(null, "Selecione a op��o", "Funcion�rios", JOptionPane.DEFAULT_OPTION, 
                                                   JOptionPane.PLAIN_MESSAGE, null, menu, null);
            if (escolha == 2) break;

            switch (escolha) {
                case 0 -> {
                    int tipoEscolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de funcion�rio", "Inserir Funcion�rio", 
                                                                   JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
                                                                   tiposFuncionarios, null);
                    if (tipoEscolha == -1) break; 

                    String nome = JOptionPane.showInputDialog(null, "Insira o nome do funcion�rio:");
                    String tlm = JOptionPane.showInputDialog(null, "Insira o telefone do funcion�rio:");
                    String email = JOptionPane.showInputDialog(null, "Insira o email do funcion�rio:");
                    float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o sal�rio do funcion�rio:"));

                    switch (tipoEscolha) {
                        case 0 -> {
                            float comissao = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor das vendas do vendedor: "));
                            Vendedores vendedor = new Vendedores(nome, tlm, email, salario, "Vendedor", comissao);
                            listaFuncionarios.add(vendedor);
                            vendedor.DadosVendedores();
                            vendedor.calculaSalarioVendedores();
                        }
                        case 1 -> {
                            int horasExtras = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor das horas extras do administrativo: "));
                            Administrativos administrativo = new Administrativos(nome, tlm, email, salario, "Administrativo", horasExtras);
                            listaFuncionarios.add(administrativo);
                            administrativo.DadosAdministrativos();
                            administrativo.calculaSalarioAdministrativos();
                        }
                        case 2 -> {
                            float premio = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do pr�mio de produtividade do financeiro: "));
                            Financeiros financeiro = new Financeiros(nome, tlm, email, salario, "Financeiro", premio);
                            listaFuncionarios.add(financeiro);
                            financeiro.DadosFinanceiros();
                            financeiro.calculaSalarioFinanceiros();
                        }
                    }
                }
                case 1 -> {
                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcion�rio registado.", "Lista de Funcion�rios", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Funcionarios f : listaFuncionarios) {
                            sb.append(f.RegistoFuncionario()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Funcion�rios", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } while (true);
    }
    
}
