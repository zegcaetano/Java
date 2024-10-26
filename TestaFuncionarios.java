
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
            escolha = JOptionPane.showOptionDialog(null, "Selecione a opção", "Funcionários", JOptionPane.DEFAULT_OPTION, 
                                                   JOptionPane.PLAIN_MESSAGE, null, menu, null);
            if (escolha == 2) break;

            switch (escolha) {
                case 0 -> {
                    int tipoEscolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de funcionário", "Inserir Funcionário", 
                                                                   JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
                                                                   tiposFuncionarios, null);
                    if (tipoEscolha == -1) break; 

                    String nome = JOptionPane.showInputDialog(null, "Insira o nome do funcionário:");
                    String tlm = JOptionPane.showInputDialog(null, "Insira o telefone do funcionário:");
                    String email = JOptionPane.showInputDialog(null, "Insira o email do funcionário:");
                    float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o salário do funcionário:"));

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
                            float premio = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do prémio de produtividade do financeiro: "));
                            Financeiros financeiro = new Financeiros(nome, tlm, email, salario, "Financeiro", premio);
                            listaFuncionarios.add(financeiro);
                            financeiro.DadosFinanceiros();
                            financeiro.calculaSalarioFinanceiros();
                        }
                    }
                }
                case 1 -> {
                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário registado.", "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Funcionarios f : listaFuncionarios) {
                            sb.append(f.RegistoFuncionario()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } while (true);
    }
    
}
